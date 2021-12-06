package com.example.propert_app.fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.propert_app.Api.Api;
import com.example.propert_app.Api.RetrofitInstance;
import com.example.propert_app.R;
import com.example.propert_app.activity.add_property.AddPropertyOneActivity;
import com.example.propert_app.adapter.CategoryAdapter;
import com.example.propert_app.adapter.HorizontalAdapter;
import com.example.propert_app.model.HomeModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragments extends Fragment {
    Button btn_list_property;
    RecyclerView rv_category,recyclerView;
    ImageSlider imageSlider;
    public HomeFragments() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);
         recyclerView = view.findViewById(R.id.recycler_view);
        rv_category = view.findViewById(R.id.rv_cateogry);
        imageSlider = view.findViewById(R.id.image_slider);

        List<SlideModel> imageList = new ArrayList<>();
        imageList.add(new SlideModel("https://bit.ly/2YoJ77H", ScaleTypes.FIT));
        imageList.add(new SlideModel("https://bit.ly/2YoJ77H", ScaleTypes.FIT));
        imageList.add(new SlideModel("https://bit.ly/2YoJ77H", ScaleTypes.FIT));

        imageSlider.setImageList(imageList);

        btn_list_property = view.findViewById(R.id.btn_list_property);
        btn_list_property.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
//               getContext().getFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.framelayout, new SearchFragment())
//                        .commit();
////                startActivity(new Intent(getContext(), Filt.class));
            }
        });

        getHomeData();

        return view;
    }

    private void getHomeData() {

        Api service = RetrofitInstance.getRetrofitInstance().create(Api.class);
//        String bear = "Bearer";
//        String authorized = bear + " " + AppData.ACCESS_TOKEN;
//        String val = "application/json";
        Call<HomeModel> call = service.getHomeData();
        call.enqueue(new Callback<HomeModel>() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onResponse(Call<HomeModel> call, Response<HomeModel> response) {


                if (response.isSuccessful()) {
                    Log.d("response",response.toString());
                    rv_category.setLayoutManager(new GridLayoutManager(getContext(), 4));

                    assert response.body() != null;
                    CategoryAdapter categoryAdapter = new CategoryAdapter(getContext(), (ArrayList<HomeModel.Category>) response.body().data.categories);
                    rv_category.setAdapter(categoryAdapter);

                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

                    HorizontalAdapter adapter = new HorizontalAdapter(getContext(), response.body().data.properties);
                    recyclerView.setAdapter(adapter);
                } else {


                    Toast.makeText(getContext(), "some thing when wrong", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<HomeModel> call, Throwable t) {

                Log.d("data", t.toString());

            }
        });
    }
}
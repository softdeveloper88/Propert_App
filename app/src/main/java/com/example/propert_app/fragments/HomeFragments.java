package com.example.propert_app.fragments;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.propert_app.R;
import com.example.propert_app.activity.add_property.AddPropertyOneActivity;
import com.example.propert_app.adapter.CategoryAdapter;
import com.example.propert_app.adapter.HorizontalAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class HomeFragments extends Fragment {
    Button btn_list_property;

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
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        RecyclerView rv_category = view.findViewById(R.id.rv_cateogry);
        FloatingActionButton floatingActionButton=view.findViewById(R.id.floatingActionButton);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             startActivity(new Intent(getContext(), AddPropertyOneActivity.class));

            }
        });
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
        rv_category.setLayoutManager(new GridLayoutManager(getContext(),4));

        ArrayList<String> list1 = new ArrayList<>();

        CategoryAdapter categoryAdapter = new CategoryAdapter(getContext(), list1);
        rv_category.setAdapter(categoryAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        ArrayList<String> list = new ArrayList<>();
        list.add("dd");
        list.add("dd");
        list.add("dd");
        list.add("dd");
        list.add("dd");
        HorizontalAdapter adapter = new HorizontalAdapter(getContext(), list);
        recyclerView.setAdapter(adapter);
        return view;
    }

}
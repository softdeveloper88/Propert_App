package com.example.propert_app.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.propert_app.Api.Api;
import com.example.propert_app.Api.RetrofitInstance;
import com.example.propert_app.R;
import com.example.propert_app.adapter.AllCategoryAdapter;
import com.example.propert_app.adapter.SubCategoryAdapter;
import com.example.propert_app.model.CategoryModel;
import com.example.propert_app.model.SubCategoryModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AllCategoryActivity extends AppCompatActivity {
    int id;
    RecyclerView rv_category;
    TextView tv_title;
    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_category);
        tv_title=findViewById(R.id.tv_title);
        rv_category = findViewById(R.id.recycler_view);
        btnBack=findViewById(R.id.btnBack);
        if (getIntent().getStringExtra("activity").equals( "subcategory")) {

            tv_title.setText("Sub Categories");
            id = getIntent().getIntExtra("id", 0);
            btnBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(AllCategoryActivity.this, AllCategoryActivity.class).putExtra("activity","category"));
                    finish();

                }
            });

            getSubCategory(id);

        } else {
            tv_title.setText("All Categories");
            getAllCategory();
            btnBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    startActivity(new Intent(AllCategoryActivity.this, DashboardActivity.class));
                    finish();

                }
            });
        }
    }


    private void getAllCategory() {

        Api service = RetrofitInstance.getRetrofitInstance().create(Api.class);
//        String bear = "Bearer";
//        String authorized = bear + " " + AppData.ACCESS_TOKEN;
//        String val = "application/json";
        Call<CategoryModel> call = service.getAllCategories();
        call.enqueue(new Callback<CategoryModel>() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onResponse(Call<CategoryModel> call, Response<CategoryModel> response) {


                if (response.isSuccessful()) {
                    Log.d("response", response.toString());
                    rv_category.setLayoutManager(new GridLayoutManager(AllCategoryActivity.this, 4));

                    assert response.body() != null;
                    AllCategoryAdapter adapter = new AllCategoryAdapter(AllCategoryActivity.this, response.body().data.categories);
                    rv_category.setAdapter(adapter);
                } else {


                    Toast.makeText(AllCategoryActivity.this, "some thing when wrong", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<CategoryModel> call, Throwable t) {

                Log.d("data", t.toString());

            }
        });
    }

    private void getSubCategory(int id) {

        Api service = RetrofitInstance.getRetrofitInstance().create(Api.class);
//        String bear = "Bearer";
//        String authorized = bear + " " + AppData.ACCESS_TOKEN;
//        String val = "application/json";
        Call<SubCategoryModel> call = service.getSubCategoryData(id);
        call.enqueue(new Callback<SubCategoryModel>() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onResponse(Call<SubCategoryModel> call, Response<SubCategoryModel> response) {


                if (response.isSuccessful()) {
                    Log.d("response", response.toString());
                    rv_category.setLayoutManager(new GridLayoutManager(AllCategoryActivity.this, 4));

                    assert response.body() != null;
                    SubCategoryAdapter adapter = new SubCategoryAdapter(AllCategoryActivity.this, response.body().data.subCategories);
                    rv_category.setAdapter(adapter);
                } else {


                    Toast.makeText(AllCategoryActivity.this, "some thing when wrong", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<SubCategoryModel> call, Throwable t) {

                Log.d("data", t.toString());

            }
        });
    }

}
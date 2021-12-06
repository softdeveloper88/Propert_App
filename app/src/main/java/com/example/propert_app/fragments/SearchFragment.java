package com.example.propert_app.fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import com.example.propert_app.Api.Api;
import com.example.propert_app.Api.RetrofitInstance;
import com.example.propert_app.R;
import com.example.propert_app.activity.PropertyFilterActivity;
import com.example.propert_app.adapter.ResultAdapter;
import com.example.propert_app.model.HomeModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchFragment extends Fragment {
    LinearLayout filter_layout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_filter, container, false);

        RecyclerView recyclerView1 = view.findViewById(R.id.result_recyclerview);

        filter_layout = view.findViewById(R.id.filter_layout);
        filter_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), PropertyFilterActivity.class));
            }
        });


        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("saqib");
        arrayList.add("saqib");
        arrayList.add("saqib");
        arrayList.add("saqib");
        ResultAdapter resultAdapter = new ResultAdapter(getContext(), arrayList);
        recyclerView1.setAdapter(resultAdapter);
        return view;
    }


}
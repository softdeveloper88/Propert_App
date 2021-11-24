package com.example.propert_app.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.propert_app.R;
import com.example.propert_app.activity.PropertTypeActivity;

import java.util.ArrayList;

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
                startActivity(new Intent(getContext(), PropertTypeActivity.class));
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
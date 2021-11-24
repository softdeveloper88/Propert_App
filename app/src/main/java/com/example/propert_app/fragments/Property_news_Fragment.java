package com.example.propert_app.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.propert_app.R;
import com.example.propert_app.adapter.Screen_Thirteen_Adapter;

import java.util.ArrayList;

public class Property_news_Fragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_property_news_, container, false);
        RecyclerView recyclerView=view.findViewById(R.id.recycler_view_property_news_fragment);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("niazi");
        arrayList.add("niazi");
        arrayList.add("niazi");
        arrayList.add("niazi");
        arrayList.add("niazi");
        arrayList.add("niazi");
        Screen_Thirteen_Adapter screen_thirteen_adapter=new Screen_Thirteen_Adapter(getContext(),arrayList);
        recyclerView.setAdapter(screen_thirteen_adapter);
        return view;
    }
}
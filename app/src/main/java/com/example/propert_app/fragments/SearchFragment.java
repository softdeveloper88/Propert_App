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
import com.example.propert_app.activity.AllPostActivity;
import com.example.propert_app.activity.PropertyFilterActivity;
import com.example.propert_app.adapter.ResultAdapter;
import com.example.propert_app.model.HomeModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.propert_app.R;

public class SearchFragment extends Fragment {
    TextView for_rent,for_sale,txt_house,txt_apartments,txt_commercial,txt_villa,
            txt_condominuim,txt_penthouse,txt_bedroom1,txt_bedroom2,txt_bedroom3,txt_bedroom4
            ,txt_bathroom1,txt_bathroom2,txt_bathroom3,txt_bathroom4;
    Button btn_show_properties;

    public SearchFragment() {

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View viewFilter = inflater.inflate(R.layout.activity_propert_type, container, false);
        init(viewFilter);



        return  viewFilter;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn_show_properties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), AllPostActivity.class));
            }
        });

        txt_house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt_house.isClickable()){
                    txt_house.setBackgroundResource(R.drawable.rectangle_1585);
                    txt_apartments.setBackgroundResource(R.drawable.rectangle_1586);
                    txt_commercial.setBackgroundResource(R.drawable.rectangle_1586);
                }

            }
        });
        txt_apartments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt_apartments.isClickable()) {
                    txt_house.setBackgroundResource(R.drawable.rectangle_1586);
                    txt_apartments.setBackgroundResource(R.drawable.rectangle_1585);
                    txt_commercial.setBackgroundResource(R.drawable.rectangle_1586);
                }
            }
        });
        txt_commercial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt_commercial.isClickable()){
                    txt_house.setBackgroundResource(R.drawable.rectangle_1586);
                    txt_apartments.setBackgroundResource(R.drawable.rectangle_1586);
                    txt_commercial.setBackgroundResource(R.drawable.rectangle_1585);
                }
            }
        });
        txt_penthouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt_penthouse.isClickable()){
                    txt_villa.setBackgroundResource(R.drawable.rectangle_1586);
                    txt_condominuim.setBackgroundResource(R.drawable.rectangle_1586);
                    txt_penthouse.setBackgroundResource(R.drawable.rectangle_1585);
                }
            }
        });
        txt_condominuim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt_condominuim.isClickable()){
                    txt_villa.setBackgroundResource(R.drawable.rectangle_1586);
                    txt_condominuim.setBackgroundResource(R.drawable.rectangle_1585);
                    txt_penthouse.setBackgroundResource(R.drawable.rectangle_1586);
                }
            }
        });
        txt_villa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt_villa.isClickable()){
                    txt_villa.setBackgroundResource(R.drawable.rectangle_1585);
                    txt_condominuim.setBackgroundResource(R.drawable.rectangle_1586);
                    txt_penthouse.setBackgroundResource(R.drawable.rectangle_1586);
                }
            }
        });
        for_sale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (for_sale.isClickable()){
                    for_sale.setBackgroundResource(R.drawable.rectangle_1582);
                    for_rent.setBackgroundResource(R.drawable.rectangle_1583);
                }
            }
        });
        for_rent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (for_rent.isClickable()){
                    for_sale.setBackgroundResource(R.drawable.rectangle_1583);
                    for_rent.setBackgroundResource(R.drawable.rectangle_1582);
                }
            }
        });
        txt_bedroom1.setOnClickListener(new View.OnClickListener() {
            private  boolean statechanged;
            @Override
            public void onClick(View v) {
                if (statechanged){
                    txt_bedroom1.setBackgroundResource(R.drawable.rectangle_1591saqi);
                    txt_bedroom1.setTextColor(Color.WHITE);
                }
                else {
                    txt_bedroom1.setBackgroundResource(R.drawable.rectangle_1591saq);
                    txt_bedroom1.setTextColor(Color.BLACK);
                }
                statechanged=!statechanged;


            }
        });
        txt_bedroom2.setOnClickListener(new View.OnClickListener() {
            private  boolean statechanged;
            @Override
            public void onClick(View v) {
                if (statechanged){
                    txt_bedroom2.setBackgroundResource(R.drawable.rectangle_1591saqi);
                    txt_bedroom2.setTextColor(Color.WHITE);
                }
                else {
                    txt_bedroom2.setBackgroundResource(R.drawable.rectangle_1591saq);
                    txt_bedroom2.setTextColor(Color.BLACK);
                }
                statechanged=!statechanged;


            }
        });
        txt_bedroom3.setOnClickListener(new View.OnClickListener() {
            private  boolean statechanged;
            @Override
            public void onClick(View v) {
                if (statechanged){
                    txt_bedroom3.setBackgroundResource(R.drawable.rectangle_1591saqi);
                    txt_bedroom3.setTextColor(Color.WHITE);
                }
                else {
                    txt_bedroom3.setBackgroundResource(R.drawable.rectangle_1591saq);
                    txt_bedroom3.setTextColor(Color.BLACK);
                }
                statechanged=!statechanged;


            }
        });
        txt_bedroom4.setOnClickListener(new View.OnClickListener() {
            private  boolean statechanged;
            @Override
            public void onClick(View v) {
                if (statechanged){
                    txt_bedroom4.setBackgroundResource(R.drawable.rectangle_1591saqi);
                    txt_bedroom4.setTextColor(Color.WHITE);
                }
                else {
                    txt_bedroom4.setBackgroundResource(R.drawable.rectangle_1591saq);
                    txt_bedroom4.setTextColor(Color.BLACK);
                }
                statechanged=!statechanged;


            }
        });
        txt_bathroom1.setOnClickListener(new View.OnClickListener() {
            private  boolean statechanged;
            @Override
            public void onClick(View v) {
                if (statechanged){
                    txt_bathroom1.setBackgroundResource(R.drawable.rectangle_1591saqi);
                    txt_bathroom1.setTextColor(Color.WHITE);
                }
                else {
                    txt_bathroom1.setBackgroundResource(R.drawable.rectangle_1591saq);
                    txt_bathroom1.setTextColor(Color.BLACK);
                }
                statechanged=!statechanged;


            }
        });
        txt_bathroom2.setOnClickListener(new View.OnClickListener() {
            private  boolean statechanged;
            @Override
            public void onClick(View v) {
                if (statechanged){
                    txt_bathroom2.setBackgroundResource(R.drawable.rectangle_1591saqi);
                    txt_bathroom2.setTextColor(Color.WHITE);
                }
                else {
                    txt_bathroom2.setBackgroundResource(R.drawable.rectangle_1591saq);
                    txt_bathroom2.setTextColor(Color.BLACK);
                }
                statechanged=!statechanged;


            }
        });
        txt_bathroom3.setOnClickListener(new View.OnClickListener() {
            private  boolean statechanged;
            @Override
            public void onClick(View v) {
                if (statechanged){
                    txt_bathroom3.setBackgroundResource(R.drawable.rectangle_1591saqi);
                    txt_bathroom3.setTextColor(Color.WHITE);
                }
                else {
                    txt_bathroom3.setBackgroundResource(R.drawable.rectangle_1591saq);
                    txt_bathroom3.setTextColor(Color.BLACK);
                }
                statechanged=!statechanged;


            }
        });
        txt_bathroom4.setOnClickListener(new View.OnClickListener() {
            private  boolean statechanged;
            @Override
            public void onClick(View v) {
                if (statechanged){
                    txt_bathroom4.setBackgroundResource(R.drawable.rectangle_1591saqi);
                    txt_bathroom4.setTextColor(Color.WHITE);
                }
                else {
                    txt_bathroom4.setBackgroundResource(R.drawable.rectangle_1591saq);
                    txt_bathroom4.setTextColor(Color.BLACK);
                }
                statechanged=!statechanged;


            }
        });

    }

    public void init(View viewFilter){
        txt_house=viewFilter.findViewById(R.id.txt_house);
        txt_apartments=viewFilter.findViewById(R.id.txt_apartments);
        txt_villa=viewFilter.findViewById(R.id.txt_villa);
        txt_condominuim=viewFilter.findViewById(R.id.txt_condominuim);
        txt_commercial=viewFilter.findViewById(R.id.txt_commercial);
        txt_penthouse=viewFilter.findViewById(R.id.txt_penthouse);
        for_rent=viewFilter.findViewById(R.id.txt_for_rent);
        for_sale=viewFilter.findViewById(R.id.txt_for_sale);
        btn_show_properties=viewFilter.findViewById(R.id.btn_show_properties);
        txt_bedroom1=viewFilter.findViewById(R.id.txt_bedroom1);
        txt_bedroom2=viewFilter.findViewById(R.id.txt_bedroom2);
        txt_bedroom3=viewFilter.findViewById(R.id.txt_bedroom3);
        txt_bedroom4=viewFilter.findViewById(R.id.txt_bedroom4);
        txt_bathroom1=viewFilter.findViewById(R.id.txt_bathroom1);
        txt_bathroom2=viewFilter.findViewById(R.id.txt_bathroom2);
        txt_bathroom3=viewFilter.findViewById(R.id.txt_bathroom3);
        txt_bathroom4=viewFilter.findViewById(R.id.txt_bathroom4);

    }
}
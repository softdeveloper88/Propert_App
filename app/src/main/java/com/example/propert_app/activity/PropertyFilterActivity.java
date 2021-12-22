package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.propert_app.R;

public class PropertyFilterActivity extends AppCompatActivity {
    TextView for_rent,for_sale,txt_house,txt_apartments,txt_commercial,txt_villa,
             txt_condominuim,txt_penthouse,txt_bedroom1,txt_bedroom2,txt_bedroom3,txt_bedroom4
            ,txt_bathroom1,txt_bathroom2,txt_bathroom3,txt_bathroom4,txt_for_property,txt_for_other;
    Button btn_show_properties;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_propert_type);
            init();
            setListener();

    }

      void setListener(){

        btn_show_properties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PropertyFilterActivity.this, AllPostActivity.class));
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
//          for_sale.setOnClickListener(new View.OnClickListener() {
//              @Override
//              public void onClick(View v) {
//                  if (for_sale.isClickable()){
//                      for_sale.setBackgroundResource(R.drawable.rectangle_1582);
//                      for_rent.setBackgroundResource(R.drawable.rectangle_1583);
//                  }
//              }
//          });

          txt_for_property.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  if (txt_for_property.isClickable()){
                      txt_for_other.setBackgroundResource(R.drawable.rectangle_1583);
                      txt_for_property.setBackgroundResource(R.drawable.rectangle_1582);
                  }
              }
          });
          txt_for_other.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  if (txt_for_other.isClickable()){
                      txt_for_property.setBackgroundResource(R.drawable.rectangle_1583);
                      txt_for_other.setBackgroundResource(R.drawable.rectangle_1582);
                  }
              }
          });

//        txt_for_other.setOnClickListener(new View.OnClickListener() {
//            private  boolean statechanged;
//            @Override
//            public void onClick(View v) {
//                if (statechanged){
//                    txt_bedroom1.setBackgroundResource(R.drawable.rectangle_1591saqi);
//                    txt_bedroom1.setTextColor(Color.WHITE);
//                }
//                else {
//                    txt_bedroom1.setBackgroundResource(R.drawable.rectangle_1591saq);
//                    txt_bedroom1.setTextColor(Color.BLACK);
//                }
//                statechanged=!statechanged;
//
//
//            }
//        });
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

    public void init(){
        txt_house=findViewById(R.id.txt_house);
        txt_apartments=findViewById(R.id.txt_apartments);
        txt_villa=findViewById(R.id.txt_villa);
        txt_condominuim=findViewById(R.id.txt_condominuim);
        txt_commercial=findViewById(R.id.txt_commercial);
        txt_penthouse=findViewById(R.id.txt_penthouse);
        for_rent=findViewById(R.id.txt_for_rent);
        for_sale=findViewById(R.id.txt_for_sale);
        txt_for_property=findViewById(R.id.txt_for_property);
        txt_for_other=findViewById(R.id.txt_for_other);
        btn_show_properties=findViewById(R.id.btn_show_properties);
        txt_bedroom1=findViewById(R.id.txt_bedroom1);
        txt_bedroom2=findViewById(R.id.txt_bedroom2);
        txt_bedroom3=findViewById(R.id.txt_bedroom3);
        txt_bedroom4=findViewById(R.id.txt_bedroom4);
        txt_bathroom1=findViewById(R.id.txt_bathroom1);
        txt_bathroom2=findViewById(R.id.txt_bathroom2);
        txt_bathroom3=findViewById(R.id.txt_bathroom3);
        txt_bathroom4=findViewById(R.id.txt_bathroom4);

    }
}
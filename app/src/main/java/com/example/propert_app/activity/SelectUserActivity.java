package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.propert_app.R;

public class SelectUserActivity extends AppCompatActivity {
    LinearLayout  linearlayout_1, linearlayout_2, linearlayout_3;
    ImageView img_circle1,img_circle2,img_circle3;
    Button btn_continue1;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_user_role);
        init();
        btn_continue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectUserActivity.this,ScreenSixteenActivity.class));
            }
        });
        linearlayout_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (linearlayout_1.isClickable()){
                    linearlayout_1.setBackgroundResource(R.drawable.rectangle_1653);
                    linearlayout_2.setBackgroundResource(R.drawable.rectangle_1654);
                    linearlayout_3.setBackgroundResource(R.drawable.rectangle_1654);
                    img_circle1.setImageResource(R.drawable.icon);
                    img_circle2.setImageResource(R.drawable.ellipse_312);
                    img_circle3.setImageResource(R.drawable.ellipse_312);
                }
            }
        });
        linearlayout_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (linearlayout_2.isClickable()){
                    linearlayout_1.setBackgroundResource(R.drawable.rectangle_1654);
                    linearlayout_2.setBackgroundResource(R.drawable.rectangle_1653);
                    linearlayout_3.setBackgroundResource(R.drawable.rectangle_1654);
                    img_circle1.setImageResource(R.drawable.ellipse_312);
                    img_circle2.setImageResource(R.drawable.icon);
                    img_circle3.setImageResource(R.drawable.ellipse_312);
                }
            }
        });
        linearlayout_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (linearlayout_3.isClickable()){
                    linearlayout_1.setBackgroundResource(R.drawable.rectangle_1654);
                    linearlayout_2.setBackgroundResource(R.drawable.rectangle_1654);
                    linearlayout_3.setBackgroundResource(R.drawable.rectangle_1653);
                    img_circle1.setImageResource(R.drawable.ellipse_312);
                    img_circle2.setImageResource(R.drawable.ellipse_312);
                    img_circle3.setImageResource(R.drawable.icon);
                }
            }
        });

    }
    public  void init(){
        linearlayout_1=findViewById(R.id.linearlayout_owner);
        linearlayout_2=findViewById(R.id.linearlayout_agent);
        linearlayout_3=findViewById(R.id.linearlayout_property_developer);
        img_circle1=findViewById(R.id.img_circle1);
        img_circle2=findViewById(R.id.img_circle2);
        img_circle3=findViewById(R.id.img_circle3);
        btn_continue1=findViewById(R.id.btn_continue1);



    }
}
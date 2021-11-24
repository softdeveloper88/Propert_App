package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.propert_app.R;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout_google,linearLayout_facebook;
    TextView txt_facebook,txt_google,txt_sign_up_here;
    EditText et_password;
    Button btn_continue;
    ImageView facebook_icon,google_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


        linearLayout_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (linearLayout_google.isClickable()){
                    linearLayout_google.setBackgroundResource(R.drawable.background_color);
                    txt_google.setTextColor(getResources().getColor(R.color.white));
                    linearLayout_facebook.setBackgroundResource(R.drawable.background1);
                    txt_facebook.setTextColor(getResources().getColor(R.color.black));
                    facebook_icon.setBackgroundResource(R.drawable.backgroundcolor1);
                    google_icon.setBackgroundResource(R.color.white);

                }
            }
        });
        linearLayout_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (linearLayout_facebook.isClickable()){
                    linearLayout_facebook.setBackgroundResource(R.drawable.background_color);
                    txt_facebook.setTextColor(getResources().getColor(R.color.white));
                    linearLayout_google.setBackgroundResource(R.drawable.background1);
                    txt_google.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        txt_sign_up_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SignUpActivity.class));
                finish();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,DashboardActivity.class));
                finish();

            }
        });
    }
    public void  init(){
        linearLayout_google=findViewById(R.id.linearLayout_google);
        linearLayout_facebook=findViewById(R.id.linearLayout_facebook);
        txt_google=findViewById(R.id.txt_google);
        txt_facebook=findViewById(R.id.txt_facebook);
        txt_sign_up_here=findViewById(R.id.txt_sign_up_here);
        linearLayout_facebook.setBackgroundResource(R.drawable.background_color);
        txt_facebook.setTextColor(getResources().getColor(R.color.white));
        btn_continue=findViewById(R.id.btn_continue);
        facebook_icon=findViewById(R.id.facebook_icon);
        google_icon=findViewById(R.id.google_icon);
        et_password=findViewById(R.id.edit_password);



    }


}
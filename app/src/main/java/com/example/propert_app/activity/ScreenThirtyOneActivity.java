package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.propert_app.R;
import com.example.propert_app.activity.user.UserProfileActivity;

public class ScreenThirtyOneActivity extends AppCompatActivity {
    Button btn_screen31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_thirty_one);
        btn_screen31=findViewById(R.id.btn_screen31);
        btn_screen31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScreenThirtyOneActivity.this, UserProfileActivity.class));
            }
        });
    }
}
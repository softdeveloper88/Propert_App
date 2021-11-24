package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.propert_app.R;

public class ScreenTwentyOneActivity extends AppCompatActivity {
    Button btn_next_step;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_twenty_one);
        btn_next_step=findViewById(R.id.btn_next_step);
        btn_next_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScreenTwentyOneActivity.this,ScreenTwentyTwoActivity.class));
            }
        });
    }
}
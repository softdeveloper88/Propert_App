package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.propert_app.R;

public class ScreenTwelveActivity extends AppCompatActivity {
    TextView txt_recent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_twelve);
        txt_recent=findViewById(R.id.txt_recent);
        txt_recent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScreenTwelveActivity.this,ScreenThirteenActivity.class));
            }
        });
    }
}
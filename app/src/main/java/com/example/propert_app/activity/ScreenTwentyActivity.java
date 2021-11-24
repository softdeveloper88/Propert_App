package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.propert_app.R;

public class ScreenTwentyActivity extends AppCompatActivity {
    TextView txt_upload_photos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_twenty);
        txt_upload_photos=findViewById(R.id.txt_upload_photos);
        txt_upload_photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScreenTwentyActivity.this,ScreenTwentyOneActivity.class));
            }
        });
    }
}
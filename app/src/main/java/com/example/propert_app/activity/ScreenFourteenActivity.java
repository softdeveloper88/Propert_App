package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.propert_app.R;
import com.example.propert_app.activity.user.SelectUserActivity;

public class
ScreenFourteenActivity extends AppCompatActivity {
    TextView txt_property_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_fourteen);
        txt_property_news=findViewById(R.id.txt_property_news);
        txt_property_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScreenFourteenActivity.this, SelectUserActivity.class));
            }
        });
    }

}
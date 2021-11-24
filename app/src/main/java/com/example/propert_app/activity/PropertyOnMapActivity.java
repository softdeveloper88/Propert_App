package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.propert_app.R;


public class PropertyOnMapActivity extends AppCompatActivity  {
    TextView txt_location;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_on_map);
        txt_location=findViewById(R.id.txt_location);
        txt_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PropertyOnMapActivity.this,ScreenTwelveActivity.class));
            }
        });

    }
}
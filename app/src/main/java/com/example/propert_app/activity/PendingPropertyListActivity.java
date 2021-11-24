package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.propert_app.R;

public class PendingPropertyListActivity extends AppCompatActivity {
    ImageView icon_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_twenty_six);
        icon_add=findViewById(R.id.icon_add);
        icon_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PendingPropertyListActivity.this,ScreenTwentySevenActivity.class));
            }
        });
    }
}
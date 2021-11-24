package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.propert_app.R;

public class NotificationActivity extends AppCompatActivity {
    ImageView icon_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_twenty_four);
        icon_setting=findViewById(R.id.icon_setting);
        icon_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NotificationActivity.this,ScreenTwentyFiveActivity.class));
            }
        });
    }
}
package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.propert_app.R;

public class ScreenTwentyEgihtActivity extends AppCompatActivity {
    ImageView imageview_dotedline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_twenty_egiht);
        imageview_dotedline=findViewById(R.id.imageview_dotedline);
        imageview_dotedline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScreenTwentyEgihtActivity.this,ScreenTwentyNineActivity.class));
            }
        });
    }
}
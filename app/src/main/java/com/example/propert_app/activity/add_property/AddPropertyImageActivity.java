package com.example.propert_app.activity.add_property;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.propert_app.R;
import com.example.propert_app.activity.ScreenTwentyActivity;

public class AddPropertyImageActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private int say=0;
    TextView text_view;
    Button btn_upload_images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_property_image);
        progressBar=findViewById(R.id.progress2);
        text_view=findViewById(R.id.text_view);
        btn_upload_images=findViewById(R.id.btn_upload_images);
        btn_upload_images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddPropertyImageActivity.this, ScreenTwentyActivity.class));
            }
        });

        progressBar.setMax(100);
        progressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                say++;
                progressBar.setProgress(say);
                text_view.setText(say+"");
            }
        });
    }

}
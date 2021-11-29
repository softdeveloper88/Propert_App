package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.propert_app.R;
import com.example.propert_app.activity.add_property.AddPropertyCompleteActivity;

public class ScreenTwentyTwoActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private int say=0;
    TextView text_view22;
    Button btn_submit_listing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_twenty_two);
        progressBar=findViewById(R.id.progress22);
        text_view22=findViewById(R.id.text_view22);
        btn_submit_listing=findViewById(R.id.btn_submit_listing);

        progressBar.setMax(100);
        progressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                say++;
                progressBar.setProgress(say);
                text_view22.setText(say+"");
            }
        });
        btn_submit_listing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScreenTwentyTwoActivity.this, AddPropertyCompleteActivity.class));
            }
        });
    }

}
package com.example.propert_app.activity.add_property;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.propert_app.R;

public class AddPropertyTwoActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private int say=0;
    TextView text_view,txt_liveScore;
    Button btn_next_step;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_property_two);
        progressBar=findViewById(R.id.progress2);
        btn_next_step=findViewById(R.id.btn_next_step);

        text_view=findViewById(R.id.text_view);
        txt_liveScore=findViewById(R.id.txt_liveScore);
        btn_next_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddPropertyTwoActivity.this, AddPropertyThreeActivity.class));
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
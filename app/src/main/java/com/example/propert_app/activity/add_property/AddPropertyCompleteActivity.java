package com.example.propert_app.activity.add_property;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.propert_app.R;
import com.example.propert_app.activity.NotificationActivity;

public class AddPropertyCompleteActivity extends AppCompatActivity {
    Button btn_submit_listing23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_twenty_three);
        btn_submit_listing23=findViewById(R.id.btn_submit_listing23);
        btn_submit_listing23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddPropertyCompleteActivity.this, NotificationActivity.class));
            }
        });
    }
}
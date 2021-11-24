package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.propert_app.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class ScreenThirtyActivity extends AppCompatActivity {
    Button btn_screen30;
    ImageView call_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_thirty);
        btn_screen30=findViewById(R.id.btn_screen30);
        call_icon=findViewById(R.id.img_call_icon);
        btn_screen30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScreenThirtyActivity.this,ScreenThirtyOneActivity.class));
            }
        });
        call_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(ScreenThirtyActivity.this);
                bottomSheetDialog.setContentView(R.layout.call_bottom_sheet);
                bottomSheetDialog.setCanceledOnTouchOutside(true);
                bottomSheetDialog.show();

            }
        });
    }

}
package com.example.propert_app.activity.add_property;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.propert_app.R;

public class AddPropertyOneActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private int sayi=0;
    TextView text_view,sell_listing,rent_listing;
    Button btn_next_step;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_property_one);
       init();
        btn_next_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddPropertyOneActivity.this, AddPropertyTwoActivity.class));
            }
        });

        progressBar.setMax(100);
        progressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi++;
                progressBar.setProgress(sayi);
                text_view.setText(sayi+"");
            }
        });
        sell_listing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sell_listing.isClickable()){
                    sell_listing.setBackgroundResource(R.drawable.rectangle_1663);
                    rent_listing.setBackgroundResource(R.drawable.rectangle_1664);
                    sell_listing.setTextColor(Color.BLUE);
                    rent_listing.setTextColor(Color.BLACK);
                }
            }
        });
        rent_listing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rent_listing.isClickable()){
                    rent_listing.setBackgroundResource(R.drawable.rectangle_1663);
                    sell_listing.setBackgroundResource(R.drawable.rectangle_1664);
                    rent_listing.setTextColor(Color.BLUE);
                    sell_listing.setTextColor(Color.BLACK);
                }
            }
        });

    }
    public  void init(){
        progressBar=findViewById(R.id.progress);
        text_view=findViewById(R.id.text_view);
        btn_next_step=findViewById(R.id.btn_next_step);
        sell_listing=findViewById(R.id.txt_sell_listing);
        rent_listing=findViewById(R.id.txt_rent_listing);



    }
}
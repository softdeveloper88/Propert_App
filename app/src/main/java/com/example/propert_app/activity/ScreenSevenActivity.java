package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.propert_app.R;
import com.example.propert_app.adapter.ScreenSixAdapter;

import java.util.ArrayList;

public class ScreenSevenActivity extends AppCompatActivity {
    RecyclerView recyclerView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_seven2);
        recyclerView1=findViewById(R.id.recycler_view_profile1);
        recyclerView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScreenSevenActivity.this, PropertyDetailsActivity.class));
            }
        });
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("niazi");
        arrayList.add("niazi");
        arrayList.add("niazi");
        arrayList.add("niazi");
        arrayList.add("niazi");
        ScreenSixAdapter screenSixAdapter=new ScreenSixAdapter(this,arrayList);
        recyclerView1.setAdapter(screenSixAdapter);
        return ;

    }
}
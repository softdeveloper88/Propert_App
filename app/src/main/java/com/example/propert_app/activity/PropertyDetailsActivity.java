package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.propert_app.R;
import com.example.propert_app.activity.user.MyFovritesActivity;
import com.example.propert_app.adapter.ScreenEightAdapter;

import java.util.ArrayList;

public class PropertyDetailsActivity extends AppCompatActivity {
    TextView txt_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_details);
        txt_description=findViewById(R.id.txt_description);
        txt_description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PropertyDetailsActivity.this, MyFovritesActivity.class));
            }
        });
        RecyclerView recycler_view_screen_eight=findViewById(R.id.recycler_view_screen_eight);
        recycler_view_screen_eight.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("niazi");
        arrayList.add("niazi");
        arrayList.add("niazi");
        arrayList.add("niazi");
        arrayList.add("niazi");
        ScreenEightAdapter screenEightAdapter=new ScreenEightAdapter(this,arrayList);
        recycler_view_screen_eight.setAdapter(screenEightAdapter);
        return ;
    }
}
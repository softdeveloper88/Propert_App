package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.propert_app.R;
import com.example.propert_app.adapter.ScreenSixAdapter;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class FindAgentActivity extends AppCompatActivity {
    TextView txt_find_agent;
    ImageView btn_fliter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_agent);
        txt_find_agent=findViewById(R.id.txt_find_agent);
        RecyclerView recyclerView=findViewById(R.id.recycler_view_profile);
        btn_fliter=findViewById(R.id.filter_layout6);

        txt_find_agent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(FindAgentActivity.this);
                bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog);
                bottomSheetDialog.setCanceledOnTouchOutside(true);
                bottomSheetDialog.show();
            }
        });
        btn_fliter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FindAgentActivity.this,ScreenSevenActivity.class));
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("niazi");
        arrayList.add("niazi");
        arrayList.add("niazi");
        arrayList.add("niazi");
        arrayList.add("niazi");
        ScreenSixAdapter screenSixAdapter=new ScreenSixAdapter(this,arrayList);
        recyclerView.setAdapter(screenSixAdapter);
        return ;
    }
}
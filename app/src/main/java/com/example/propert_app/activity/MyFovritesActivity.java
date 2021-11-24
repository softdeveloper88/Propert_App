package com.example.propert_app.activity;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.propert_app.R;
import com.example.propert_app.adapter.ScreenNineAdapter;

import java.util.ArrayList;

public class MyFovritesActivity extends Fragment {
    TextView txt_myfavorite;
        Button btn_list_property;
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View view= inflater.inflate(R.layout.activity_favorite, container, false);
        txt_myfavorite=view.findViewById(R.id.txt_myfavorite);
        txt_myfavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MortageCalculatorActivity.class));
            }
        });
        RecyclerView recyclerView_nine=view.findViewById(R.id.recycler_view_nine);
        recyclerView_nine.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        ArrayList<String> list=new ArrayList<>();
        list.add("saqib");
        list.add("saqib");
        list.add("saqib");
        list.add("saqib");
        ScreenNineAdapter screenNineAdapter=new ScreenNineAdapter(getContext(),list);
        recyclerView_nine.setAdapter(screenNineAdapter);
        return view;
    }
}
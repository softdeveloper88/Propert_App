package com.example.propert_app.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.propert_app.activity.PropertyDetailsActivity;
import com.example.propert_app.R;

import java.util.ArrayList;

public class ScreenSixAdapter extends RecyclerView.Adapter<ScreenSixAdapter.ViewHolder> {
    Context context;
    ArrayList<String> arrayList;

    public ScreenSixAdapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_design_screen_six,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.forwar_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              context.startActivity(new Intent(context, PropertyDetailsActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
       LinearLayout linearlayout_meesage;
       ConstraintLayout constraint_layout1;
       ImageView forwar_arrow;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            linearlayout_meesage=itemView.findViewById(R.id.linearlayout_meesage);
            constraint_layout1=itemView.findViewById(R.id.constraint_layout1);
            forwar_arrow=itemView.findViewById(R.id.forwar_arrow);
        }
    }
}

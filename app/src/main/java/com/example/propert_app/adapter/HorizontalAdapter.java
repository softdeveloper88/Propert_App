package com.example.propert_app.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.propert_app.activity.PropertyDetailsActivity;
import com.example.propert_app.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class HorizontalAdapter  extends RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder> {
Context context;
ArrayList<String> list;

    public HorizontalAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.row_design,parent,false);
        return new HorizontalViewHolder(view);
    }

     @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {

     holder.cardView.setOnClickListener(new View.OnClickListener() {
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

    public  class HorizontalViewHolder extends RecyclerView.ViewHolder {
        LinearLayout linearLayout;
        ImageView home;
           TextView txt_residence,txt_cityname;
        CircleImageView profile_image,profile_image1,profile_image2;
        CardView cardView;
        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout=itemView.findViewById(R.id.linearLayout3);
            home=itemView.findViewById(R.id.home_image);
            txt_residence=itemView.findViewById(R.id.txt_residence);
            txt_cityname=itemView.findViewById(R.id.txt_city);
            profile_image=itemView.findViewById(R.id.profile_image);
            profile_image1=itemView.findViewById(R.id.profile_image1);
            profile_image2=itemView.findViewById(R.id.profile_image2);
            cardView=itemView.findViewById(R.id.card);
        }
    }
}

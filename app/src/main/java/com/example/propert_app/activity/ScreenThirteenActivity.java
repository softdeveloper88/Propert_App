package com.example.propert_app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.propert_app.activity.user.SelectUserActivity;
import com.example.propert_app.adapter.PageAdapter_13;
import com.example.propert_app.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class ScreenThirteenActivity extends AppCompatActivity {
    ImageSlider imageSlider;
    TabLayout tabLayout;
    TabItem tabItem_all,tabItem_property_news,tabItem_finance,tabItem_tips;
    ViewPager viewPager;
    PageAdapter_13 pageAdapter13;
    TextView txt_propert_news;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_thirteen);
       init();
        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.image_15,"Apartment price down.The right time to Buy", ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image_14,"Apartment price down.The right time to Buy", ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image_13,"Apartment price down.The right time to Buy", ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image_12,"Apartment price down.The right time to Buy", ScaleTypes.FIT));
        imageSlider.setImageList(slideModels);
        pageAdapter13=new PageAdapter_13(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter13);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0 || tab.getPosition()==1 ||tab.getPosition()==2||tab.getPosition()==3){
                    pageAdapter13.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        txt_propert_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScreenThirteenActivity.this, SelectUserActivity.class));
            }
        });
    }
    public  void init(){
        imageSlider=findViewById(R.id.slider_image);
        tabLayout=findViewById(R.id.tablayout);
        tabItem_all=findViewById(R.id.all);
        tabItem_property_news=findViewById(R.id.tab_property_news);
        tabItem_finance=findViewById(R.id.tab_finance);
        tabItem_tips=findViewById(R.id.tab_tips);
        viewPager=findViewById(R.id.viewpager13);
        txt_propert_news=findViewById(R.id.property_news);
    }
}
package com.example.propert_app.fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

public class
PageAdapter_13 extends FragmentPagerAdapter {
    int tabcount;
    public PageAdapter_13(@NonNull @NotNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }
    @NotNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position){
            case 0: return new AllFragments();
            case 1: return new Property_news_Fragment();
            case 2: return new Finance_Fragment();
            case 3: return new Tip_Fragment();
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}

package com.example.propert_app.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.propert_app.fragments.FragmentForRent;
import com.example.propert_app.fragments.FragmentForSale;

import org.jetbrains.annotations.NotNull;

public class PageAdapter extends FragmentPagerAdapter {
    int tabcount;
    public PageAdapter(@NonNull @NotNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :return new FragmentForSale();
            case 1 : return new FragmentForRent();
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}

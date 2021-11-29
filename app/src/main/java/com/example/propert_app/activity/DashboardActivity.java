package com.example.propert_app.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.propert_app.activity.user.MyFovritesActivity;
import com.example.propert_app.fragments.HomeFragments;
import com.example.propert_app.fragments.ProfileFragment;
import com.example.propert_app.R;
import com.example.propert_app.fragments.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        bottomNavigationView=findViewById(R.id.navigation);
        loadFragment(new HomeFragments());
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.home:
//                fragment = new HomeFragments();
                break;
            case R.id.search:
                fragment=new SearchFragment();
                break;
            case R.id.favorite:
                fragment=new MyFovritesActivity();
                break;
            case R.id.profile:
                fragment=new ProfileFragment();
                break;
            default:
                fragment= new HomeFragments();
        }
        return loadFragment(fragment);

    }
    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.framelayout, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
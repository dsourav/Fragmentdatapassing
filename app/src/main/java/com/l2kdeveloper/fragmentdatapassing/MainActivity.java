package com.l2kdeveloper.fragmentdatapassing;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.l2kdeveloper.fragmentdatapassing.Viewpager_adapter.Pager_adapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //viewpager is required for swipe through one fragment to another
        ViewPager pager=findViewById(R.id.viewpager);
        Pager_adapter adapter=new Pager_adapter(getSupportFragmentManager());
        pager.setAdapter(adapter);

    }
}

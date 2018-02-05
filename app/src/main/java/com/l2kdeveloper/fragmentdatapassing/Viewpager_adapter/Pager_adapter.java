package com.l2kdeveloper.fragmentdatapassing.Viewpager_adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.l2kdeveloper.fragmentdatapassing.FragmentA;
import com.l2kdeveloper.fragmentdatapassing.FragmentB;

/**
 * Created by sourav on 2/4/18.
 */

public class Pager_adapter extends FragmentStatePagerAdapter {
    public Pager_adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FragmentA a=new FragmentA();
                return a;
            case 1:
                FragmentB b=new FragmentB();
                return b;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}

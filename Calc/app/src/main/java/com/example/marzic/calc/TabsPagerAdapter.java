package com.example.marzic.calc;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zimovit on 15.11.2014.
 */
public class TabsPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragments;

    public TabsPagerAdapter(FragmentManager fs){
        super(fs);
        this.fragments = new ArrayList<Fragment>();
        fragments.add(new fragment1());
        fragments.add(new fragment2());

    }
    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}

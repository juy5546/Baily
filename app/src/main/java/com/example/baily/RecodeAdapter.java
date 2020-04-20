package com.example.baily;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class RecodeAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mData;
    public RecodeAdapter(@NonNull FragmentManager fm, List<Fragment> listFlagments) {
        super(fm);

        mData = new ArrayList<>();
        mData.add(new RecodeAFragment() );
        mData.add(new RecodeBFragment() );

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mData.get(position);
    }

    @Override
    public int getCount() {
        return mData.size();
    }
}

package com.example.andriod.freelithics;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by IMRAN on 7/16/2017.
 */

public class categoryAdapter extends FragmentPagerAdapter  {
    private Context mContext;

    /**
     * Create a new {@link categoryAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public categoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LearnTheMovements();

        } else if (position == 1) {
            return new Training();
        } else if (position == 2) {
            return new Coach();
        } else {
            return new Profile();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

}

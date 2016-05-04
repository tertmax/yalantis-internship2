package com.task.internship.secondtask;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TabsPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public TabsPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle recyclerKeyBundle = new Bundle();
        InProgressCompleteFragment inProgressCompleteFragment;
        recyclerKeyBundle.putSerializable(InProgressCompleteFragment.BUNDLE_KEY, InProgressCompleteFragment.InProgressCompleteFragmentKey.IN_PROGRESS);
        inProgressCompleteFragment = new InProgressCompleteFragment();
        inProgressCompleteFragment.setArguments(recyclerKeyBundle);

        switch (position) {
            case 0:
                return inProgressCompleteFragment;
            case 1:
                recyclerKeyBundle.putSerializable(InProgressCompleteFragment.BUNDLE_KEY, InProgressCompleteFragment.InProgressCompleteFragmentKey.COMPLETE);
                inProgressCompleteFragment = new InProgressCompleteFragment();
                inProgressCompleteFragment.setArguments(recyclerKeyBundle);
                return inProgressCompleteFragment;
            default:
                return new AwaitingFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.in_progress_tab_title);
            case 1:
                return mContext.getString(R.string.complete_tab_title);
            case 2:
                return mContext.getString(R.string.awaits_tab_title);
            default:
                return null;
        }
    }

}
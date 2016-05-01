package com.task.internship.secondtask;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Bundle recyclerKeyBundle = new Bundle();
        FragmentRecyclerView recPageFrag = null;
        recyclerKeyBundle.putSerializable("recyclerKey", FragmentRecyclerView.RecyclerKey.IN_PROGRESS); //[Comment] Hardcode
        recPageFrag = new FragmentRecyclerView();
        recPageFrag.setArguments(recyclerKeyBundle);

        switch (position) {
            case 0:
                return recPageFrag;
            case 1:
                recyclerKeyBundle.putSerializable("recyclerKey", FragmentRecyclerView.RecyclerKey.COMPLETE); //[Comment] Hardcode
                recPageFrag = new FragmentRecyclerView();
                recPageFrag.setArguments(recyclerKeyBundle);
                return recPageFrag;
            default:
                return new FragmentListView();
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
                return "В РОБОТІ"; //[Comment] Hardcode
            case 1:
                return "ВИКОНАНО"; //[Comment] Hardcode
            case 2:
                return "ОЧІКУЄ"; //[Comment] Hardcode
            default:
                return null;
        }
    }

}
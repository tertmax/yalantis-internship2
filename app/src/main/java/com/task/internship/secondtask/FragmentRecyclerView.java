package com.task.internship.secondtask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shamanland.fab.FloatingActionButton;
import com.shamanland.fab.ShowHideOnScroll;

import java.util.List;

public class FragmentRecyclerView extends Fragment { //[Comment] It's fragment

    private List<ProblemEvent> mDataSet;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_content_recycler, container, false);


        Bundle recyclerKeyBundle = this.getArguments();
        RecyclerKey recyclerKey = (RecyclerKey) recyclerKeyBundle.get("recyclerKey");

        switch (recyclerKey) {
            case IN_PROGRESS:
                mDataSet = InitData.getRecyclerOneData(); //[Comment] Make this only once in App class
                break;
            case COMPLETE:
                mDataSet = InitData.getRecyclerTwoData();
        }

        initFragmentRecyclerView(rootView);

        return rootView;
    }


    public void initFragmentRecyclerView(View view) {
        RecyclerView fragmentRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_recyclerview);
        fragmentRecyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false);
        fragmentRecyclerView.setLayoutManager(layoutManager);

        FloatingActionButton fab = (FloatingActionButton) getActivity().findViewById(R.id.fab);

        FragmentRecyclerViewAdapter adapter = new FragmentRecyclerViewAdapter(getActivity(), mDataSet);
        adapter.setClickListener(new FragmentRecyclerViewAdapter.OnEventClickListener() {
            @Override
            public void onClick(ProblemEvent problemEvent) {
                Intent intent = new Intent(getContext(), MainActivityTask1.class);
                intent.putExtra("pe", problemEvent);
                startActivity(intent);
            }
        });

        fragmentRecyclerView.setOnTouchListener(new ShowHideOnScroll(fab, R.anim.scale_up, R.anim.scale_down));
        fragmentRecyclerView.setAdapter(adapter);

    }

    public enum RecyclerKey {
        IN_PROGRESS, COMPLETE
    }
}
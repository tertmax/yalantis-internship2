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
import com.task.internship.firsttask.EventDetailsActivity;

import java.util.List;

public class InProgressCompleteFragment extends Fragment {

    public final static String BUNDLE_KEY = "inProgressCompleteFragmentKey";
    public final static String EXTRA_KEY = "problemEvent";
    private List<ProblemEvent> mDataSet;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_content_recycler, container, false);

        Bundle recyclerKeyBundle = this.getArguments();
        InProgressCompleteFragmentKey inProgressCompleteFragmentKey = (InProgressCompleteFragmentKey) recyclerKeyBundle.get(BUNDLE_KEY);
        if (inProgressCompleteFragmentKey != null)
            switch (inProgressCompleteFragmentKey) {
                case IN_PROGRESS:
                    mDataSet = InitData.getRecyclerOneData(getActivity());
                    break;
                case COMPLETE:
                    mDataSet = InitData.getRecyclerTwoData(getActivity());
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

        EventsRecyclerViewAdapter adapter = new EventsRecyclerViewAdapter(getActivity(), mDataSet);
        adapter.setClickListener(new EventsRecyclerViewAdapter.OnEventClickListener() {
            @Override
            public void onClick(ProblemEvent problemEvent) {
                Intent intent = new Intent(getContext(), EventDetailsActivity.class);
                intent.putExtra(EXTRA_KEY, problemEvent);
                startActivity(intent);
            }
        });

        fragmentRecyclerView.setOnTouchListener(new ShowHideOnScroll(fab, R.anim.scale_up, R.anim.scale_down));
        fragmentRecyclerView.setAdapter(adapter);

    }

    public enum InProgressCompleteFragmentKey {
        IN_PROGRESS, COMPLETE
    }
}
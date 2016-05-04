package com.task.internship.secondtask;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.shamanland.fab.FloatingActionButton;
import com.shamanland.fab.ShowHideOnScroll;
import com.task.internship.firsttask.EventDetailsActivity;

import java.util.List;

public class AwaitingFragment extends Fragment {

    private EventsListViewAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_content_listview, container, false);
        return rootView;
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<ProblemEvent> dataSet = InitData.getListData(getActivity());
        mAdapter = new EventsListViewAdapter(getActivity(), dataSet);

        ListView listView = (ListView) getActivity().findViewById(android.R.id.list);
        FloatingActionButton fab = (FloatingActionButton) getActivity().findViewById(R.id.fab);
        if (listView != null) {
            listView.setAdapter(mAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(getContext(), EventDetailsActivity.class);
                    ProblemEvent problemEvent = mAdapter.getItem(position);
                    intent.putExtra(InProgressCompleteFragment.EXTRA_KEY, problemEvent);
                    startActivity(intent);
                }
            });
            listView.setOnTouchListener(new ShowHideOnScroll(fab, R.anim.scale_up, R.anim.scale_down));
        }
    }
}

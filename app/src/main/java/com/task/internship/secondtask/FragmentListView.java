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

import java.util.List;

public class FragmentListView extends Fragment { //[Comment] It's not a list view. It's fragment
    private FragmentListViewAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_content_listview, container, false);

        return rootView;
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<ProblemEvent> dataSet = InitData.getListData();
        mAdapter = new FragmentListViewAdapter(getActivity(), dataSet);

        ListView listView = (ListView) getActivity().findViewById(android.R.id.list);
        FloatingActionButton fab = (FloatingActionButton) getActivity().findViewById(R.id.fab);
        if (listView != null) {
            listView.setAdapter(mAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(getContext(), MainActivityTask1.class);
                    ProblemEvent pe = (ProblemEvent) mAdapter.getItem(position);
                    intent.putExtra("pe", pe); //[Comment] pe it's a bad name
                    startActivity(intent);
                }
            });
            listView.setOnTouchListener(new ShowHideOnScroll(fab, R.anim.scale_up, R.anim.scale_down));
        }
    }
}

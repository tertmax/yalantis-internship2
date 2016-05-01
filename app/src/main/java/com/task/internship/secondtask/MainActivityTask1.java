package com.task.internship.secondtask;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivityTask1 extends AppCompatActivity { //[Comment] Bad Name, You have two main activities?

    private ProblemEvent mPassedEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout_task_one);
        setTitle(getResources().getString(R.string.toolbar_title));
        Toolbar myToolbar = (Toolbar) findViewById(R.id.task1_toolbar);
        setSupportActionBar(myToolbar);

        final List<View> views = getAllChildren(findViewById(R.id.main_layout));
        for (View v : views) {
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int id = v.getId();
                    if (id > 0) {

                        Toast.makeText(MainActivityTask1.this, getResources().getResourceName(v.getId()),
                                Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        mPassedEvent = getIntent().getParcelableExtra("pe");
        initData();
        initRecyclerView();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Toast.makeText(this, "Back button", Toast.LENGTH_SHORT).show();
                // You should close app, or close drawer
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void initData() {
        setTitle(mPassedEvent.getTitle());

        TextView tv = (TextView) findViewById(R.id.public_utilities_text); //[Comment] tv - bad name
        tv.setText(mPassedEvent.getDescription());

        tv = (TextView) findViewById(R.id.date_registered_text);
        tv.setText(mPassedEvent.getRegisteredDate());

        tv = (TextView) findViewById(R.id.date_created_text);
        tv.setText(mPassedEvent.getFirstDate());

        tv = (TextView) findViewById(R.id.date_solve_text);
        tv.setText(mPassedEvent.getSolveDate());

        tv = (TextView) findViewById(R.id.organization_responsible_text);
        tv.setText(mPassedEvent.getResponsible());

        tv = (TextView) findViewById(R.id.in_progress_text);
        tv.setText(mPassedEvent.getState());

        if (mPassedEvent.getState().equals("Виконано"))
            tv.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_green));
        else if (mPassedEvent.getState().equals("Очікує"))
            tv.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_grey));

        tv = (TextView) findViewById(R.id.details_text);
        tv.setText(mPassedEvent.getDetails() + "\nАдреса: " + mPassedEvent.getAddress());
    }

    private List<View> getAllChildren(View v) {

        if (!(v instanceof ViewGroup)) {
            ArrayList<View> viewArrayList = new ArrayList<>();
            viewArrayList.add(v);
            return viewArrayList;
        }

        ArrayList<View> result = new ArrayList<>();

        ViewGroup vg = (ViewGroup) v;
        for (int i = 0; i < vg.getChildCount(); i++) {

            View child = vg.getChildAt(i);

            ArrayList<View> viewArrayList = new ArrayList<>();
            viewArrayList.add(v);
            viewArrayList.addAll(getAllChildren(child));

            result.addAll(viewArrayList);
        }
        return result;
    }

    public void initRecyclerView() {
        RecyclerView imageRecyclerView = (RecyclerView) findViewById(R.id.image_recycler_view);
        imageRecyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        imageRecyclerView.setLayoutManager(layoutManager);

        ImageRecyclerViewAdapter adapter = new ImageRecyclerViewAdapter(this, mPassedEvent.getPictures());
        imageRecyclerView.setAdapter(adapter);
    }
}


package com.task.internship.secondtask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class FragmentListViewAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<ProblemEvent> mDataset;
    private Context mContext;

    FragmentListViewAdapter(Context context, List<ProblemEvent> dataSet) {
        mInflater = LayoutInflater.from(context);
        mContext = context;
        mDataset = dataSet;
    }

    @Override
    public int getCount() {
        return mDataset.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataset.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = mInflater.inflate(R.layout.fragment_content_custom_row, parent, false);
        }

        ProblemEvent currentEvent = getCurrentEvent(position);

        ((TextView) view.findViewById(R.id.problem_description)).setText(currentEvent.getDescription());
        ((TextView) view.findViewById(R.id.problem_address)).setText(currentEvent.getAddress());
        ((TextView) view.findViewById(R.id.problem_date)).setText(currentEvent.getRegisteredDate());
        ((TextView) view.findViewById(R.id.problem_days)).setText(currentEvent.getDays());
        ((TextView) view.findViewById(R.id.likecount)).setText(String.valueOf(currentEvent.getLikeCount()));
        ImageView image = ((ImageView) view.findViewById(R.id.problem_image));
        Picasso.with(mContext)
                .load(currentEvent.getTypeIconResource())
                .into(image);
        return view;
    }

    ProblemEvent getCurrentEvent(int position) {
        return ((ProblemEvent) getItem(position));
    }

}
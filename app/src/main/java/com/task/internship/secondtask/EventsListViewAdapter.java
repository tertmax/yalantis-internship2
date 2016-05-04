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

public class EventsListViewAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<ProblemEvent> mDataset;
    private Context mContext;

    EventsListViewAdapter(Context context, List<ProblemEvent> dataSet) {
        mInflater = LayoutInflater.from(context);
        mContext = context;
        mDataset = dataSet;
    }

    @Override
    public int getCount() {
        return mDataset.size();
    }

    @Override
    public ProblemEvent getItem(int position) {
        return mDataset.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        FragmentViewHolder viewHolder;

        if (view == null) {
            view = mInflater.inflate(R.layout.fragment_content_custom_row, parent, false);
            viewHolder = new FragmentViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (FragmentViewHolder) view.getTag();
        }
        viewHolder.setData(position);
        return view;
    }


    private class FragmentViewHolder {

        private TextView mDescription;
        private TextView mAddress;
        private TextView mDate;
        private TextView mDays;
        private TextView mLikecount;
        private ImageView mIcon;

        public FragmentViewHolder(View itemView) {
            mDescription = (TextView) itemView.findViewById(R.id.problem_description);
            mAddress = (TextView) itemView.findViewById(R.id.problem_address);
            mDate = (TextView) itemView.findViewById(R.id.problem_date);
            mDays = (TextView) itemView.findViewById(R.id.problem_days);
            mLikecount = (TextView) itemView.findViewById(R.id.likecount);
            mIcon = (ImageView) itemView.findViewById(R.id.problem_image);
        }

        public void setData(int position) {
            ProblemEvent currentEvent = getItem(position);
            mDescription.setText(currentEvent.getDescription());
            mAddress.setText(currentEvent.getAddress());
            mDate.setText(currentEvent.getRegisteredDate());
            mDays.setText(currentEvent.getDays());
            mLikecount.setText(Integer.toString(currentEvent.getLikeCount()));
            Picasso.with(mContext)
                    .load(currentEvent.getTypeIconResource())
                    .into(mIcon);
        }
    }

}
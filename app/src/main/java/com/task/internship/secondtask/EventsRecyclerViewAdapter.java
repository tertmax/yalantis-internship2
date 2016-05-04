package com.task.internship.secondtask;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class EventsRecyclerViewAdapter extends RecyclerView.Adapter<EventsRecyclerViewAdapter.FragmentViewHolder> {

    private LayoutInflater mInflater;
    private List<ProblemEvent> mDataset;
    private Context mContext;
    private OnEventClickListener clickListener;

    public EventsRecyclerViewAdapter(Context context, @NonNull List<ProblemEvent> dataSet) {
        mInflater = LayoutInflater.from(context);
        mContext = context;
        mDataset = dataSet;
    }

    public void setClickListener(OnEventClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @Override
    public FragmentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.fragment_content_custom_row, parent, false);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickListener != null) {
                    Object tag = v.getTag();
                    if (tag instanceof Integer) {
                        clickListener.onClick(mDataset.get((Integer) tag));
                    }
                }
            }
        });

        return new FragmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EventsRecyclerViewAdapter.FragmentViewHolder holder, int position) {
        ProblemEvent currentEvent = mDataset.get(position);
        Picasso.with(mContext)
                .load(currentEvent.getTypeIconResource())
                .into(holder.iconIV);
        holder.itemView.setTag(position);
        holder.addressTV.setText(currentEvent.getAddress());
        holder.likeCountTV.setText(String.valueOf(currentEvent.getLikeCount()));
        holder.descriptionTV.setText(currentEvent.getDescription());
        holder.dateTV.setText(currentEvent.getRegisteredDate());
        holder.daysTV.setText(currentEvent.getDays());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public interface OnEventClickListener {
        void onClick(ProblemEvent problemEvent);
    }

    class FragmentViewHolder extends RecyclerView.ViewHolder {
        private ImageView iconIV;
        private TextView likeCountTV;
        private TextView descriptionTV;
        private TextView addressTV;
        private TextView dateTV;
        private TextView daysTV;

        public FragmentViewHolder(View itemView) {
            super(itemView);
            iconIV = (ImageView) itemView.findViewById(R.id.problem_image);
            addressTV = (TextView) itemView.findViewById(R.id.problem_address);
            likeCountTV = (TextView) itemView.findViewById(R.id.likecount);
            descriptionTV = (TextView) itemView.findViewById(R.id.problem_description);
            dateTV = (TextView) itemView.findViewById(R.id.problem_date);
            daysTV = (TextView) itemView.findViewById(R.id.problem_days);


        }
    }
}


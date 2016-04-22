package com.task.internship.secondtask;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageRecyclerViewAdapter extends RecyclerView.Adapter<ImageRecyclerViewAdapter.ImageViewHolder> {
    private LayoutInflater mInflater;
    private Context mContext;
    private List<String> mDataSet;

    public ImageRecyclerViewAdapter(Context context, List<String> dataSet) {
        mInflater = LayoutInflater.from(context);
        this.mContext = context;
        this.mDataSet = dataSet;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.image_recycler_custom_row, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        Picasso.with(mContext).load(mDataSet.get(position)).into(holder.recyclerImage);
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    class ImageViewHolder extends RecyclerView.ViewHolder {
        private ImageView recyclerImage;

        public ImageViewHolder(View itemView) {
            super(itemView);
            recyclerImage = (ImageView) itemView.findViewById(R.id.image_rec);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, " RecyclerView's image " +
                                    (getAdapterPosition() + 1) + ": " +
                                    (mDataSet.get(getAdapterPosition())),
                            Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}

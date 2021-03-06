package com.elysium.tweetbane;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jay on 11/18/16.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MainViewHolder> {
    private List<Tweets> mTweet;

    public Adapter(List<Tweets> tweet) {
        mTweet = tweet;
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainViewHolder(
                LayoutInflater.from(parent.getContext())
        .inflate(android.R.layout.simple_list_item_2,parent,false));
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
     holder.mTextView.setText(mTweet.get(position).getText());
     holder.mTextView2.setText(mTweet.get(position).getCreated_at());
    }

    @Override
    public int getItemCount() {
        return mTweet.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder{
        TextView mTextView;
        TextView mTextView2;

        public MainViewHolder(View itemView) {
            super(itemView);

            mTextView = (TextView) itemView.findViewById(android.R.id.text1);
            mTextView2 = (TextView) itemView.findViewById(android.R.id.text2);
        }
    }
}

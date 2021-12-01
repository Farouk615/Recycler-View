package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.ViewHolder> {
    private LinkedList<String> mWordList = new LinkedList<>();
    private LayoutInflater mInflater;

    public WordListAdapter(Context context,
                           LinkedList<String> wordList) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
    }

    @NonNull
    @Override
    public WordListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.ViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        holder.wordItemView.setText(mCurrent);

    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public final TextView wordItemView;
        final WordListAdapter mAdapter;
        public ViewHolder(@NonNull View itemView, TextView wordItemView, WordListAdapter mAdapter) {
            super(itemView);
            this.wordItemView = wordItemView;
            this.mAdapter = mAdapter;
        }
    }
}

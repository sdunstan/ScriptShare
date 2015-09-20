package com.stevedunstan.scriptshare;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TopScriptsAdapter extends RecyclerView.Adapter<TopScriptsAdapter.ViewHolder> {

    private String[] scriptTitles;

    public TopScriptsAdapter(String scriptTitles[]) {
        this.scriptTitles = scriptTitles;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.script_card, viewGroup, false);
        // set view size, margins, padding, layout params
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.textView.setText(scriptTitles[i]);
    }

    @Override
    public int getItemCount() {
        return scriptTitles.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView;

        public ViewHolder(View cardView) {
            super(cardView);
            textView = (TextView) cardView.findViewById(R.id.scriptTitle);
        }
    }
}

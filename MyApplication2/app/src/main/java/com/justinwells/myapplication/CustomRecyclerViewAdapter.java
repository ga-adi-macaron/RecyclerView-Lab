package com.justinwells.myapplication;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import java.util.List;

/**
 * Created by justinwells on 10/18/16.
 */

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    List<CustomObject> objectList;

    public CustomRecyclerViewAdapter(final List<CustomObject> objectList) {
        this.objectList = objectList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlayout,
                parent, false);
        CustomViewHolder viewHolder = new CustomViewHolder(parentView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(final CustomViewHolder holder, final int position) {
        holder.textView1.setText(objectList.get(position).getText1());
        holder.textView2.setText(objectList.get(position).getText2());
        holder.imageView.setBackgroundColor(objectList.get(position).getColor());


        holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    holder.relativeLayout.setBackgroundColor(Color.GREEN);
                }
                else {
                    holder.relativeLayout.setBackgroundColor(Color.WHITE);
                }
                objectList.get(position).setCheck(isChecked);
                notifyItemChanged(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }


}

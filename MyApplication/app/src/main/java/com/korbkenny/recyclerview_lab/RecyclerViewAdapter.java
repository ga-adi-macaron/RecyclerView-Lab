package com.korbkenny.recyclerview_lab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KorbBookProReturns on 10/18/16.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    List<ObjectItem> mObjectList;

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item, parent, false);
        CustomViewHolder viewHolder = new CustomViewHolder(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomViewHolder myViewHolder = (CustomViewHolder) new holder;


            }
        };

    }

    @Override
    public int getItemCount() {
        return mObjectList.size();
    }


}

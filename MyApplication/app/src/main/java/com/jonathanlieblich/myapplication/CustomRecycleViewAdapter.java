package com.jonathanlieblich.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.List;

/**
 * Created by jonlieblich on 10/18/16.
 */

public class CustomRecycleViewAdapter extends RecyclerView.Adapter<CustomViewHolder>{
    List<CustomObject> mCustomObjectList;

    public CustomRecycleViewAdapter(List<CustomObject> customObjectList) {
        mCustomObjectList = customObjectList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlayout,
                parent, false);
        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {
        final CustomObject object = mCustomObjectList.get(position);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!object.isChecked()) {
                    Toast.makeText(v.getContext(), "Checked", Toast.LENGTH_SHORT).show();
                    object.setChecked(true);
                }
                else if(object.isChecked()) {
                    Toast.makeText(v.getContext(), "Unchecked", Toast.LENGTH_SHORT).show();
                    object.setChecked(false);
                }
            }
        };
        holder.mCheckBox.setOnClickListener(onClickListener);
        holder.mTitle.setText(object.getTitle());
        holder.mDescription.setText(object.getDescription());
        holder.mColorBox.setBackgroundColor(object.getColor());
    }

    @Override
    public int getItemCount() {
        return mCustomObjectList.size();
    }
}

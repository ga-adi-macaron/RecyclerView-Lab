package com.ezequiel.student.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by student on 10/18/16.
 */
public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    List<CustomObject> mCustomObjectList;

    public CustomRecyclerViewAdapter(List<CustomObject> customObjectList) {
        mCustomObjectList = customObjectList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlayout,
                parent,
                false);
        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {

        // Groups all Objects together
        final CustomObject customObject = mCustomObjectList.get(position);

        holder.mTitle.setText(customObject.getTitle());
        holder.mDescription.setText(customObject.getDescription());
        holder.mImageView.setBackgroundColor(customObject.getColor());
        holder.mCheckBox.setChecked(customObject.isCheck());
        
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!customObject.isCheck()){
                    Toast.makeText(v.getContext(), "Box has been Checked!",
                            Toast.LENGTH_SHORT).show();
                    customObject.setCheck(true);
                } else if (customObject.isCheck()){
                    Toast.makeText(v.getContext(), "Box has been Unchecked!",
                            Toast.LENGTH_SHORT).show();
                    customObject.setCheck(false);
                }
            }
        };

        holder.mTitle.setText(customObject.getTitle());
        holder.mDescription.setText(customObject.getDescription());
        holder.mImageView.setBackgroundColor(customObject.getColor());
        holder.mCheckBox.setOnClickListener(onClickListener);
    }

    @Override
    public int getItemCount() {
        return mCustomObjectList.size();
    }
}

package com.ezequiel.student.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by student on 10/18/16.
 */
public class CustomViewHolder extends RecyclerView.ViewHolder {
    public TextView mTitle, mDescription;
    public ImageView mImageView;
    public CheckBox mCheckBox;

    public CustomViewHolder(View itemView) {
        super(itemView);

        mTitle = (TextView) itemView.findViewById(R.id.title_textview);
        mDescription = (TextView) itemView.findViewById(R.id.description_textview);
        mImageView = (ImageView) itemView.findViewById(R.id.square);
        mCheckBox = (CheckBox) itemView.findViewById(R.id.checkbox);
    }
}

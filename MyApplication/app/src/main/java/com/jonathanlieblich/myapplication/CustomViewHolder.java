package com.jonathanlieblich.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by jonlieblich on 10/18/16.
 */

public class CustomViewHolder extends RecyclerView.ViewHolder {
    public CheckBox mCheckBox;
    public RelativeLayout mRelativeLayout;
    public TextView mTitle, mDescription;
    public ImageView mColorBox;

    public CustomViewHolder(View itemView) {
        super(itemView);

        mCheckBox = (CheckBox)itemView.findViewById(R.id.checkbox);

        mRelativeLayout = (RelativeLayout)itemView.findViewById(R.id.customlayout);

        mTitle = (TextView)itemView.findViewById(R.id.title);
        mDescription = (TextView)itemView.findViewById(R.id.description);

        mColorBox = (ImageView)itemView.findViewById(R.id.colorbox);
    }
}

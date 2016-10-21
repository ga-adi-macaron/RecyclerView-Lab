package com.scottlindley.recyclerviewslab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Scott Lindley on 10/18/2016.
 */

public class MyViewHolder extends RecyclerView.ViewHolder{
    public ImageView mImageView;
    public TextView mTitleText;
    public TextView mDescriptionText;
    public CheckBox mCheckBox;

    public MyViewHolder(View itemView) {
        super(itemView);

        mImageView = (ImageView)itemView.findViewById(R.id.image);
        mTitleText = (TextView)itemView.findViewById(R.id.title_text);
        mDescriptionText = (TextView)itemView.findViewById(R.id.description_text);
        mCheckBox = (CheckBox)itemView.findViewById(R.id.checkbox);

    }
}

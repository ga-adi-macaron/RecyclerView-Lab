package com.elysium.recyclerview_lab;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by jay on 10/18/16.
 */

public class CustomViewHolder extends RecyclerView{

    public CheckBox mCheckBox;
    public RelativeLayout mRelativeLayout;
    public TextView mTitle, mSubtext;
    public ImageView mImage;

    public CustomViewHolder(Context itemView) {
        super(itemView);

        mCheckBox = (CheckBox)findViewById(R.id.checkbox);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.custom_layout);
        mTitle = (TextView)findViewById(R.id.title);
        mSubtext = (TextView)findViewById(R.id.subtext);
        mImage = (ImageView)findViewById(R.id.image);
    }
}

package com.colinbradley.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by colinbradley on 1/7/17.
 */

public class ViewHolder extends RecyclerView.ViewHolder{
    TextView mTitle, mDescription;
    ImageView mColor;
    CheckBox mCheck;
    RelativeLayout mLayout;


    public ViewHolder(View itemView) {
        super(itemView);
        mTitle = (TextView)itemView.findViewById(R.id.title);
        mDescription = (TextView)itemView.findViewById(R.id.description);
        mColor = (ImageView)itemView.findViewById(R.id.color);
        mCheck = (CheckBox)itemView.findViewById(R.id.checkbox);
        mLayout = (RelativeLayout)itemView.findViewById(R.id.layout);
    }
}

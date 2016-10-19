package com.korbkenny.recyclerview_lab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by KorbBookProReturns on 10/18/16.
 */

public class CustomViewHolder extends RecyclerView.ViewHolder {
    public TextView mTitleText;
    public TextView mDescriptText;
    public ImageView mTheSquare;
    public CheckBox mCheckBox;

    public CustomViewHolder(View itemView) {
        super(itemView);

        mTitleText = (TextView) itemView.findViewById(R.id.TitleText);
        mDescriptText = (TextView) itemView.findViewById(R.id.DescriptText);
        mTheSquare = (ImageView) itemView.findViewById(R.id.theSquare);
        mCheckBox = (CheckBox) itemView.findViewById(R.id.checkbox);





    }
}

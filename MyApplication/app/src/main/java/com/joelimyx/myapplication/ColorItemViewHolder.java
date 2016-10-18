package com.joelimyx.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Joe on 10/18/16.
 */

public class ColorItemViewHolder extends RecyclerView.ViewHolder {
    ImageView mColorImage;
    TextView mTextView1, mTextView2;
    CheckBox mCheckBox;

    public ColorItemViewHolder(View itemView) {
        super(itemView);
        mColorImage = (ImageView) itemView.findViewById(R.id.colorImage);
        mTextView1= (TextView) itemView.findViewById(R.id.text1);
        mTextView2 = (TextView) itemView.findViewById(R.id.text2);
        mCheckBox = (CheckBox) itemView.findViewById(R.id.checkBox);
    }
}

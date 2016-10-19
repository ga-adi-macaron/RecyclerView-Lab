package com.justinwells.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by justinwells on 10/18/16.
 */

public class CustomViewHolder extends RecyclerView.ViewHolder {

    public TextView textView1, textView2;
    public CheckBox checkBox;
    public ImageView imageView;
    public RelativeLayout relativeLayout;

    public CustomViewHolder(View itemView) {
        super(itemView);

        textView1 = (TextView) itemView.findViewById(R.id.title);
        textView2 = (TextView) itemView.findViewById(R.id.description);
        checkBox = (CheckBox) itemView.findViewById(R.id.checkbox);
        imageView = (ImageView) itemView.findViewById(R.id.box);
        relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayout);

    }


}

package net.serkanbal.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Serkan on 18/10/16.
 */

public class CustomViewHolder extends RecyclerView.ViewHolder {
    public TextView mTextTitle, mTextDesc;
    public ImageView mImage;
    public CheckBox mCheckBox;

    public CustomViewHolder(View itemView) {
        super(itemView);
        mTextTitle = (TextView) itemView.findViewById(R.id.textbig);
        mTextDesc = (TextView) itemView.findViewById(R.id.textsmall);
        mImage = (ImageView) itemView.findViewById(R.id.image);
        mCheckBox = (CheckBox) itemView.findViewById(R.id.checkbox);
    }
}

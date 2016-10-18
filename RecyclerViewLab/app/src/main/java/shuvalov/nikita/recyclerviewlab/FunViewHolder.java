package shuvalov.nikita.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by NikitaShuvalov on 10/18/16.
 */

public class FunViewHolder extends RecyclerView.ViewHolder {
    private TextView mMainText, mSubText;
    private ImageView mImgView;
    private CheckBox mCheckBox;
    private RelativeLayout mRelLay;

    public FunViewHolder(View itemView) {
        super(itemView);

        mMainText = (TextView)itemView.findViewById(R.id.mainText);
        mSubText = (TextView)itemView.findViewById(R.id.subText);
        mImgView = (ImageView)itemView.findViewById(R.id.imgView);
        mCheckBox = (CheckBox)itemView.findViewById(R.id.checkBox);

        mRelLay = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);
    }
}

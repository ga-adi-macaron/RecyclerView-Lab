package com.scottlindley.recyclerviewslab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


/**
 * Created by Scott Lindley on 10/18/2016.
 */

public class BonusViewHolder extends RecyclerView.ViewHolder{
    public TextView mBonusText;

    public BonusViewHolder(View itemView) {
        super(itemView);

        mBonusText = (TextView)itemView.findViewById(R.id.bonus_text);
    }


}

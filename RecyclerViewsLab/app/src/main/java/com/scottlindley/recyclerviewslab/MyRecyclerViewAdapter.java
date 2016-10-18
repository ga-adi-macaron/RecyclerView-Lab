package com.scottlindley.recyclerviewslab;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Scott Lindley on 10/18/2016.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter{
    List<Object> mItemObjects;
    public final int LIST_ITEM = 0;
    public final int BONUS_ITEM = 1;

    @Override
    public int getItemViewType(int position) {
        if(mItemObjects.get(position) instanceof ListItem){
            return LIST_ITEM;
        }else if(mItemObjects.get(position) instanceof BonusListItem){
            return BONUS_ITEM;
        }
        return -1;
    }

    public MyRecyclerViewAdapter(List<Object> itemObjects) {
        mItemObjects = itemObjects;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
                View itemView = LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_layout, parent, false);
                 return new MyViewHolder(itemView);
            case 1:
                View itemView2 = LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.bonus_layout, parent, false);
                return new BonusViewHolder(itemView2);
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        switch (holder.getItemViewType()) {
            case 0:
                MyViewHolder myViewHolder = (MyViewHolder)holder;
                configureMyViewHolder(myViewHolder, position);
                break;
            case 1:
                BonusViewHolder bonusViewHolder = (BonusViewHolder)holder;
                configureBonusViewHolder(bonusViewHolder, position);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mItemObjects.size();
    }

    public void configureMyViewHolder(MyViewHolder myViewHolder, final int position){
        final ListItem listItem = (ListItem)mItemObjects.get(position);
        myViewHolder.mCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!listItem.mIsChecked) {
                    listItem.setChecked(true);
                    listItem.setAlpha(0.5f);
                    notifyItemChanged(position);
                } else {
                    listItem.setChecked(false);
                    listItem.setAlpha(1.0f);
                    notifyItemChanged(position);
                }
            }
        });
        int red = listItem.mImageSrc[0];
        int green = listItem.mImageSrc[1];
        int blue = listItem.mImageSrc[2];
        myViewHolder.mImageView.setBackgroundColor(Color.rgb(red, green, blue));

        if (listItem.mIsChecked) {
            myViewHolder.mCheckBox.setChecked(true);
            myViewHolder.mTitleText.setAlpha(listItem.mAlpha);
            myViewHolder.mDescriptionText.setAlpha(listItem.mAlpha);
            myViewHolder.mImageView.setAlpha(listItem.mAlpha);
        } else {
            myViewHolder.mCheckBox.setChecked(false);
            myViewHolder.itemView.setAlpha(listItem.mAlpha);
            myViewHolder.mTitleText.setAlpha(listItem.mAlpha);
            myViewHolder.mDescriptionText.setAlpha(listItem.mAlpha);
            myViewHolder.mImageView.setAlpha(listItem.mAlpha);
        }
    }

    public void configureBonusViewHolder(BonusViewHolder bvw, final int position){
        final BonusListItem bonusItem = (BonusListItem)mItemObjects.get(position);
        bvw.mBonusText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bonusItem.switchColor();
                notifyItemChanged(position);
            }
        });
        int[] rgb = {bonusItem.mR, bonusItem.mG, bonusItem.mB};
        bvw.mBonusText.setTextColor(Color.rgb(rgb[0],rgb[1],rgb[2]));
    }
}

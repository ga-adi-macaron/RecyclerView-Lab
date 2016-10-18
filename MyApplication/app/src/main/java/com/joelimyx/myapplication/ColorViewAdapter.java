package com.joelimyx.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

/**
 * Created by Joe on 10/18/16.
 */

public class ColorViewAdapter extends RecyclerView.Adapter<ColorItemViewHolder> {
    List<ColorItem> mColorItemList;

    public ColorViewAdapter(List<ColorItem> colorItemList) {
        mColorItemList = colorItemList;
    }

    @Override
    public ColorItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.color_adapter,parent,false);
        return new ColorItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ColorItemViewHolder holder, final int position) {
        final ColorItem colorItem = mColorItemList.get(position);
        holder.mTextView1.setText(colorItem.getText1());
        holder.mTextView2.setText(colorItem.getText2());
        holder.mColorImage.setBackgroundColor(colorItem.getColor());
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String message = "Item "+ (position+1)+" contain "+colorItem.getText1()+" And "+colorItem.getText2();
                if (isChecked){
                    Toast.makeText(buttonView.getContext(), message+" is checked.", Toast.LENGTH_LONG).show();
                    mColorItemList.get(position).setChecked(true);
                }else{

                    Toast.makeText(buttonView.getContext(), message+" is not checked.", Toast.LENGTH_LONG).show();
                    mColorItemList.get(position).setChecked(false);
                }
            }
        };
        holder.mCheckBox.setOnCheckedChangeListener(onCheckedChangeListener);
        holder.mCheckBox.setChecked(colorItem.isChecked());
    }

    @Override
    public int getItemCount() {
        return mColorItemList.size();
    }
}

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

        holder.mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = "Item "+ (position+1)+" contain "+colorItem.getText1()+" And "+colorItem.getText2();
                if (mColorItemList.get(position).isChecked()) {
                    holder.mCheckBox.setChecked(false);
                    mColorItemList.get(position).setChecked(false);
                    Toast.makeText(v.getContext(), message+" is unchecked.", Toast.LENGTH_SHORT).show();
                    notifyItemChanged(position);
                } else{
                    holder.mCheckBox.setChecked(true);
                    mColorItemList.get(position).setChecked(true);
                    Toast.makeText(v.getContext(), message+" is checked.", Toast.LENGTH_SHORT).show();
                    notifyItemChanged(position);

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mColorItemList.size();
    }
}

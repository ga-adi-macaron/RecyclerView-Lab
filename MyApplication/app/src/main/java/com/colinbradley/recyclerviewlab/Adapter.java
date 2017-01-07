package com.colinbradley.recyclerviewlab;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by colinbradley on 1/7/17.
 */

public class Adapter extends RecyclerView.Adapter<ViewHolder>{

    ArrayList<Object> mList;

    public Adapter(ArrayList<Object> list){
        mList = list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.mTitle.setText(mList.get(position).getmTitle());
        holder.mDescription.setText(mList.get(position).getmDescription());
        holder.mColor.setBackgroundColor(Color.parseColor(mList.get(position).getmColor()));
        holder.mCheck.setChecked(mList.get(position).ismCheck());

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mList.get(position).ismCheck()){
                    Toast.makeText(v.getContext(), "BOX IS NOW UN-CHECKED", Toast.LENGTH_SHORT).show();
                    mList.get(position).setmCheck(false);
                }else {
                    Toast.makeText(v.getContext(), "BOX IS NOW CHECKED", Toast.LENGTH_SHORT).show();
                    mList.get(position).setmCheck(true);
                }
                notifyItemChanged(position);
            }
        };

        holder.mLayout.setOnClickListener(clickListener);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}

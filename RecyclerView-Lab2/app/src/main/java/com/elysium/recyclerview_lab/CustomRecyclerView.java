package com.elysium.recyclerview_lab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by jay on 10/18/16.
 */

public class CustomRecyclerView extends RecyclerView.Adapter<CustomViewHolder> {
    List<CustomObject> mCustomObjectList;


    public CustomRecyclerView(List<CustomObject> customObjectList) {
        mCustomObjectList = customObjectList;

    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.id.custom_layout, parent, false);
        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        for (int i = 0; i < 6; i++) { /** Not sure if a for loop is used here... I'm beginning to think not. */
            return;
        }
        /** */

    }

    @Override
    public int getItemCount() {
        return 0; /** */
    }
}
}

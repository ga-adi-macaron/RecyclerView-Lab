package net.serkanbal.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Serkan on 18/10/16.
 */

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    List<CustomObject> mCustomObjectList;

    public CustomRecyclerAdapter(List<CustomObject> customObjectList) {
        mCustomObjectList = customObjectList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout,
                parent, false);
        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {
        //This is where you insert the data into your views.
        holder.mTextTitle.setText(mCustomObjectList.get(position).getTextTitle());
        holder.mTextDesc.setText(mCustomObjectList.get(position).getTextDesc());
        holder.mCheckBox.setChecked(mCustomObjectList.get(position).isCheckBox());
        holder.mImage.setBackgroundColor(mCustomObjectList.get(position).getColor());


        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomObject obj = mCustomObjectList.get(position);
                switch (v.getId()) {
                    case R.id.checkbox:
                        if (obj.isCheckBox() == false) {
                            obj.setCheckBox(true);
                        } else {
                            obj.setCheckBox(false);
                        }
                        Toast.makeText(v.getContext(),
                                "Is the checkbox at position " + position + " checked? " + obj.isCheckBox(),
                                Toast.LENGTH_SHORT).show();
                        notifyItemChanged(position);
                        break;
                }
            }
        };

        holder.mCheckBox.setOnClickListener(onClickListener);
    }

    @Override
    public int getItemCount() {
        return mCustomObjectList.size();
    }
}

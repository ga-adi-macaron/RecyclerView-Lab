package shuvalov.nikita.recyclerviewlab;

import android.support.annotation.DrawableRes;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by NikitaShuvalov on 10/18/16.
 */

public class FunRecyclerAdapter extends RecyclerView.Adapter<FunViewHolder> {
    List<FunData> mDataList;

    public FunRecyclerAdapter(List<FunData> dataList){
        mDataList=dataList;
    }
    @Override
    public FunViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.funlayout, parent, false);
        return new FunViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FunViewHolder holder, final int position) {
        TextView textView = (TextView) holder.itemView.findViewById(R.id.mainText);
        TextView textView2 = (TextView) holder.itemView.findViewById(R.id.subText);

        ImageView imgView = (ImageView) holder.itemView.findViewById(R.id.imgView);
        final CheckBox checkBox = (CheckBox) holder.itemView.findViewById(R.id.checkBox);
        RelativeLayout relativeLayout = (RelativeLayout)holder.itemView.findViewById(R.id.relativeLayout);

        textView.setText(mDataList.get(position).mText1);
        textView2.setText(mDataList.get(position).mText2);

        imgView.setImageResource(mDataList.get(position).mColor);
        checkBox.setChecked(mDataList.get(position).checked);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBox.setChecked(!mDataList.get(position).checked);
                notifyItemChanged(position);
                mDataList.get(position).toggleChecked();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }
}

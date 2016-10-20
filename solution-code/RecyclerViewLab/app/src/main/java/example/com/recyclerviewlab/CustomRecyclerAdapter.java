package example.com.recyclerviewlab;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Skywingz on 7/5/16.
 */
public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    ArrayList<CustomObject> objects;


    public CustomRecyclerAdapter(ArrayList<CustomObject> objectList) {
        this.objects = objectList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View newView = inflater.inflate(R.layout.custom_layout_with_checkbox, parent, false);

        CustomViewHolder vh = new CustomViewHolder(newView);

        return vh;
    }

    @Override
    public void onBindViewHolder(final CustomViewHolder holder, final int position) {
        //Set up views

        holder.color.setBackgroundColor(Color.parseColor(objects.get(position).getColor()));
        holder.title.setText(objects.get(position).getTitle());
        holder.decription.setText(objects.get(position).getDecription());
        holder.box.setChecked(objects.get(position).isChecked());


        //Define and set up click listener

        View.OnClickListener itemClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (holder.box.isChecked()) {
                    Toast.makeText(view.getContext(), "Check box changed to UNCHECKED", Toast.LENGTH_SHORT).show();
                    objects.get(position).setChecked(false);
                } else {
                    Toast.makeText(view.getContext(), "Check box changed to CHECKED", Toast.LENGTH_SHORT).show();
                    objects.get(position).setChecked(true);
                }
                notifyItemChanged(position);
            }
        };

        holder.relativeLayout.setOnClickListener(itemClickListener);
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }
}

package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Skywingz on 7/5/16.
 */
public class CustomViewHolder extends RecyclerView.ViewHolder {

    TextView color, title, decription;
    CheckBox box;
    RelativeLayout relativeLayout;


    public CustomViewHolder(View itemView) {
        super(itemView);

        color = (TextView) itemView.findViewById(R.id.secondColorTV);
        title = (TextView) itemView.findViewById(R.id.secondTitleTV);
        decription = (TextView) itemView.findViewById(R.id.secondDescriptionTV);
        box = (CheckBox) itemView.findViewById(R.id.secondCheckBox);
        relativeLayout = (RelativeLayout) itemView.findViewById(R.id.secondRelative);
    }
}

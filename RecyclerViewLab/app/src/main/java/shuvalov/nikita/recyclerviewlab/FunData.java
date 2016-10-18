package shuvalov.nikita.recyclerviewlab;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

/**
 * Created by NikitaShuvalov on 10/18/16.
 */

public class FunData {
    public String mText1, mText2;
    public boolean checked;
    public int mColor;

    public FunData(String text1, String text2, int color){
        mText1 = text1;
        mText2 = text2;
        checked= false;
        if(color==-1){
            mColor=R.drawable.blank;
        }else {
            mColor = color;
        }
    }
    public FunData (String text1, String text2){
        mText1=text1;
        mText2=text2;
        checked=false;
        mColor=R.drawable.blank;
    }

    public void toggleChecked(){
        checked = !checked;
    }
}

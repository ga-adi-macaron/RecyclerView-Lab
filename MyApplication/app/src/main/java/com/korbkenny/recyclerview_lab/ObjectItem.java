package com.korbkenny.recyclerview_lab;

import android.graphics.Color;

/**
 * Created by KorbBookProReturns on 10/18/16.
 */

public class ObjectItem {
    String mTitle;
    String mDesc;
    boolean mCheck;
    int mColor;

    public ObjectItem() {
        mTitle = "Title";
        mDesc = "Description";
        mCheck = false;
        mColor = Color.RED;
    }

    public ObjectItem(String title, String desc, int color){
        mTitle = title;
        mDesc = desc;
        mColor = color;
    }

    public void setCheck(boolean check) {
        mCheck = check;
    }

    public void setColor(int color) {
        mColor = color;
    }

    public void setTitle(String title) {

        mTitle = title;
    }

    public void setDesc(String desc) {
        mDesc = desc;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDesc() {
        return mDesc;
    }

    public boolean isCheck() {
        return mCheck;
    }

    public int getColor() {
        return mColor;
    }
}

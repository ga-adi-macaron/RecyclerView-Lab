package com.joelimyx.myapplication;

/**
 * Created by Joe on 10/18/16.
 */

public class ColorItem {
    private int mColor;
    private boolean mIsChecked;
    private String mText1;
    private String mText2;

    public ColorItem(int color, String text1, String text2) {
        mColor = color;
        mText1 = text1;
        mText2 = text2;
        mIsChecked = false;
    }

    public int getColor() {
        return mColor;
    }

    public void setColor(int color) {
        mColor = color;
    }

    public boolean isChecked() {
        return mIsChecked;
    }

    public void setChecked(boolean checked) {
        mIsChecked = checked;
    }

    public String getText1() {
        return mText1;
    }

    public void setText1(String text1) {
        mText1 = text1;
    }

    public String getText2() {
        return mText2;
    }

    public void setText2(String text2) {
        mText2 = text2;
    }
}

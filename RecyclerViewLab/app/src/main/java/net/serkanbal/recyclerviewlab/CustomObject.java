package net.serkanbal.recyclerviewlab;

import android.graphics.Color;

/**
 * Created by Serkan on 18/10/16.
 */

public class CustomObject {
    private String mTextTitle;
    private String mTextDesc;
    private int mColor;
    private boolean mCheckBox;

    public CustomObject(String textTitle, String textDesc, int color, boolean checkBox) {
        mTextTitle = textTitle;
        mTextDesc = textDesc;
        mColor = color;
        mCheckBox = checkBox;
    }

    public CustomObject() {
        mTextTitle = "A GREAT LIST";
        mTextDesc = "Description of a great list";
        mColor = Color.RED;
        mCheckBox = false;
    }

    public String getTextTitle() {
        return mTextTitle;
    }

    public void setTextTitle(String textTitle) {
        mTextTitle = textTitle;
    }

    public String getTextDesc() {
        return mTextDesc;
    }

    public void setTextDesc(String textDesc) {
        mTextDesc = textDesc;
    }

    public int getColor() {
        return mColor;
    }

    public void setColor(int color) {
        mColor = color;
    }

    public boolean isCheckBox() {
        return mCheckBox;
    }

    public void setCheckBox(boolean checkBox) {
        mCheckBox = checkBox;
    }
}
package com.jonathanlieblich.myapplication;

import android.graphics.Color;

/**
 * Created by jonlieblich on 10/18/16.
 */

public class CustomObject {
    private String mTitle, mDescription;
    private int mColor;
    private boolean mChecked;

    public CustomObject(String title, String description, int color, boolean checked) {
        mTitle = title;
        mDescription = description;
        mColor = color;
        mChecked = checked;
    }

    public CustomObject() {
        mTitle = "Title";
        mDescription = "Description";
        mColor = Color.GREEN;
        mChecked = false;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public int getColor() {
        return mColor;
    }

    public void setColor(int color) {
        mColor = color;
    }

    public boolean isChecked() {
        return mChecked;
    }

    public void setChecked(boolean checked) {
        mChecked = checked;
    }
}

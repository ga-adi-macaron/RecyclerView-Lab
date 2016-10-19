package com.ezequiel.student.recyclerviewlab;

/**
 * Created by student on 10/18/16.
 */
public class CustomObject {
    private String mTitle, mDescription;
    private int mColor;
    private boolean mCheck;

    public CustomObject(String title, String description, int color, boolean check) {
        mTitle = title;
        mDescription = description;
        mColor = color;
        mCheck = check;
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

    public boolean isCheck() {
        return mCheck;
    }

    public void setCheck(boolean check) {
        mCheck = check;
    }
}

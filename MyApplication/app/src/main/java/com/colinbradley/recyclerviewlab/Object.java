package com.colinbradley.recyclerviewlab;

/**
 * Created by colinbradley on 1/7/17.
 */

public class Object {
    String mTitle;
    String mDescription;
    String mColor;
    boolean mCheck;

    public Object(){}

    public Object(String mColor, String mTitle, String mDescription,  boolean mCheck) {
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mColor = mColor;
        this.mCheck = mCheck;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmColor() {
        return mColor;
    }

    public void setmColor(String mColor) {
        this.mColor = mColor;
    }

    public boolean ismCheck() {
        return mCheck;
    }

    public void setmCheck(boolean mCheck) {
        this.mCheck = mCheck;
    }
}

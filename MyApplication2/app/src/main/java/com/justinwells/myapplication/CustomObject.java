package com.justinwells.myapplication;

import android.graphics.Color;

/**
 * Created by justinwells on 10/18/16.
 */

public class CustomObject {
 String text1, text2;
 int color;
 boolean check;

    public CustomObject() {
        text1 = "Title";
        text2 = "Description";
        color = Color.BLUE;
        check = false;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}

package com.scottlindley.recyclerviewslab;

import java.util.Random;

/**
 * Created by Scott Lindley on 10/18/2016.
 */

public class ListItem {
    int[] mImageSrc;
    String mTitleTextString;
    String mDescriptionTextString;
    boolean mIsChecked;
    float mAlpha;

    public ListItem() {
        initImageSrcColor();
        mTitleTextString = "Title Text";
        mDescriptionTextString = "Description Text";
        mIsChecked = false;
        mAlpha = 1.0f;
    }

    public void setChecked(boolean checked) {
        mIsChecked = checked;
    }

    public void setAlpha(float alpha) {
        if (alpha <= 1 && alpha >= 0) {
            mAlpha = alpha;
        }
    }

    public void initImageSrcColor(){
        mImageSrc = new int[3];
        Random random = new Random();
        mImageSrc[0] = random.nextInt(255);
        mImageSrc[1] = random.nextInt(255);
        mImageSrc[2] = random.nextInt(255);
    }
}

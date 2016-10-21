package com.scottlindley.recyclerviewslab;

/**
 * Created by Scott Lindley on 10/18/2016.
 */

public class BonusListItem {
    public String mBonusText;
    public int mR, mG, mB;

    public BonusListItem() {
        mBonusText = "BONUS";
        mR = 254;
        mG = 254;
        mB = 254;
    }

    public void switchColor(){
        if (mR==254){
            mR = 0;
            mG = 0;
            mB = 0;
        }else{
            mR=254;
            mG=254;
            mB=254;
        }
    }
}

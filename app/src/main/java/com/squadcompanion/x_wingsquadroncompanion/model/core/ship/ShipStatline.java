package com.squadcompanion.x_wingsquadroncompanion.model.core.ship;

/**
 * Created by Bird on 6/15/2017.
 */

public class ShipStatline {
    public int mAttackValue;
    public int mAgilityValue;
    public int mHullValue;
    public int mShieldValue;

    public ShipStatline(int mAttackValue, int mAgilityValue, int mHullValue, int mShieldValue) {
        this.mAttackValue = mAttackValue;
        this.mAgilityValue = mAgilityValue;
        this.mHullValue = mHullValue;
        this.mShieldValue = mShieldValue;
    }
}

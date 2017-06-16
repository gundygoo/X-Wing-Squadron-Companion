package com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade;

/**
 * Created by Bird on 6/15/2017.
 */

public class UpgradeSlot extends BaseUpgrade {

    public UpgradeSlot(UpgradeType mUpgradeType) {
        super(mUpgradeType);
    }

    @Override
    public String getName(){
        return "This Upgrade Slot has no name";
    }

    @Override
    public int getPointCost(){
        return 999999;
    }

    @Override
    public String getCardText(){
        return "This Upgrade Slot has no card text";
    }
}

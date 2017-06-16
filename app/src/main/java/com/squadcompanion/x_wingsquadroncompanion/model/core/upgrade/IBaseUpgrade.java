package com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade;

/**
 * Created by Bird on 6/15/2017.
 */

public interface IBaseUpgrade {
    UpgradeType getUpgradeType();

    String getName();

    int getPointCost();

    String getCardText();
}

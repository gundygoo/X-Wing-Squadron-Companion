package com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade;

import java.util.List;

/**
 * Created by Bird on 6/15/2017.
 */

public class Upgrade extends BaseUpgrade {
    public Upgrade(UpgradeType mUpgradeType, String mName, int mPointCost, String mCardText, List<String> factionList) {
        super(mUpgradeType, mName, mPointCost, mCardText, factionList);
    }
}

package com.squadcompanion.x_wingsquadroncompanion.model.core.pilot;

import com.squadcompanion.x_wingsquadroncompanion.model.core.ship.ShipStatline;
import com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade.UpgradeSlot;

import java.util.List;

/**
 * Created by Bird on 6/15/2017.
 */

public class Pilot {
    public List<UpgradeSlot> mUpgradeSlotList;
    public String mName;
    public int mPointCost;
    public ShipStatline mShipStatLine;
    public boolean mIsUnique;
    public String mShipName;

    public Pilot(List<UpgradeSlot> mUpgradeSlotList, String mName, int mPointCost, ShipStatline mShipStatLine, boolean isUnique, String shipName) {
        this.mUpgradeSlotList = mUpgradeSlotList;
        this.mName = mName;
        this.mPointCost = mPointCost;
        this.mShipStatLine = mShipStatLine;
        this.mIsUnique = isUnique;
        this.mShipName = shipName;
    }
}

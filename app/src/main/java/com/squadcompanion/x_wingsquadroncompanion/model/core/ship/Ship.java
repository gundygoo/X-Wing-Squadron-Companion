package com.squadcompanion.x_wingsquadroncompanion.model.core.ship;


import com.squadcompanion.x_wingsquadroncompanion.model.core.faction.FactionType;
import com.squadcompanion.x_wingsquadroncompanion.model.core.pilot.Pilot;
import com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade.Upgrade;
import com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade.UpgradeSlot;

import java.util.List;

/**
 * Created by Bird on 6/11/2017.
 */

public class Ship {
    public Pilot mPilot;
    public String shipName;
    public FactionType mFactionType;
    public List<Upgrade> mShipUpgradeList;
    public List<UpgradeSlot> mShipUpgradeSlotList;
    public ShipStatline mShipStatline;

    public Ship(String shipName, FactionType mFactionType, Pilot mPilot, List<Upgrade> mShipUpgradeList) {
        this.shipName = shipName;
        this.mFactionType = mFactionType;
        this.mPilot = mPilot;
        this.mShipUpgradeList = mShipUpgradeList;
        this.mShipUpgradeSlotList = mPilot.mUpgradeSlotList;
        this.mShipStatline = mPilot.mShipStatLine;
    }
}

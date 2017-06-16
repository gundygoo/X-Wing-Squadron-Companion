package com.squadcompanion.x_wingsquadroncompanion.model.core.faction;

import com.squadcompanion.x_wingsquadroncompanion.model.core.ship.Ship;
import com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade.Upgrade;

import java.util.List;

/**
 * Created by Bird on 6/11/2017.
 */

public class BaseFaction implements IBaseFaction {
    protected FactionType mFactionType;
    protected List<Ship> mFactionShipList;
    protected List<Upgrade> mFactionUpgradeList;

    @Override
    public void buildShipListForFaction(FactionType factionType) {

    }

    @Override
    public void buildUpgradeListForFaction(FactionType factionType) {

    }
}

package com.squadcompanion.x_wingsquadroncompanion.model.core.faction;

/**
 * Created by Bird on 6/11/2017.
 */

public interface IBaseFaction {
    void buildShipListForFaction(FactionType factionType);

    void buildUpgradeListForFaction(FactionType factionType);
}

package com.squadcompanion.x_wingsquadroncompanion.model.core;

import com.squadcompanion.x_wingsquadroncompanion.model.core.faction.BaseFaction;
import com.squadcompanion.x_wingsquadroncompanion.model.core.pilot.Pilot;
import com.squadcompanion.x_wingsquadroncompanion.model.core.ship.Ship;
import com.squadcompanion.x_wingsquadroncompanion.model.core.ship.ShipStatline;
import com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade.Upgrade;
import com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade.UpgradeSlot;
import com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade.UpgradeType;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Bird on 6/11/2017.
 */

public class ModelRepository {
    private List<Ship> mFullShipList;
    private List<Pilot> mFullPilotList;
    private List<BaseFaction> mFullFactionList;
    private List<Upgrade> mFullUpgradeList;

    public void ModelRepository(){
        init();
    }

    public void init(){
        //Do this first, doesnt depend on any of the other lists being built yet
        generatePilotList();
        //Do this next, as it also does not depend on other filled lists
        generateUpgradeList();
        //do this next, as it depends on both pilots and upgrades
        generateShipList();
        //do this last, as it depends on all of the above
        generateFactionList();
    }

    public void generateShipList(){

    }

    public void generatePilotList(){
        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.ELITE_PILOT_TALENT),
                        new UpgradeSlot(UpgradeType.SYSTEM),
                        new UpgradeSlot(UpgradeType.MISSILE),
                        new UpgradeSlot(UpgradeType.TECH)),
                "Backdraft",
                27,
                new ShipStatline(2, 2, 3, 3),
                true,
                "TIE/SF Fighter"));

        
    }

    public void generateFactionList(){

    }

    public void generateUpgradeList(){

    }
}

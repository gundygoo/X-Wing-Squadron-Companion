package com.squadcompanion.x_wingsquadroncompanion.model.core;

import com.squadcompanion.x_wingsquadroncompanion.model.core.faction.BaseFaction;
import com.squadcompanion.x_wingsquadroncompanion.model.core.pilot.PilotRepository;
import com.squadcompanion.x_wingsquadroncompanion.model.core.ship.Ship;
import com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade.Upgrade;
import com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade.UpgradeType;

import java.util.Collections;
import java.util.List;

/**
 * Created by Bird on 6/11/2017.
 */

public class ModelRepository {
    private List<Ship> mFullShipList;
    PilotRepository mPilotRepository;
    private List<BaseFaction> mFullFactionList;
    private List<Upgrade> mFullUpgradeList;

    public void ModelRepository(){
        init();
    }

    public void init(){
        //Do this first, doesnt depend on any of the other lists being built yet
        mPilotRepository = new PilotRepository();
        //Do this next, as it also does not depend on other filled lists
        generateUpgradeList();
        //do this next, as it depends on both pilots and upgrades
        generateShipList();
        //do this last, as it depends on all of the above
        generateFactionList();
    }

    public void generateShipList(){

    }

    public void generateFactionList(){

    }

    public void generateUpgradeList(){
        mFullUpgradeList.add(new Upgrade(UpgradeType.CREW,
                "\"Chopper\"",
                0,
                "You may perform actions even while you are stressed.  After you perform an action while you are stressed, suffer 1 damage.",
                Collections.singletonList("Rebel")));
    }
}

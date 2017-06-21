package com.squadcompanion.x_wingsquadroncompanion.model.core;

import com.squadcompanion.x_wingsquadroncompanion.model.core.faction.BaseFaction;
import com.squadcompanion.x_wingsquadroncompanion.model.core.pilot.Pilot;
import com.squadcompanion.x_wingsquadroncompanion.model.core.ship.Ship;
import com.squadcompanion.x_wingsquadroncompanion.model.core.ship.ShipStatline;
import com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade.Upgrade;
import com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade.UpgradeSlot;
import com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade.UpgradeType;

import java.util.Arrays;
import java.util.Collections;
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
                        new UpgradeSlot(UpgradeType.TECH),
                        new UpgradeSlot(UpgradeType.MODIFICATION),
                        new UpgradeSlot(UpgradeType.TITLE)),
                "\"Backdraft\"",
                27,
                new ShipStatline(2, 2, 3, 3),
                true,
                "TIE/SF Fighter",
                7));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.ELITE_PILOT_TALENT),
                        new UpgradeSlot(UpgradeType.CREW),
                        new UpgradeSlot(UpgradeType.SYSTEM),
                        new UpgradeSlot(UpgradeType.ILLICIT),
                        new UpgradeSlot(UpgradeType.MODIFICATION),
                        new UpgradeSlot(UpgradeType.TITLE)),
                "4-LOM",
                27,
                new ShipStatline(3, 1, 4, 4),
                true,
                "G-1A Starfighter",
                6));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.MODIFICATION)),
                "\"Backstabber\"",
                16,
                new ShipStatline(2, 3, 3, 0),
                true,
                "TIE Fighter",
                6));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.TORPEDO),
                        new UpgradeSlot(UpgradeType.ASTROMECH),
                        new UpgradeSlot(UpgradeType.TECH),
                        new UpgradeSlot(UpgradeType.MODIFICATION)),
                "\"Blue Ace\"",
                27,
                new ShipStatline(3, 2, 3, 3),
                true,
                "T-70 W-Wing",
                5));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.SYSTEM),
                        new UpgradeSlot(UpgradeType.TURRET),
                        new UpgradeSlot(UpgradeType.TORPEDO),
                        new UpgradeSlot(UpgradeType.TORPEDO),
                        new UpgradeSlot(UpgradeType.CREW),
                        new UpgradeSlot(UpgradeType.CREW),
                        new UpgradeSlot(UpgradeType.MODIFICATION),
                        new UpgradeSlot(UpgradeType.TITLE)),
                "\"Chopper\"",
                37,
                new ShipStatline(4, 0, 10, 6),
                true,
                "VCX-100",
                4));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.MODIFICATION),
                        new UpgradeSlot(UpgradeType.TITLE)),
                "\"Countdown\"",
                20,
                new ShipStatline(3, 2, 4, 0),
                true,
                "TIE Striker",
                5));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.MODIFICATION)),
                "\"Dark Curse\"",
                16,
                new ShipStatline(2, 3, 3, 0),
                true,
                "TIE Fighter",
                6));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.TORPEDO),
                        new UpgradeSlot(UpgradeType.TORPEDO),
                        new UpgradeSlot(UpgradeType.MISSILE),
                        new UpgradeSlot(UpgradeType.MISSILE),
                        new UpgradeSlot(UpgradeType.BOMB),
                        new UpgradeSlot(UpgradeType.MODIFICATION),
                        new UpgradeSlot(UpgradeType.TITLE)),
                "\"Deathfire\"",
                17,
                new ShipStatline(2, 2, 6, 0),
                true,
                "TIE Bomber",
                3));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.SYSTEM),
                        new UpgradeSlot(UpgradeType.TORPEDO),
                        new UpgradeSlot(UpgradeType.TORPEDO),
                        new UpgradeSlot(UpgradeType.MISSILE),
                        new UpgradeSlot(UpgradeType.MISSILE),
                        new UpgradeSlot(UpgradeType.BOMB),
                        new UpgradeSlot(UpgradeType.BOMB),
                        new UpgradeSlot(UpgradeType.MODIFICATION)),
                "\"Deathrain\"",
                26,
                new ShipStatline(2, 1, 6, 3),
                true,
                "TIE Punisher",
                6));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.ELITE_PILOT_TALENT),
                        new UpgradeSlot(UpgradeType.TURRET),
                        new UpgradeSlot(UpgradeType.MISSILE),
                        new UpgradeSlot(UpgradeType.MISSILE),
                        new UpgradeSlot(UpgradeType.MODIFICATION)),
                "\"Double Edge\"",
                19,
                new ShipStatline(2, 2, 4, 1),
                true,
                "TIE Aggressor",
                4));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.ELITE_PILOT_TALENT),
                        new UpgradeSlot(UpgradeType.MODIFICATION),
                        new UpgradeSlot(UpgradeType.TITLE)),
                "\"Duchess\"",
                23,
                new ShipStatline(3, 2, 4, 0),
                true,
                "TIE Striker",
                8));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.TURRET),
                        new UpgradeSlot(UpgradeType.TORPEDO),
                        new UpgradeSlot(UpgradeType.TORPEDO),
                        new UpgradeSlot(UpgradeType.ASTROMECH),
                        new UpgradeSlot(UpgradeType.MODIFICATION),
                        new UpgradeSlot(UpgradeType.TITLE)),
                "\"Dutch\" Vander",
                23,
                new ShipStatline(2, 1, 5, 3),
                true,
                "Y-Wing",
                6));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.ELITE_PILOT_TALENT),
                        new UpgradeSlot(UpgradeType.SYSTEM),
                        new UpgradeSlot(UpgradeType.CREW),
                        new UpgradeSlot(UpgradeType.MODIFICATION)),
                "\"Echo\"",
                30,
                new ShipStatline(4, 2, 2, 2),
                true,
                "TIE Phantom",
                6));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.TECH),
                        new UpgradeSlot(UpgradeType.MODIFICATION)),
                "\"Epsilon Ace\"",
                17,
                new ShipStatline(2, 3, 3, 1),
                true,
                "TIE/FO Fighter",
                4));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.TECH),
                        new UpgradeSlot(UpgradeType.TURRET),
                        new UpgradeSlot(UpgradeType.MODIFICATION)),
                "\"Epsilon Leader\"",
                19,
                new ShipStatline(2, 3, 3, 1),
                true,
                "TIE/FO Fighter",
                6));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.MODIFICATION),
                        new UpgradeSlot(UpgradeType.TITLE)),
                "\"Fel's Wrath\"",
                23,
                new ShipStatline(3, 3, 3, 0),
                true,
                "TIE Interceptor",
                5));

        mFullPilotList.add(new Pilot(
                Arrays.asList(new UpgradeSlot(UpgradeType.TORPEDO),
                        new UpgradeSlot(UpgradeType.ASTROMECH),
                        new UpgradeSlot(UpgradeType.MODIFICATION)),
                "\"Hobbie\" Klivian",
                25,
                new ShipStatline(3, 2, 3, 2),
                true,
                "X-Wing",
                5));
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

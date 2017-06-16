package com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade;

/**
 * Created by Bird on 6/15/2017.
 */

public enum UpgradeType {
    ELITE_PILOT_TALENT("Elite Pilot Talent"),
    CREW("Crew"),
    TORPEDO("Torpedo"),
    MISSILE("Missile"),
    CANNON("Cannon"),
    TURRET("Turret"),
    BOMB("Bomb"),
    ASTROMECH("Astromech"),
    SALVAGED_ASTROMECH("Salvaged Astromech"),
    SYSTEM("System"),
    TECH("Tech"),
    ILLICIT("Illicit"),
    TITLE("Title"),
    MODIFICATION("Modification");

    private String mName;

    UpgradeType(String upgradeTypeName){
        mName = upgradeTypeName;
    }

    public String getValue(){
        return mName;
    }
}

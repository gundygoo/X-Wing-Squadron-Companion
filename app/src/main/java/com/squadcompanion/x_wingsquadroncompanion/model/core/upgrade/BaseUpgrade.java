package com.squadcompanion.x_wingsquadroncompanion.model.core.upgrade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bird on 6/15/2017.
 */

public class BaseUpgrade implements IBaseUpgrade{
    protected UpgradeType mUpgradeType;
    protected String mName;
    protected int mPointCost;
    protected String mCardText;
    protected List<String> mFactionRestrictions;

    /**
     * Constructor for an upgrade
     *
     * @param mUpgradeType type of upgrade
     * @param mName name of upgrade
     * @param mPointCost point cost of upgrade
     * @param mCardText text of upgrade
     */
    public BaseUpgrade(UpgradeType mUpgradeType, String mName, int mPointCost, String mCardText, List<String> factionList) {
        this.mUpgradeType = mUpgradeType;
        this.mName = mName;
        this.mPointCost = mPointCost;
        this.mCardText = mCardText;
        this.mFactionRestrictions = factionList;
    }

    /**
     * Constructor for use when there is no applicable name, cost, or text associated with the upgrade
     * E.G. when being used as the parent for an upgrade slot
     *
     * @param mUpgradeType the type of upgrade
     */
    public BaseUpgrade(UpgradeType mUpgradeType){
        this.mUpgradeType = mUpgradeType;
        mName = null;
        mPointCost = -1;
        mCardText = null;
        mFactionRestrictions = new ArrayList<>();
    }

    @Override
    public UpgradeType getUpgradeType(){
        return mUpgradeType;
    }

    @Override
    public String getName(){
        return mName;
    }

    @Override
    public int getPointCost(){
        return mPointCost;
    }

    @Override
    public String getCardText(){
        return mCardText;
    }
}

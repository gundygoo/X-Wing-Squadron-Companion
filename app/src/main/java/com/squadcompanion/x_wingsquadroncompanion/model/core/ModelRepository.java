package com.squadcompanion.x_wingsquadroncompanion.model.core;

import com.squadcompanion.x_wingsquadroncompanion.model.core.ship.Ship;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bird on 6/11/2017.
 */

public class ModelRepository {
    private List<Ship> mFullShipList;

    public void init(){

    }

    public List<Ship> generateShipListForFaction(){
        return new ArrayList<>();
    }
}

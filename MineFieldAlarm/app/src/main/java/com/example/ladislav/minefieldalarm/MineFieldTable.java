package com.example.ladislav.minefieldalarm;

import java.util.HashMap;

/**
 * Singleton class.
 * Serves as storage to all known minefields and their exact location.
 */

// TODO read data from file that holds location data of mine fields and store it in map

public class MineFieldTable {

    private HashMap<String, MineField> mineFields;

    public void initialise() {
        //TODO add some "wild" data to table
        // TODO read data from file this is just putting one test item
    }

    public MineFieldTable getInstance() {
        return null;
    }

}
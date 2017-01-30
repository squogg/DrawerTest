package com.example.squog_000.drawertest.merp_entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by squog_000 on 02/01/2017.
 */

public class Spells {
    private List<SpellList> spellLists = new ArrayList<>();
    private int powerPoints;

    public List<SpellList> getSpellLists() {
        return spellLists;
    }

    public int getPowerPoints() {
        return powerPoints;
    }

    public void setPowerPoints(int powerPoints) {
        this.powerPoints = powerPoints;
    }
}

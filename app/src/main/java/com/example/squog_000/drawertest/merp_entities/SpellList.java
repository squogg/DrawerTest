package com.example.squog_000.drawertest.merp_entities;

/**
 * Created by squog_000 on 03/01/2017.
 */

public class SpellList {
    private SpellListType spellListType;
    private int knownPercentage;

    public SpellListType getSpellListType() {
        return spellListType;
    }

    public void setSpellListType(SpellListType spellListType) {
        this.spellListType = spellListType;
    }

    public int getKnownPercentage() {
        return knownPercentage;
    }

    public void setKnownPercentage(int knownPercentage) {
        this.knownPercentage = knownPercentage;
    }
}

package com.example.squog_000.drawertest.merp_entities;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

/**
 * Created by squog_000 on 02/01/2017.
 */

public class Stat {
    private StatType statType;
    private int value;
    private Race race;
    private Map<Race, Map<StatType, Integer>> bonusesByRace;

    public Stat(StatType statType, int value, Race race) {
        this.statType = statType;
        this.value = value;
        this.race = race;

        Map<Race, Map<StatType, Integer>> bonusesByRace = new HashMap<>();

        Map<StatType, Integer> stats;

        //Hobbit
        stats = new HashMap<>();
        stats.put(StatType.Strength, -20);
        stats.put(StatType.Agility, 15);
        stats.put(StatType.Constitution, 15);
        stats.put(StatType.Intelligence, 0);
        stats.put(StatType.Intuition, -5);
        stats.put(StatType.Presence, -5);
        bonusesByRace.put(Race.Hobbit, stats);

        //Umli
        stats = new HashMap<>();
        stats.put(StatType.Strength, 5);
        stats.put(StatType.Agility, 0);
        stats.put(StatType.Constitution, 10);
        stats.put(StatType.Intelligence, 0);
        stats.put(StatType.Intuition, -5);
        stats.put(StatType.Presence, -5);
        bonusesByRace.put(Race.Umli, stats);

        //Dwarf
        stats = new HashMap<>();
        stats.put(StatType.Strength, 5);
        stats.put(StatType.Agility, -5);
        stats.put(StatType.Constitution, 15);
        stats.put(StatType.Intelligence, 0);
        stats.put(StatType.Intuition, -5);
        stats.put(StatType.Presence, -5);
        bonusesByRace.put(Race.Dwarf, stats);

        //Wose
        stats = new HashMap<>();
        stats.put(StatType.Strength, 0);
        stats.put(StatType.Agility, 0);
        stats.put(StatType.Constitution, 5);
        stats.put(StatType.Intelligence, 0);
        stats.put(StatType.Intuition, 0);
        stats.put(StatType.Presence, -5);
        bonusesByRace.put(Race.Wose, stats);

        //Man
        stats = new HashMap<>();
        stats.put(StatType.Strength, 5);
        stats.put(StatType.Agility, 0);
        stats.put(StatType.Constitution, 0);
        stats.put(StatType.Intelligence, 0);
        stats.put(StatType.Intuition, 0);
        stats.put(StatType.Presence, 0);
        bonusesByRace.put(Race.Man, stats);

        //Dunadan
        stats = new HashMap<>();
        stats.put(StatType.Strength, 5);
        stats.put(StatType.Agility, 0);
        stats.put(StatType.Constitution, 10);
        stats.put(StatType.Intelligence, 0);
        stats.put(StatType.Intuition, 0);
        stats.put(StatType.Presence, 5);
        bonusesByRace.put(Race.Hobbit, stats);

        //Halfelf
        stats = new HashMap<>();
        stats.put(StatType.Strength, 5);
        stats.put(StatType.Agility, 5);
        stats.put(StatType.Constitution, 5);
        stats.put(StatType.Intelligence, 0);
        stats.put(StatType.Intuition, 0);
        stats.put(StatType.Presence, 5);
        bonusesByRace.put(Race.Hobbit, stats);

        //Silvan
        stats = new HashMap<>();
        stats.put(StatType.Strength, 0);
        stats.put(StatType.Agility, 10);
        stats.put(StatType.Constitution, 0);
        stats.put(StatType.Intelligence, 0);
        stats.put(StatType.Intuition, 5);
        stats.put(StatType.Presence, 5);
        bonusesByRace.put(Race.Hobbit, stats);

        //Sindar
        stats = new HashMap<>();
        stats.put(StatType.Strength, -20);
        stats.put(StatType.Agility, 15);
        stats.put(StatType.Constitution, 15);
        stats.put(StatType.Intelligence, 0);
        stats.put(StatType.Intuition, -5);
        stats.put(StatType.Presence, -5);
        bonusesByRace.put(Race.Hobbit, stats);

        //Noldor
        stats = new HashMap<>();
        stats.put(StatType.Strength, 0);
        stats.put(StatType.Agility, 15);
        stats.put(StatType.Constitution, 10);
        stats.put(StatType.Intelligence, 5);
        stats.put(StatType.Intuition, 5);
        stats.put(StatType.Presence, 15);
        bonusesByRace.put(Race.Noldor, stats);

        //Halforc
        stats = new HashMap<>();
        stats.put(StatType.Strength, -20);
        stats.put(StatType.Agility, 15);
        stats.put(StatType.Constitution, 15);
        stats.put(StatType.Intelligence, 0);
        stats.put(StatType.Intuition, -5);
        stats.put(StatType.Presence, -5);
        bonusesByRace.put(Race.Hobbit, stats);

        //Orc
        stats = new HashMap<>();
        stats.put(StatType.Strength, -20);
        stats.put(StatType.Agility, 15);
        stats.put(StatType.Constitution, 15);
        stats.put(StatType.Intelligence, 0);
        stats.put(StatType.Intuition, -5);
        stats.put(StatType.Presence, -5);
        bonusesByRace.put(Race.Hobbit, stats);

        //Urukhai
        stats = new HashMap<>();
        stats.put(StatType.Strength, -20);
        stats.put(StatType.Agility, 15);
        stats.put(StatType.Constitution, 15);
        stats.put(StatType.Intelligence, 0);
        stats.put(StatType.Intuition, -5);
        stats.put(StatType.Presence, -5);
        bonusesByRace.put(Race.Hobbit, stats);

        //Halftroll
        stats = new HashMap<>();
        stats.put(StatType.Strength, -20);
        stats.put(StatType.Agility, 15);
        stats.put(StatType.Constitution, 15);
        stats.put(StatType.Intelligence, 0);
        stats.put(StatType.Intuition, -5);
        stats.put(StatType.Presence, -5);
        bonusesByRace.put(Race.Hobbit, stats);

        //Troll
        stats = new HashMap<>();
        stats.put(StatType.Strength, -20);
        stats.put(StatType.Agility, 15);
        stats.put(StatType.Constitution, 15);
        stats.put(StatType.Intelligence, 0);
        stats.put(StatType.Intuition, -5);
        stats.put(StatType.Presence, -5);
        bonusesByRace.put(Race.Hobbit, stats);

        //Ologhai
        stats = new HashMap<>();
        stats.put(StatType.Strength, -20);
        stats.put(StatType.Agility, 15);
        stats.put(StatType.Constitution, 15);
        stats.put(StatType.Intelligence, 0);
        stats.put(StatType.Intuition, -5);
        stats.put(StatType.Presence, -5);
        bonusesByRace.put(Race.Hobbit, stats);
    }

    public int getTotal() {
        return getBonus() + getRacialBonus();
    }

    public StatType getStatType() {
        return statType;
    }

    public void setStatType(StatType statType) {
        this.statType = statType;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getBonus() {
        int bonus = -25;

        if(value >= 102) bonus = 35;
        else if(value >= 101) bonus = 30;
        else if(value >= 100) bonus = 25;
        else if(value >= 98) bonus = 20;
        else if(value >= 95) bonus = 15;
        else if(value >= 90) bonus = 10;
        else if(value >= 75) bonus = 5;
        else if(value >= 25) bonus = 0;
        else if(value >= 10) bonus = -5;
        else if(value >= 5) bonus = -10;
        else if(value >= 3) bonus = -15;
        else if(value >= 2) bonus = -20;

        return bonus;
    }

    public int getRacialBonus() {
        Map<StatType, Integer> bonusesByStat = bonusesByRace.get(race);
        int racialBonus = bonusesByStat.get(statType);

        return racialBonus;
    }
}

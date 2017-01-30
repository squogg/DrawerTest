package com.example.squog_000.drawertest.merp_entities;

import android.media.projection.MediaProjection;

/**
 * Created by squog_000 on 03/01/2017.
 */

public class Builder {
    public MerpCharacter buildMerpCharacter() {
        PersonalDetails personalDetails = buildPersonalDetails();
        Armours armours = buildArmours();
        Weapons weapons = buildWeapons();
        GeneralItems generalItems = buildGeneralItems();
        Stats stats = buildStats();
        Bonuses bonuses = buildBonuses(stats, armours, weapons, generalItems);
        Spells spells = buildSpells();
        Languages languages = buildLanguages();
        Skills skills = buildSkills();
        Money money = buildMoney();
        Notes notes = buildNotes();

        MerpCharacter character = new MerpCharacter(personalDetails, stats, bonuses,
                spells, languages, skills, armours, weapons, generalItems,
                money, notes);

        return character;
    }

    private Spells buildSpells() {
        Spells spells = new Spells();

        return spells;
    }

    private Languages buildLanguages() {
        Languages languages = new Languages();

        return languages;
    }

    private Skills buildSkills() {
        Skills skills = new Skills();

        return skills;
    }

    private Armours buildArmours() {
        Armours armours = new Armours();

        return armours;
    }

    private Weapons buildWeapons() {
        Weapons weapons = new Weapons();

        return weapons;
    }

    private GeneralItems buildGeneralItems() {
        GeneralItems generalItems = new GeneralItems();

        return generalItems;
    }

    private Money buildMoney() {
        Money money = new Money();

        return money;
    }

    private Notes buildNotes() {
        Notes notes = new Notes();

        return notes;
    }

    private Bonuses buildBonuses(Stats stats, Armours armours, Weapons weapons, GeneralItems generalItems) {
        Bonuses bonuses = new Bonuses();

        Bonus db = new Bonus(BonusType.DefensiveBonus, StatType.Agility, stats, 0, weapons.getWeapons(), armours.getArmours(), generalItems.getGeneralItems());

        return bonuses;
    }

    private Stats buildStats() {
        Stats stats = new Stats();

        //Stat strength = new Stat(StatType.Strength, 0, );
        Stat agility;
        Stat constitution;
        Stat intelligence;
        Stat intuition;
        Stat presence;
        Stat appearance;

        return stats;
    }

    private PersonalDetails buildPersonalDetails() {
        PersonalDetails personalDetails = new PersonalDetails();

        return personalDetails;
    }
}

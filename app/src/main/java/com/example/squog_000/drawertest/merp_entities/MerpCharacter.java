package com.example.squog_000.drawertest.merp_entities;

/**
 * Created by squog_000 on 02/01/2017.
 */

public class MerpCharacter {
    private PersonalDetails personalDetails;
    private Stats stats;
    private Bonuses bonuses;
    private Spells spells;
    private Languages languages;
    private Skills skills;
    private Armours armours;
    private Weapons weapons;
    private GeneralItems generalItems;
    private Money money;
    private Notes notes;

    public MerpCharacter(PersonalDetails personalDetails, Stats stats, Bonuses bonuses, Spells spells, Languages languages, Skills skills, Armours armours, Weapons weapons, GeneralItems generalItems, Money money, Notes notes) {
        this.personalDetails = personalDetails;
        this.stats = stats;
        this.bonuses = bonuses;
        this.spells = spells;
        this.languages = languages;
        this.skills = skills;
        this.armours = armours;
        this.weapons = weapons;
        this.generalItems = generalItems;
        this.money = money;
        this.notes = notes;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public Stats getStats() {
        return stats;
    }

    public Bonuses getBonuses() {
        return bonuses;
    }

    public Spells getSpells() {
        return spells;
    }

    public Languages getLanguages() {
        return languages;
    }

    public Skills getSkills() {
        return skills;
    }

    public Armours getArmours() {
        return armours;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public GeneralItems getGeneralItems() {
        return generalItems;
    }

    public Money getMoney() {
        return money;
    }

    public Notes getNotes() {
        return notes;
    }
}

package com.example.squog_000.drawertest.merp_entities;

import java.util.List;

/**
 * Created by squog_000 on 02/01/2017.
 */

public class Skill {
    private SkillCategory skillCategory;
    private SkillType skillType;
    private int ranks;
    private int specialBonus;
    private SkillBonusType skillbonusType;
    private List<BaseItem> weapons;
    private List<BaseItem> armours;
    private List<BaseItem> generalItems;
    private Profession profession;
    private Stats stats;

    public Skill(List<BaseItem> weapons, List<BaseItem> armours, List<BaseItem> generalItems, Stats stats) {
        this.weapons = weapons;
        this.armours = armours;
        this.generalItems = generalItems;
        this.stats = stats;
    }

    public List<BaseItem> getWeapons() {
        return weapons;
    }

    public List<BaseItem> getArmours() {
        return armours;
    }

    public List<BaseItem> getGeneralItems() {
        return generalItems;
    }

    public int getRankBonus() {
        int rankBonus = 0;

        //don't go past the max ranks allowed
        int tmpRanks = getRanks() > getMaxRanks() ? getMaxRanks() : getRanks();

        if(tmpRanks <= 10) {
            rankBonus = tmpRanks * 5;
        } else {
            rankBonus = 50 + 2 * (tmpRanks - 10);
        }

        return rankBonus;
    }

    public int getMaxRanks() {
        int maxRanks = 0;

        switch (getSkillType()) {
            case noArmour:
                maxRanks = 2;
                break;
            case softLeather:
                maxRanks = 3;
                break;
            case rigidLeather:
                maxRanks = 5;
                break;
            case chain:
                maxRanks = 7;
                break;
            case plate:
                maxRanks = 9;
                break;
            default:
                maxRanks = 15;
        }

        return maxRanks;
    }

    public int getStatBonus() {
        int statBonus = 0;
        //TODO add dictionaries with key/value paris of the skill type and the stat type

        return statBonus;
    }

    public int getProfessionBonus() {
        int professionBonus = 0;

        //TODO - add dictionaries with key/value pairs of the skill and the bonus

        if (profession == Profession.Anamist) {

        } else if (profession == Profession.Bard) {

        } else if (profession == Profession.Mage) {

        } else if (profession == Profession.Ranger) {

        } else if (profession == Profession.Scout) {

        } else if (profession == Profession.Warrior) {

        }

        return professionBonus;
    }

    public int getBonusFromItems() {
        int bonusModifier = 0;

        for(BaseItem item : this.getWeapons()) {
            if(item.isEquipped()) {
                for (SkillModifier modifier : item.getSkillModifiers()) {
                    if (modifier.getSkillType() == this.skillType) {
                        bonusModifier += modifier.getModifier();
                    }
                }
            }
        }

        for(BaseItem item : this.getArmours()) {
            if(item.isEquipped()) {
                for (SkillModifier modifier : item.getSkillModifiers()) {
                    if (modifier.getSkillType() == this.skillType) {
                        bonusModifier += modifier.getModifier();
                    }
                }
            }
        }

        for(BaseItem item : this.getGeneralItems()) {
            if(item.isEquipped()) {
                for (SkillModifier modifier : item.getSkillModifiers()) {
                    if (modifier.getSkillType() == this.skillType) {
                        bonusModifier += modifier.getModifier();
                    }
                }
            }
        }

        return bonusModifier;
    }

    public int getFixedSpecialBonus() {
        int fixedBonus = 0;

        switch(skillType) {
            case softLeather:
                fixedBonus += -15;
                break;
            case rigidLeather:
                fixedBonus += -30;
                break;
            case chain:
                fixedBonus += -45;
                break;
            case plate:
                fixedBonus += -60;
                break;
            case bodyDevelopment:
                fixedBonus += 5;
                break;
        }

        if(skillbonusType == SkillBonusType.MM)
        {
            for(BaseItem item : armours) {
                if(item.isEquipped()) {
                    Armour armour = (Armour) item;
                    if (armour.getArmourType() == ArmourType.LegGreaves) {
                        fixedBonus += -5;
                        break;
                    }
                }
            }
        } else if(skillbonusType == SkillBonusType.OB) {
            for(BaseItem item : armours) {
                if (item.isEquipped()) {
                    Armour armour = (Armour) item;
                    if (armour.getArmourType() == ArmourType.ArmGreaves) {
                        fixedBonus += -5;
                        break;
                    }
                }
            }
        }

        if(skillType == SkillType.perception) {
            for(BaseItem item : armours) {
                if(item.isEquipped()) {
                    Armour armour = (Armour) item;
                    if (armour.getArmourType() == ArmourType.Helmet) {
                        fixedBonus += -5;
                        break;
                    }
                }
            }
        }

        return fixedBonus;
    }

    private int getTotalBonus() {
        return getRankBonus() + getStatBonus() +
                getProfessionBonus() + getBonusFromItems() +
                specialBonus + getFixedSpecialBonus();
    }

    public SkillCategory getSkillCategory() {
        return skillCategory;
    }

    public void setSkillCategory(SkillCategory skillCategory) {
        this.skillCategory = skillCategory;
    }

    public SkillType getSkillType() {
        return skillType;
    }

    public void setSkillType(SkillType skillType) {
        this.skillType = skillType;
    }

    public int getRanks() {
        return ranks;
    }

    public void setRanks(int ranks) {
        this.ranks = ranks;
    }

    public int getSpecialBonus() {
        return specialBonus;
    }

    public void setSpecialBonus(int specialBonus) {
        this.specialBonus = specialBonus;
    }

    public SkillBonusType getSkillbonusType() {
        return skillbonusType;
    }

    public void setSkillbonusType(SkillBonusType skillbonusType) {
        this.skillbonusType = skillbonusType;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }
}

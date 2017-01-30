package com.example.squog_000.drawertest.merp_entities;

import java.util.List;

/**
 * Created by squog_000 on 02/01/2017.
 */

public class Bonus {
    private BonusType bonusType;
    private StatType statType;
    private Stats stats;
    private int special;
    private List<? extends BaseItem> weapons;
    private List<? extends BaseItem> armours;
    private List<? extends BaseItem> generalItems;

    public Bonus(BonusType bonusType, StatType statType, Stats stats, int special, List<? extends BaseItem> weapons, List<? extends BaseItem> armours, List<? extends BaseItem> generalItems) {
        this.bonusType = bonusType;
        this.statType = statType;
        this.stats = stats;
        this.special = special;
        this.weapons = weapons;
        this.armours = armours;
        this.generalItems = generalItems;
    }

    public int getBonusFromStat() {
        int statModifier = 0;

        for(Stat stat : this.getStats().getStats()) {
            if(stat.getStatType() == this.statType) {
                statModifier += stat.getTotal();
            }
        }

        return statModifier;
    }

    public int getBonusFromItems() {
        int bonusModifier = 0;

        for(BaseItem item : this.getWeapons()) {
            if(item.isEquipped()) {
                for (BonusModifier modifier : item.getBonusModifiers()) {
                    if (modifier.getBonusType() == this.bonusType) {
                        bonusModifier += modifier.getModifier();
                    }
                }
            }
        }

        for(BaseItem item : this.getArmours()) {
            if(item.isEquipped()) {
                for (BonusModifier modifier : item.getBonusModifiers()) {
                    if (modifier.getBonusType() == this.bonusType) {
                        bonusModifier += modifier.getModifier();
                    }
                }
            }
        }

        for(BaseItem item : this.getGeneralItems()) {
            if(item.isEquipped()) {
                for (BonusModifier modifier : item.getBonusModifiers()) {
                    if (modifier.getBonusType() == this.bonusType) {
                        bonusModifier += modifier.getModifier();
                    }
                }
            }
        }

        //special check for shield
        for(BaseItem item : armours) {
            if(item.isEquipped()) {
                Armour armour = (Armour) item;
                if (armour.getArmourType() == ArmourType.Shield) {
                    bonusModifier += 25;
                    break;
                }
            }
        }

        return bonusModifier;
    }

    public int getTotal() {
        return getBonusFromStat() + getBonusFromItems() + getSpecial();
    }

    public BonusType getBonusType() {
        return bonusType;
    }

    public void setBonusType(BonusType bonusType) {
        this.bonusType = bonusType;
    }

    public Stats getStats() {
        return stats;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public List<? extends BaseItem> getWeapons() {
        return weapons;
    }

    public List<? extends BaseItem> getArmours() {
        return armours;
    }

    public List<? extends BaseItem> getGeneralItems() {
        return generalItems;
    }
}

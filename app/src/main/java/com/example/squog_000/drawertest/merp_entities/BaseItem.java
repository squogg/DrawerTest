package com.example.squog_000.drawertest.merp_entities;

import android.content.ClipData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by squog_000 on 02/01/2017.
 */

public class BaseItem {
    private String name;
    private String description;
    private List<SkillModifier> skillModifiers = new ArrayList<>();
    private List<BonusModifier> bonusModifiers = new ArrayList<>();
    private boolean equipped;
    private List<ItemAbility> itemAbilities = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SkillModifier> getSkillModifiers() {
        return skillModifiers;
    }

    public void setSkillModifiers(List<SkillModifier> skillModifiers) {
        this.skillModifiers = skillModifiers;
    }

    public List<BonusModifier> getBonusModifiers() {
        return bonusModifiers;
    }

    public void setBonusModifiers(List<BonusModifier> bonusModifiers) {
        this.bonusModifiers = bonusModifiers;
    }

    public boolean isEquipped() {
        return equipped;
    }

    public void setEquipped(boolean equipped) {
        this.equipped = equipped;
    }

    public List<ItemAbility> getItemAbilities() {
        return itemAbilities;
    }
}

package com.example.squog_000.drawertest.merp_entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by squog_000 on 02/01/2017.
 */

public class Party {
    private String name;
    private String description;
    private List<MerpCharacter> characters = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<MerpCharacter> getCharacters() {
        return characters;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

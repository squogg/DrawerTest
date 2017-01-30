package com.example.squog_000.drawertest.fake_data;

import com.example.squog_000.drawertest.merp_entities.Gender;
import com.example.squog_000.drawertest.merp_entities.MerpCharacter;
import com.example.squog_000.drawertest.merp_entities.Party;
import com.example.squog_000.drawertest.merp_entities.PersonalDetails;
import com.example.squog_000.drawertest.merp_entities.Profession;
import com.example.squog_000.drawertest.merp_entities.Race;

/**
 * Created by squog_000 on 30/01/2017.
 */

public class FakeParty {
    public static Party getFakeParty() {
        Party party = new Party();

        party.setDescription("This is a fake party created for the purposes of testing and contains two characters");
        party.setName("Dank Harry Party of Tings");


        MerpCharacter firstChar = getFirstChar();
        MerpCharacter secondChar = getSecondChar();

        party.getCharacters().add(firstChar);
        party.getCharacters().add(secondChar);

        return party;
    }

    private static MerpCharacter getFirstChar() {
        PersonalDetails pd = new PersonalDetails();
        pd.setName("Harrykins");
        pd.setAlignment("Cute and cuddly");
        pd.setDemeanor("Kind and thoughtful");
        pd.setGender(Gender.Male);
        pd.setProfession(Profession.Bard);
        pd.setRace(Race.Dunadan);

        //PersonalDetails personalDetails, Stats stats, Bonuses bonuses, Spells spells, Languages languages, Skills skills, Armours armours, Weapons weapons, GeneralItems generalItems, Money money, Notes notes
        MerpCharacter character = new MerpCharacter(pd, null, null, null, null, null, null, null, null, null, null);

        return character;
    }

    private static MerpCharacter getSecondChar() {
        PersonalDetails pd = new PersonalDetails();
        pd.setName("Daddo");
        pd.setAlignment("Kinda good");
        pd.setDemeanor("Stern");
        pd.setGender(Gender.Male);
        pd.setProfession(Profession.Warrior);
        pd.setRace(Race.Umli);

        //PersonalDetails personalDetails, Stats stats, Bonuses bonuses, Spells spells, Languages languages, Skills skills, Armours armours, Weapons weapons, GeneralItems generalItems, Money money, Notes notes
        MerpCharacter character = new MerpCharacter(pd, null, null, null, null, null, null, null, null, null, null);

        return character;
    }
}

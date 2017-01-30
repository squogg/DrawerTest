package com.example.squog_000.drawertest.dummy;

import com.example.squog_000.drawertest.fake_data.FakeParty;
import com.example.squog_000.drawertest.merp_entities.MerpCharacter;
import com.example.squog_000.drawertest.merp_entities.Party;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {
    private static Party party = FakeParty.getFakeParty();

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static int COUNT = party.getCharacters().size();

    static {
        // Add some sample items.
        for (MerpCharacter character : party.getCharacters()) {
            addItem(createDummyItem(character));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(MerpCharacter character) {
        return new DummyItem(character.getPersonalDetails().getName(), "Race: " + character.getPersonalDetails().getRace().toString() ,character.getPersonalDetails().getProfession().toString());
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}

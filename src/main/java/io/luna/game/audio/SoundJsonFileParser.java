package io.luna.game.audio;

import com.google.common.collect.ImmutableList;
import com.google.gson.JsonObject;
import io.luna.util.GsonUtils;
import io.luna.util.parser.AbstractJsonFileParser;

public final class SoundJsonFileParser extends AbstractJsonFileParser<Song> {

    public SoundJsonFileParser() {
        super("./data/def/audio/music.json");
    }

    @Override
    public Song convert(JsonObject token) throws Exception {

        String songName = token.get("song_name").getAsString();
        int songId = token.get("song_id").getAsInt();
        int musicTabId = token.get("music_tab_id").getAsInt();
        int musicButtonId = token.get("music_button_id").getAsInt();
        int[] regions = GsonUtils.getAsType(token.get("regions"), int[].class);

        System.out.println("Reading song: " + songName);
        return new Song(songName, songId, musicTabId, musicButtonId, regions);
    }

    @Override
    public void onCompleted(ImmutableList<Song> tokenObjects) throws Exception {
        tokenObjects.forEach(Song.ALL::storeDefinition);
        System.out.println("Finished loading all sounds.");
    }
}

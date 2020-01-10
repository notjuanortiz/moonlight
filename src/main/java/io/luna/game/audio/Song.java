package io.luna.game.audio;

import com.google.gson.annotations.SerializedName;
import io.luna.game.model.def.Definition;
import io.luna.game.model.def.DefinitionRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Holds the metadata for a single audio file.
 */
public class Song implements Definition {

    @SerializedName("song_name")
    public String songName = "";

    @SerializedName("song_id")
    public int songId = -1;

    @SerializedName("music_tab_id")
    public int musicTabId = -1;

    @SerializedName("music_button_id")
    public int musicButtonId = -1;

    public List<Integer> regions;

    /**
     * Create a new Song metadata object.
     */
    public Song(String songName, int songId, int musicTabId, int musicButtonId, int[] regions) {
        this.songName = songName;
        this.songId = songId;
        this.musicTabId = musicTabId;
        this.musicButtonId = musicButtonId;

        if (regions.length == 0) {
            this.regions = null;
        } else {
            this.regions = Arrays.stream(regions).boxed().collect(Collectors.toList());
        }
    }

    /**
     * This constructor is used for testing purposes only.
     */
    Song(String songName) {
        this(songName, -1, -1, -1, null);
    }

    @Override
    public int getId() {
        return this.songId;
    }

    public static class Builder {
        private String songName;
        private int songId;
        private int musicTabId;
        private int musicButtonId;
        private int[] regions;

        private Builder() {
        }

        public static Builder create() {
            return new Builder();
        }

        public Builder withSongName(String songName) {
            this.songName = songName;
            return this;
        }

        public Builder withSongId(int songId) {
            this.songId = songId;
            return this;
        }

        public Builder withMusicTabId(int musicTabId) {
            this.musicTabId = musicTabId;
            return this;
        }

        public Builder withMusicButtonId(int musicButtonId) {
            this.musicButtonId = musicButtonId;
            return this;
        }

        public Builder withRegions(int[] regions) {
            this.regions = regions;
            return this;
        }

        public Song build() {
            return new Song(this.songName, this.songId, this.musicTabId, this.musicButtonId, this.regions);
        }
    }
//    /**
//     * Attempts to find the proper song to play based on region ID
//     *
//     * @param regionId
//     * @return
//     */
//    public static Music getSongForRegion(int regionId) {
//        if (repo == null)
//            loadMusic();
//        for (Music m : repo) {
//            for (int region : m.regions) {
//                if (region == regionId) {
//                    return m;
//                }
//            }
//        }
//        return null;
//    }

//    /**
//     * Updates the players music interface with previously unlocked songs
//     *
//     * @param plr
//     */
//    public static void updateMusicInterface(Player plr) {
//        if (Music.repo == null)
//            Music.loadMusic();
//
//        for (Music m : Music.repo) {
//            if (m.music_tab_id != -1)
//                if (plr.unlockedSongs[m.song_id] == 1) {
//                    plr.queue(new ColorChangeMessageWriter(m.music_tab_id, Color.GREEN));
//                } else {
//                    plr.queue(new ColorChangeMessageWriter(m.music_tab_id, Color.RED));
//                }
//        }
//        Music startingSong = getSongForReqion(plr.getPosition().getRegionPosition().getId());
//        if (startingSong != null) {
//            stopMusic(plr);
//            playSong(startingSong, plr);
//        }
//    }
}

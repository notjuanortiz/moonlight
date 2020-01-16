package io.luna.game.audio;

import java.util.ArrayList;
import java.util.List;

/**
 * Unrelated to the {@link io.luna.game.model.mob.Player}, AudioPlayer is responsible for controlling the currently
 * playing music for a single player.
 */
public final class SongController {

    /**
     * Total number of song definitions.
     *
     * @see SongRepository
     */
    public static final int SONGS_AVAILABLE = 600;

    private int currentSongId = -1;

    /**
     * A list of songs that are either locked/unlocked.
     */
    protected final boolean[] unlockedSongs = new boolean[SONGS_AVAILABLE];

    /**
     * Plays a song to a given player.
     *
     * @param song
     *         The track to play.
     * @return true if the current song is changed.
     */
    public boolean play(Song song) {
        if (currentSongId != song.songId) {
            currentSongId = song.songId;

            // unlock song
            if (!unlockedSongs[song.songId]) {
                unlockedSongs[song.songId] = true;
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * Stops playing the current track.
     *
     * @return true, if the current track was stopped.
     */
    public boolean stop() {
        if (currentSongId != 0) {
            currentSongId = 0;
            return true;
        } else {
            return false;
        }
    }

    public int getCurrentSongId() {
        return currentSongId;
    }

    public boolean[] getUnlockedSongs() {
        return unlockedSongs;
    }
}

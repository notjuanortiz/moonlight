package io.luna.game.audio;

import java.util.ArrayList;
import java.util.List;

/**
 * Unrelated to the {@link io.luna.game.model.mob.Player}, AudioPlayer is responsible for controlling the
 * currently playing music for a single player.
 */
public final class SongController {

    private int currentSongId = -1;

    /**
     * A list of songs that are either locked/unlocked.
     */
    protected final List<Integer> availableSongs = new ArrayList<>(600);

    /**
     * Plays a song to a given player.
     *
     * @param track The track to play.
     * @return true if the current song is changed.
     */
    public boolean play(Song track) {
        if (currentSongId != track.songId) {
            currentSongId = track.songId;
            // plr.queue(new MusicMessageWriter(track.song_id));
            // plr.queue(new ColorChangeMessageWriter(track.music_tab_id, Color.GREEN));
            availableSongs.set(track.songId, 1);
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
            // player.queue(new MusicMessageWriter(-1);
            return true;
        } else {
            return false;
        }
    }

    public int getCurrentSongId() {
        return currentSongId;
    }
}

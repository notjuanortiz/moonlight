package io.luna.game.audio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SongControllerTest {

    @Test
    void play() {
        SongController songController = new SongController();

        Song song = Song.Builder.create()
                .withSongName("test_song_name")
                .withSongId(1)
                .build();

        boolean played = songController.play(song);
        assertTrue(played);
        assertEquals(1, songController.getCurrentSongId());
    }

    @Test
    void stop() {
    }
}
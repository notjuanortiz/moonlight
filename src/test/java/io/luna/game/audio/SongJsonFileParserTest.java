package io.luna.game.audio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SongJsonFileParserTest {

    @Test
    void testJsonFileExists() {
        var parser = new SoundJsonFileParser();

        assertNotNull(Song.ALL);
        assertTrue(Song.ALL.getSize() > 0, "Song repository did load properly.");
    }
}
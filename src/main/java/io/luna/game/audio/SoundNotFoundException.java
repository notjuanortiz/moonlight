package io.luna.game.audio;

/**
 * Thrown when a {@link Song} is not found, or fails to load.
 */

public class SoundNotFoundException extends RuntimeException {

    public SoundNotFoundException(String msg) {
        super(msg);
    }
}

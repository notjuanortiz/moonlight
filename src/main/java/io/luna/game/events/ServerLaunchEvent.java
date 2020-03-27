package io.luna.game.events;

import io.luna.event.Event;

/**
 * An event sent when the server launches.
 *
 * @author lare96 <http://github.org/lare96>
 */
public final class ServerLaunchEvent extends Event {

    /**
     * Singleton instance.
     */
    public static final Event INSTANCE = new ServerLaunchEvent();

    /**
     * Private constructor.
     */
    private ServerLaunchEvent() {
        super();
    }
}

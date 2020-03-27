package io.luna.game.events;

import io.luna.game.model.mob.Player;

/**
 * An event sent when a player logs out.
 *
 * @author lare96 <http://github.org/lare96>
 */
public final class LogoutEvent extends PlayerEvent {

    /**
     * Creates a new {@link LogoutEvent}.
     *
     * @param player The player.
     */
    public LogoutEvent(Player player) {
        super(player);
    }
}

package io.luna.game.events;

import io.luna.game.model.mob.Player;

/**
 * An event sent when a player logs in.
 *
 * @author lare96 <http://github.org/lare96>
 */
public final class LoginEvent extends PlayerEvent {

    /**
     * Creates a new {@link LoginEvent}.
     *
     * @param player The player.
     */
    public LoginEvent(Player player) {
        super(player);
    }
}

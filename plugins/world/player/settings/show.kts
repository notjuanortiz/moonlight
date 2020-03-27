package world.player.settings

import api.predef.*
import io.luna.game.events.LoginEvent

/**
 * Configure and show saved settings.
 */
on(LoginEvent::class) {
    plr.settings.showAll()
}
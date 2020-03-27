package world.areas.wilderness

import api.predef.*

/**
 * Register miscellaneous wilderness areas here.
 */
on(ServerLaunchEvent::class) {
    area(WildernessArea::class) {
        swX = 2941; swY = 3518; neX = 3392; neY = 3966
    }
}

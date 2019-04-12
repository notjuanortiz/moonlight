package world.player.skill.mining

import api.predef.*

enum class Ore(val itemId: Int, val level: Int, val mineTicks: Int, val respawnTicks: Int, val exp: Double) {
    CLAY(-1, -1, -1, -1, 0.0),
    ESSENCE(-1, 1, -1, -1, 0.0),
    TIN(-1, -1, -1, -1, 0.0);

    /**
     * The name used when mining ore.
     */
    val miningName = itemDef(itemId).name

    /**
     * The name used when prospecting ore.
     */
    val prospectingName = itemDef(itemId).name.replace("ore", "").trim()

    companion object {

        /**
         * An immutable copy of [values].
         */
        val ALL: List<Ore> = values().toList()
    }
}

// TODO check if swapping objects can be done simply (id's 450/451)
/*enum class Ore(val rocks: IntArray,
               val emptyRocks: IntArray,
               val level: Int,
               val item: Int,
               val respawnTicks: Int?,
               val frequency: Rational,
               val exp: Double) {
    CLAY(rocks = intArrayOf(2108, 2109),
         emptyRocks = intArrayOf(450, 451),
         level = 1,
         item = 434,
         respawnTicks = 1,
         frequency = COMMON,
         exp = 5.0),
    RUNE_ESSENCE(obj = "",
                 level = 1,
                 item = 1436,
                 respawnTicks = null,
                 frequency = COMMON,
                 exp = 5.0),
    TIN(obj = "",
        level = 1,
        item = 438,
        respawnTicks = 5,
        frequency = COMMON,
        exp = 17.5),
    COPPER(obj = "",
           level = 1,
           item = 438,
           respawnTicks = 5,
           frequency = COMMON,
           exp = 17.5),
    IRON,
    COAL,
    GOLD,
    SILVER,
    MITHRIL,
    ADAMANT,
    RUNITE
    TIN( 1, 438, 5, 1, 17),
    COPPER(1, 436, 5, 1, 17),
    IRON( 15, 440, 10, 1, 35),
    SILVER( 20, 443, 120, 3, 40),
    COAL(30, 453, 60, 4, 50),
    GOLD( 40, 444, 120, 5, 65),
    MITHRIL( 55, 447, 180, 6, 80),
    ADAMANTITE( 70, 449, 420, 7, 95),
    RUNITE( 85, 451, 840, 10, 125);


    /** The level needed to mine this type of rock. */
    private int level;

    /** The item id of the rock. */
    private int itemId;

    /** The time it takes for this rock to respawn. */
    private int respawnTime;

    /** The rate at which this rock can be mined. */
    private int mineRate;

    /** The experience gained from mining this rock. */
    private int experience;
*/
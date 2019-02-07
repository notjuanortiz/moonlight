package world.player.skill.smithing.smeltOre

import io.luna.game.model.item.Item

enum class Bar(val id: Int,
               val level: Int,
               val exp: Double,
               val ore1: Item,
               val ore2: Item? = null) {
    BRONZE(id = 2349,
           level = 1,
           exp = 6.25,
           ore1 = Item(438)),
    IRON(id = 2351,
         level = 15,
         exp = 12.5,
         ore1 = Item(440)),
    SILVER(id = 2355,
           level = 20,
           exp = 13.67,
           ore1 = Item(442)),
    STEEL(id = 2353,
          level = 30,
          exp = 17.5,
          ore1 = Item(440),
          ore2 = Item(453, 2)),
    GOLD(id = 2357,
         level = 40,
         exp = 22.5,
         ore1 = Item(444)),
    MITHRIL(id = 2359,
            level = 50,
            exp = 30.0,
            ore1 = Item(447),
            ore2 = Item(453, 4)),
    ADAMANT(id = 2361,
            level = 70,
            exp = 37.5,
            ore1 = Item(449),
            ore2 = Item(453, 6)),
    RUNE(id = 2349,
         level = 1,
         exp = 6.25,
         ore1 = Item(451),
         ore2 = Item(453, 8));

    val barItem = Item(id)
    val formattedName = name.toLowerCase()
    val ores = if (ore2 == null) arrayOf(ore1) else arrayOf(ore1, ore2)
}
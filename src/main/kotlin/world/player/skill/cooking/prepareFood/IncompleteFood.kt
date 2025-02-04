package world.player.skill.cooking.prepareFood

import world.obj.resource.fillable.WaterResource

/**
 * An enum representing all food that can be prepared before cooking.
 */
enum class IncompleteFood(val id: Int, val lvl: Int, val exp: Double, val baseIngredient: Int, val otherIngredients: List<Int>) {

    // Various dough types
    BREAD_DOUGH(id = 2307,
                lvl = 1,
                exp = 0.0,
                baseIngredient = 1933,
                otherIngredients = WaterResource.FILLED_IDS),
    PITA_DOUGH(id = 1863,
               lvl = 58,
               exp = 0.0,
               baseIngredient = 1933,
               otherIngredients = WaterResource.FILLED_IDS),
    PASTRY_DOUGH(id = 1953,
                 lvl = 1,
                 exp = 0.0,
                 baseIngredient = 1933,
                 otherIngredients = WaterResource.FILLED_IDS),
    PIZZA_BASE(id = 2283,
               lvl = 35,
               exp = 0.0,
               baseIngredient = 1933,
               otherIngredients = WaterResource.FILLED_IDS),

    // Pies
    PIE_SHELL(id = 2315,
              lvl = 1,
              exp = 0.0,
              baseIngredient = 2313,
              otherIngredients = listOf(1953)),
    UNCOOKED_BERRY_PIE(id = 2321,
                       lvl = 10,
                       exp = 0.0,
                       baseIngredient = 2315,
                       otherIngredients = listOf(1951)),
    UNCOOKED_MEAT_PIE(id = 2319,
                      lvl = 20,
                      exp = 0.0,
                      baseIngredient = 2315,
                      otherIngredients = listOf(2142, 2140)),
    PART_MUD_PIE_1(id = 7164,
                   lvl = 29,
                   exp = 0.0,
                   baseIngredient = 2315,
                   otherIngredients = listOf(6032, 6034)),
    PART_MUD_PIE_2(id = 7166,
                   lvl = 29,
                   exp = 0.0,
                   baseIngredient = 7164,
                   otherIngredients = WaterResource.FILLED_IDS),
    RAW_MUD_PIE(id = 7168,
                lvl = 29,
                exp = 0.0,
                baseIngredient = 7166,
                otherIngredients = listOf(434)),
    UNCOOKED_APPLE_PIE(id = 2317,
                       lvl = 30,
                       exp = 0.0,
                       baseIngredient = 2315,
                       otherIngredients = listOf(1955)),
    PART_GARDEN_PIE_1(id = 7172,
                      lvl = 34,
                      exp = 0.0,
                      baseIngredient = 2315,
                      otherIngredients = listOf(1982)),
    PART_GARDEN_PIE_2(id = 7174,
                      lvl = 34,
                      exp = 0.0,
                      baseIngredient = 7172,
                      otherIngredients = listOf(1957)),
    RAW_GARDEN_PIE(id = 7176,
                   lvl = 34,
                   exp = 0.0,
                   baseIngredient = 7174,
                   otherIngredients = listOf(1965)),
    PART_FISH_PIE_1(id = 7182,
                    lvl = 47,
                    exp = 0.0,
                    baseIngredient = 2315,
                    otherIngredients = listOf(333)),
    PART_FISH_PIE_2(id = 7184,
                    lvl = 47,
                    exp = 0.0,
                    baseIngredient = 7182,
                    otherIngredients = listOf(339)),
    RAW_FISH_PIE(id = 7186,
                 lvl = 47,
                 exp = 0.0,
                 baseIngredient = 7184,
                 otherIngredients = listOf(1942)),
    PART_ADMIRAL_PIE_1(id = 7192,
                       lvl = 70,
                       exp = 0.0,
                       baseIngredient = 2315,
                       otherIngredients = listOf(329)),
    PART_ADMIRAL_PIE_2(id = 7194,
                       lvl = 70,
                       exp = 0.0,
                       baseIngredient = 7192,
                       otherIngredients = listOf(361)),
    RAW_ADMIRAL_PIE(id = 7196,
                    lvl = 70,
                    exp = 0.0,
                    baseIngredient = 7194,
                    otherIngredients = listOf(1942)),
    PART_SUMMER_PIE_1(id = 7212,
                      lvl = 95,
                      exp = 0.0,
                      baseIngredient = 2315,
                      otherIngredients = listOf(5504)),
    PART_SUMMER_PIE_2(id = 7214,
                      lvl = 95,
                      exp = 0.0,
                      baseIngredient = 7212,
                      otherIngredients = listOf(5982)),
    RAW_SUMMER_PIE(id = 7216,
                   lvl = 95,
                   exp = 0.0,
                   baseIngredient = 7214,
                   otherIngredients = listOf(1955)),

    // Stews and curries
    INCOMPLETE_STEW_WITH_POTATO(id = 1997,
                                lvl = 25,
                                exp = 2.0,
                                baseIngredient = 1921,
                                otherIngredients = listOf(1942)),
    INCOMPLETE_STEW_WITH_MEAT(id = 1999,
                              lvl = 25,
                              exp = 2.0,
                              baseIngredient = 1921,
                              otherIngredients = listOf(2140, 2142)),
    UNCOOKED_STEW_FROM_POTATO(id = 2001,
                              lvl = 25,
                              exp = 0.0,
                              baseIngredient = 1997,
                              otherIngredients = listOf(2140, 2142)),
    UNCOOKED_STEW_FROM_MEAT(id = 2001,
                            lvl = 25,
                            exp = 0.0,
                            baseIngredient = 1999,
                            otherIngredients = listOf(1942)),
    UNCOOKED_CURRY(id = 2009,
                   lvl = 60,
                   exp = 0.0,
                   baseIngredient = 2001,
                   otherIngredients = listOf(5970, 2007)),

    // Teas
    NETTLE_WATER(id = 4237,
                 lvl = 20,
                 exp = 0.0,
                 baseIngredient = 1921,
                 otherIngredients = listOf(4241)),
    MILKY_NETTLE_TEA(id = 4240,
                     lvl = 20,
                     exp = 0.0,
                     baseIngredient = 4239,
                     otherIngredients = listOf(1927)),
    CUP_OF_NETTLE_TEA(id = 4242,
                      lvl = 20,
                      exp = 52.0,
                      baseIngredient = 1980,
                      otherIngredients = listOf(4239)),
    CUP_OF_MILKY_NETTLE_TEA(id = 4243,
                            lvl = 20,
                            exp = 0.0,
                            baseIngredient = 1980,
                            otherIngredients = listOf(1927)),

    // Pizzas
    INCOMPLETE_PIZZA(id = 2285,
                     lvl = 35,
                     exp = 0.0,
                     baseIngredient = 2283,
                     otherIngredients = listOf(1982)),
    UNCOOKED_PLAIN_PIZZA(id = 2287,
                         lvl = 35,
                         exp = 0.0,
                         baseIngredient = 2285,
                         otherIngredients = listOf(1985)),
    MEAT_PIZZA(id = 2293,
               lvl = 45,
               exp = 26.0,
               baseIngredient = 2289,
               otherIngredients = listOf(2140, 2142)),
    ANCHOVY_PIZZA(id = 2297,
                  lvl = 55,
                  exp = 39.0,
                  baseIngredient = 2289,
                  otherIngredients = listOf(319)),
    PINEAPPLE_PIZZA(id = 2301,
                    lvl = 65,
                    exp = 45.0,
                    baseIngredient = 2289,
                    otherIngredients = listOf(2118)),

    // Cakes
    UNCOOKED_CAKE(id = 1889,
                  lvl = 65,
                  exp = 45.0,
                  baseIngredient = 1887,
                  otherIngredients = listOf(1944, 1927, 1933)),
    CHOCOLATE_CAKE(id = 1897,
                   lvl = 50,
                   exp = 30.0,
                   baseIngredient = 1891,
                   otherIngredients = listOf(1973, 1975)),


    // Other
    UNFERMENTED_WINE(id = 1995,
                     lvl = 35,
                     exp = 200.0,
                     baseIngredient = 1987,
                     otherIngredients = listOf(1937)),
    PINEAPPLE_RING(id = 2118,
                   lvl = 1,
                   exp = 0.0,
                   baseIngredient = 2114,
                   otherIngredients = listOf(946));


    companion object {

        /**
         * A map of all [IncompleteFood.id] -> [IncompleteFood] entries.
         */
        val ALL = values().associateBy { it.id }

        /**
         * A map of all [IncompleteFood.id] -> [IncompleteFood] entries that can be made into dough.
         */
        val DOUGH = ALL.filter { it.value.baseIngredient == 1933 }
    }

}
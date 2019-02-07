import api.predef.*
import io.luna.game.action.Action
import io.luna.game.action.ProducingAction
import io.luna.game.event.impl.ItemOnObjectEvent
import io.luna.game.event.impl.ObjectClickEvent.ObjectFirstClickEvent
import io.luna.game.model.item.Equipment
import io.luna.game.model.item.Item
import io.luna.game.model.mob.Animation
import io.luna.game.model.mob.Player
import world.player.skill.smithing.smeltOre.Bar

/**
 * A [ProducingAction] implementation that will smelt ores.
 */
class SmeltOreAction(val plr: Player, val bar: Bar, var amount: Int) : ProducingAction(plr, true, 5) {

    companion object {

        /**
         * The animation.
         */
        val ANIM = Animation(899)
    }

    var successful = true

    override fun remove(): Array<Item> = bar.ores
    override fun add(): Array<Item> = if (successful) arrayOf(bar.barItem) else emptyArray()

    override fun canProduce() =
        when {
            plr.smithing.level < bar.level -> {
                plr.sendMessage("You need a Smithing level of ${bar.level} to smelt this.")
                false
            }
            amount == 0 -> false
            else -> {
                plr.sendMessage("You smelt the ${bar.formattedName} in the furnace.")
                successful = calculateSuccess()
                true
            }
        }

    override fun onProduce() {
        if (successful) {
            plr.sendMessage("You retrieve a bar of ${bar.formattedName}.")

            // Goldsmith gauntlets support.
            if (bar == Bar.GOLD && plr.equipment.get(Equipment.HANDS)?.id == 776) {
                plr.smithing.addExperience(56.2)
            } else {
                plr.smithing.addExperience(bar.exp)
            }

            plr.animation(ANIM)
        } else {
            plr.sendMessage("The ore is too impure and you fail to refine it.")
        }
        amount--
    }

    override fun isEqual(other: Action<*>?) =
        when (other) {
            is SmeltOreAction -> bar == other.bar
            else -> false
        }

    fun calculateSuccess(): Boolean {
        return when (bar) {
            Bar.IRON -> rand().nextBoolean()
            else -> true
        }
    }
}


val furnaces = setOf(-1)

fun openInterface() {
  // private final int[] SMELT_BARS =
  // {2349,2351,2355,2353,2357,2359,2361,2363};
  // private final int[] SMELT_FRAME =
  // {2405,2406,2407,2409,2410,2411,2412,2413};
  // for (int j = 0; j < SMELT_FRAME.length; j++) {
  // c.getPA().sendFrame246(SMELT_FRAME[j], 150, SMELT_BARS[j]);
  // }
  //player.getPacketBuilder().sendChatInterface(2400);
}

// Click "Smelt" on furnace.
on(ObjectFirstClickEvent::class)
    .match(furnaces)
    .then { openInterface() }

// Use anything on
on(ItemOnObjectEvent::class)
    .filter { furnaces.contains(objectId) }
    .then { openInterface() }
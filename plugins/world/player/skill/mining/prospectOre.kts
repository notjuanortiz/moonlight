import io.luna.game.action.*
import io.luna.game.model.mob.Player
import world.player.skill.mining.Ore

// TODO Change to throttled action.
class ProspectAction(plr: Player, val ore: Ore) : FixedAction<Player>(plr, false, 5, 1) {
    override fun canExecute() = true
    override fun execute() {
        mob.sendMessage("This rock contains ${ore.prospectingName}.")
    }

    override fun isEqual(other: Action<*>?) =
            when (other) {
                is ProspectAction -> other.ore == ore
                else -> false
            }
}

// TODO Add listeners dynamically
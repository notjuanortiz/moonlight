package world.player.skill.smithing.smithBars

import io.luna.game.model.item.Item
import io.luna.game.model.mob.Player

val ANVIL = -1
fun smithTable(table: SmithTable.() -> Unit) {

}

fun openInterface(plr: Player) {
    player.getPacketBuilder().sendInterface(994);

    for (SmithingTableItem s : smith.getSmithingTable().getTable()) {
        if (s.getItemCreated() == null) {
            player.getPacketBuilder().sendString("", s.getSendNameTextLine());
            player.getPacketBuilder().sendString("", s.getSendAmountOfBarsTextLine());
            player.getPacketBuilder()
                .sendItemOnInterfaceSlot(s.getIndex().getFrame(), new Item (-1), s.getIndex().getSlot());
            continue;
        }

        if (player.getInventory().getContainer().getCount(smith.getBarId()) < s.getBarsRequired()) {
            player.getPacketBuilder()
                .sendString(s.getBarsRequired() == 1 ? "@red@"+s.getBarsRequired()+"bar" : "@red@"+s.getBarsRequired()+"bars", s.getSendNameTextLine());
        } else {
            player.getPacketBuilder()
                .sendString(s.getBarsRequired() == 1 ? "@gre@"+s.getBarsRequired()+"bar" : "@gre@"+s.getBarsRequired()+"bars", s.getSendNameTextLine());
        }

        if (!player.getSkills()[Misc.SMITHING].reqLevel(s.getLevelRequired())) {
            player.getPacketBuilder().sendString("@bla@" + s.getIndex().getName(), s.getSendAmountOfBarsTextLine());
        } else {
            player.getPacketBuilder().sendString("@whi@" + s.getIndex().getName(), s.getSendAmountOfBarsTextLine());
        }

        player.getPacketBuilder()
            .sendItemOnInterfaceSlot(s.getIndex().getFrame(), s.getItemCreated(), s.getIndex().getSlot());
    }
}

class SmithItem(item: Item, level: Int, bars: Int, lines: Pair<Int, Int>, exp: Double)

package io.luna.net.msg.out;

import io.luna.game.model.mobile.Player;
import io.luna.net.codec.ByteMessage;
import io.luna.net.codec.ByteTransform;
import io.luna.net.msg.OutboundGameMessage;

/**
 * An {@link OutboundGameMessage} that forces a certain tab on the gameframe open for a specific {@link Player}. Used for
 * things like tutorial island to force the {@code Player} to view a certain tab.
 * <p>
 * <table BORDER CELLPADDING=3 CELLSPACING=1> <tr> <td ALIGN=CENTER><em>Tab</em></td> <td
 * ALIGN=CENTER><em>Identifier</em></td> </tr> <tr> <td>Combat</td> <td>0</td> </tr> <tr> <td>Skills</td> <td>-1</td> </tr>
 * <tr> <td>Quest</td> <td>-2</td> </tr> <tr> <td>Inventory</td> <td>-3</td> </tr> <tr> <td>Equipment</td> <td>-4</td> </tr>
 * <tr> <td>Prayer</td> <td>-5</td> </tr> <tr> <td>Magic</td> <td>-6</td> </tr> <tr> <td>Quest</td> <td>-7</td> </tr> <tr>
 * <td>Friends</td> <td>-8</td> </tr> <tr> <td>Ignores</td> <td>-9</td> </tr> <tr> <td>Logout</td> <td>-10</td> </tr> <tr>
 * <td>Settings</td> <td>-11</td> </tr> <td>Emotes</td> <td>-12</td> </tr> <td>Music</td> <td>-13</td> </tr> </table>
 *
 * @author lare96 <http://github.org/lare96>
 */
public final class SendForceTabMessage extends OutboundGameMessage {

    /**
     * The identifier of the game tab to open.
     */
    private final int id;

    /**
     * Creates a new {@link SendForceTabMessage}.
     *
     * @param id The identifier of the game tab to open.
     */
    public SendForceTabMessage(int id) {
        this.id = id;
    }

    @Override
    public ByteMessage writeMessage(Player player) {
        ByteMessage msg = ByteMessage.message(106);
        msg.put(id, ByteTransform.C);
        return msg;
    }
}

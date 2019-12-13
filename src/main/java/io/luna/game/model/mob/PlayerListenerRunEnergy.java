package io.luna.game.model.mob;

import io.luna.net.msg.out.UpdateRunEnergyMessageWriter;

/**
 * Responsible for executing an update whenever a change in {@link Player#getRunEnergy()} is made.
 */
public class PlayerListenerRunEnergy implements PlayerListener {

    private double previousRunEnergy = 0;

    @Override
    public void update(Player player) {

        // update client if run energy is changed
        if (previousRunEnergy != player.getRunEnergy()) {
            player.queue(new UpdateRunEnergyMessageWriter((int) player.getRunEnergy()));
        }
        previousRunEnergy = player.getRunEnergy();
    }
}


package io.luna.game.model.mob;

public interface MobListener<M extends Mob> {

    void update(M mob);
}

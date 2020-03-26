package io.luna.game.model;

import com.google.common.base.MoreObjects;

import java.util.Objects;

/**
 * A basic vector.
 *
 * @since 0.5
 */
public class Vector {

    /**
     * The x coordinate.
     */
    protected int x;

    /**
     * The y coordinate.
     */
    protected int y;

    public Vector() {
        this(0, 0);
    }

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return The x coordinate.
     */
    public int getX() {
        return x;
    }

    /**
     * @return The y coordinate.
     */
    public int getY() {
        return y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("x", x).add("y", y).toString();
    }
}

package io.luna.game.model.path;


import io.luna.game.model.Position;

/**
 * A heuristic which uses <i>Euclidean</i> distance to calculate the cost for a movement.
 */
public final class EuclideanHeuristic extends Heuristic {

	/**
	 * @see Position#getDistance(Position)
	 */
	@Override
	public int estimate(Position current, Position target) {
		return current.getDistance(target);
	}
}

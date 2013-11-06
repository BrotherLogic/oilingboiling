package com.brotherlogic.games;

import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

/**
 * A body within the world
 * 
 * @author simon
 * 
 */
public abstract class Body {

	Vector velocity;
	double restitution;
	double mass;

	public abstract Rectangle2D getAABB();

	public abstract void render(Graphics g);

	public void ResolveCollision(Body a, Body b) {
		// Calculate relative velocity
		Vector rv = b.velocity.subtract(a.velocity);

		// Calculate relative velocity in terms of the normal direction
		double velAlongNormal = rv.dotProduct(rv.getNormal());

		// Do not resolve if velocities are separating
		if (velAlongNormal > 0)
			return;

		// Calculate restitution
		double e = Math.min(a.restitution, b.restitution);

		// Calculate impulse scalar
		double j = -(1 + e) * velAlongNormal;
		j /= 1 / a.mass + 1 / b.mass;

		// Apply impulse
		Vector impulse = rv.getNormal().multiply(j);
		// A.velocity -= 1 / A.mass * impulse
		// B.velocity += 1 / B.mass * impulse
	}
}

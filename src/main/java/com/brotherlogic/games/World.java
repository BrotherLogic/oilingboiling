package com.brotherlogic.games;

import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;

public class World {
	Vector gravity;
	long dt = 100;
	List<Body> bodies = new LinkedList<Body>();
	boolean running = true;

	Rectangle2D worldBounds;

	JPanel display;

	public World(Rectangle2D bns, JPanel renderer) {
		worldBounds = bns;
		display = renderer;
	}

	public void addBody(Body b) {
		bodies.add(b);
	}

	public void removeBody(Body b) {
		bodies.remove(b);
	}

	public void updatePhysics(long time) {

	}

	public void renderWorld() {
		Graphics g = display.getGraphics();
		display.paint(g);

		g.drawRect((int) worldBounds.getMinX(), (int) worldBounds.getMinY(),
				(int) worldBounds.getWidth(), (int) worldBounds.getHeight());
		for (Body b : bodies)
			b.render(g);
	}
}

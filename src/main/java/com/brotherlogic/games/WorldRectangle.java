package com.brotherlogic.games;

import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

public class WorldRectangle extends Body {

	Rectangle2D coords;

	@Override
	public Rectangle2D getAABB() {
		return coords;
	}

	public WorldRectangle(Rectangle2D place) {
		coords = place;
	}

	@Override
	public void render(Graphics g) {
		System.out.println("RENDERING " + coords.getMaxY());
		g.drawRect((int) coords.getMinX(), (int) coords.getMinY(),
				(int) coords.getWidth(), (int) coords.getHeight());
	}
}

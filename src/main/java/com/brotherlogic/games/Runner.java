package com.brotherlogic.games;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Runner extends JFrame {

	JPanel gamePanel = new JPanel();

	public void run() {
		this.add(gamePanel);

		World w = new World(new Rectangle(0, 0, 500, 500), gamePanel);
		WorldRectangle base = new WorldRectangle(new Rectangle(0, 10, 500, 10));
		w.addBody(base);
		WorldRectangle ship = new WorldRectangle(
				new Rectangle(230, 230, 40, 40));
		w.addBody(ship);

		this.setSize(500, 500);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		w.renderWorld();
	}

	public static void main(String[] args) {
		Runner r = new Runner();
		r.run();
	}
}

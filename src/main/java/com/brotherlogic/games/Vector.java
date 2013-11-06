package com.brotherlogic.games;

public class Vector {
	double size;
	double angle;

	public Vector(double sze, double ngle) {
		size = sze;
		angle = ngle;
	}

	public Vector subtract(Vector o) {
		return null;
	}

	public Vector multiply(double conts) {
		return null;
	}

	public Vector getNormal() {
		return null;
	}

	public double dotProduct(Vector v) {
		return 0.0;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}
}

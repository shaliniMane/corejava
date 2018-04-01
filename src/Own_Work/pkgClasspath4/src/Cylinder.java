package com.sunbeaminfo.geometry.shapes3d;

public class Cylinder {
	private double radius;
	private double height;
	public Cylinder() {
		this(0.0, 0.0);
	}
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double calcVolume() {
		return 3.1415 * this.radius * this.radius * this.height;
	}
	public void display() {
		System.out.printf("Radius: %f, Height: %f\n", this.radius, this.height);
	}
}

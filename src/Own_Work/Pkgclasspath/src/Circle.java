package com.sunbeaminfo.geometry.shapes2d;

public class Circle {
	private double radius;
	public Circle() {
		this(0.0);
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double calcArea() {
		return 3.1415 * this.radius * this.radius;
	}
	public void display() {
		System.out.printf("Radius: %f\n", this.radius);
	}
}

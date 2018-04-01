package com.sunbeaminfo.geometry.shapes2D;

public class Circle {

	private double radius;
	public Circle()
	{
		this(0.0);
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double calArea()
	{
		return 3.1415 * this.radius * this.radius;
	}
	public void display()
	{
		System.out.printf("Radius: %f\n",this.radius);
		
	}
	
}

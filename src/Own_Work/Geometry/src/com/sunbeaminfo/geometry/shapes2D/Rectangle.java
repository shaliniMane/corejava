package com.sunbeaminfo.geometry.shapes2D;

public class Rectangle {
	private double length;
	private double breadth;
	
	
	public Rectangle()
	{
		this(0,0);
	}
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public double calArea()
	{
		return this.length * this.breadth;
	}
	public void display()
	{
		System.out.printf("Length: %f, Breadth: %f\n", this.length, this.breadth);
		
	}

}

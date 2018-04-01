package com.sunbeaminfo.geometry.shapes3d;

public class Box {
	private double length;
	private double breadth;
	private double height;
	public Box() {
		this(0,0,0);
	}
	public Box(double length, double breadth, double height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double calcVolume() {
		return this.length * this.breadth * this.height;
	}
	public void display() {
		System.out.printf("Length: %f, Breadth: %f, Height: %f\n", this.length, this.breadth, this.height);
	}
}

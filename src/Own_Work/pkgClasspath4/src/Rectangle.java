package com.sunbeaminfo.geometry.shapes2d;

public class Rectangle {
	private double length;
	private double breadth;
	public Rectangle() {
		this(0,0);
	}
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
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
	public double calcArea() {
		return this.length * this.breadth;
	}
	public void display() {
		System.out.printf("Length: %f, Breadth: %f\n", this.length, this.breadth);
	}
}

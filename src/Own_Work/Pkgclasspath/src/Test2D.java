package com.sunbeaminfo.geometry.test;
import com.sunbeaminfo.geometry.shapes2d.Rectangle;
import com.sunbeaminfo.geometry.shapes2d.Circle;

public class Test2D {
	public static void test2DShapes() {
		Rectangle r1 = new Rectangle(10, 8);
		r1.display();
		System.out.printf("Rectangle: Area = %f\n", r1.calcArea());

		Circle c1 = new Circle(7);
		c1.display();
		System.out.printf("Circle: Area = %f\n", c1.calcArea());	
	}
}

package com.sunbeaminfo.geometry.test;
import com.sunbeaminfo.geometry.shapes3d.*; // import all classes in that package.
//import com.sunbeaminfo.*; // doesn't import all sub-packages and classes in it.

public class Test3D {
	public static void test3DShapes() {
		Box b1 = new Box(10, 8, 6);
		b1.display();
		System.out.printf("Box: Volume = %f\n", b1.calcVolume());

		Cylinder c1 = new Cylinder(7, 10);
		c1.display();
		System.out.printf("Circle: Volume = %f\n", c1.calcVolume());	
	}
}

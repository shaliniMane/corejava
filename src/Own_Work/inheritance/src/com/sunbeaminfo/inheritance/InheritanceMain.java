package com.sunbeaminfo.inheritance;

public class InheritanceMain {
	public static void main(String[] args) {
		Person p1 = new Person("P1", 11);
		p1.display();
		System.out.println();
		
		Student s1 = new Student("S1", 22, 101, 98);
		s1.display();
		System.out.println();
	}
}

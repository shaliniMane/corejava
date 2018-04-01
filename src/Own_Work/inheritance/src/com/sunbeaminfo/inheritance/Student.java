package com.sunbeaminfo.inheritance;

public class Student extends Person {
	private int roll;
	private int marks;
	public Student() {
		this.roll = 0;
		this.marks = 0;
	}
	public Student(String name, int age, int roll, int marks) {
		super(name, age);
		this.roll = roll;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	/*
	public void display() {
		System.out.printf("Name: %s\nAge: %d\n", this.getName(), this.getAge());
		System.out.printf("Roll: %d\nMarks: %d\n", this.roll, this.marks);
	}
	*/
	public void display() {
		//this.display(); // this will lead to recursion --> StackOverflowError
		super.display();
		System.out.printf("Roll: %d\nMarks: %d\n", this.roll, this.marks);
	}
}

package com.sunbeam.Polymorphism;

public class Tape extends Product {
	private int duration ;
	public Tape()
	{
		this.duration = 0;
	}
	public Tape(String title, double price,int duration) {
		super(title, price);
		this.duration = duration;

	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void accept()
	{
		super.accept();
		System.out.println("Duration:");
		this.duration =PolymorphismMain.sc.nextInt();
	}
	public void display()
	{
		super.display();
		System.out.printf("Duration %d\n",this.duration);
	}
}

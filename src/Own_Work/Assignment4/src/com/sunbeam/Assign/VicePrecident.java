package com.sunbeam.Assign;

public class VicePrecident extends Employee
{
	double bonus;
	public VicePrecident()
	{
		this.bonus = 0.0;
	}
	
public VicePrecident(double bonus) {
		super();
		this.bonus = bonus;
	}

public void accept()
{
	super.accept();
	System.out.println("Enter bonus:");
	this.bonus = Main.sc.nextInt();
	
}
public void display()
{
	super.display();
	System.out.printf("Work hours : %f\n", this.bonus);
}
	//	constructors, mutators, inspectors, facilitators;
	public double getTotalSalary()
	{
		
		double DA = (Basicsalary * 50)/100;
		double totsal = Basicsalary + DA  + bonus;
		return totsal;
		
	}
	
}
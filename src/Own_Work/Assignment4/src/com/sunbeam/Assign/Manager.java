package com.sunbeam.Assign;

public class Manager extends Employee{
	
	double incentives;
	
	public Manager()
	{
		this.incentives= 0.0;
	}
	
	public double getIncentives() {
		return incentives;
	}

	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}

	//constructors, mutators, inspectors, facilitators;
	public void accept()
	{
		super.accept();
		System.out.println("Enter incentives:");
		this.incentives = Main.sc.nextInt();
		
	}
	public void display()
	{
		super.display();
		System.out.printf("Incentive : %f\n", this.incentives);
	}
	public double getTotalSalary()
	{
		
		double DA = (Basicsalary * 30)/100;
		double totsal = Basicsalary + DA  + incentives;
		return totsal;
	}

}

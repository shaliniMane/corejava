package com.sunbeam.Assign;
public class SalesManager extends Manager {
    double commission;
	int target;
	public SalesManager()
	{
		this.commission = 0.0;
		this.target = 0;
	}
	
	
	public SalesManager(double commision, int target) {
		super();
		this.commission = commision;
		this.target = target;
	}

	public void accept()
	{
		super.accept();
		System.out.println("Enter Commission:");
		this.commission = Main.sc.nextInt();
		System.out.println("Enter Target:");
		this.target = Main.sc.nextInt();
	}
	public void display()
	{
		super.display();
		System.out.printf("Work commission : %f\n", this.commission);
		System.out.printf("hours target : %d\n", this.target);
	}
	//constructors, mutators, inspectors, facilitators;
	public double getTotalSalary()
	{
		double DA = (Basicsalary * 50)/100;
		double totsal = Basicsalary + DA  + commission;
		return totsal;
		// basicSalary + 50% DA + commission;
	}



}

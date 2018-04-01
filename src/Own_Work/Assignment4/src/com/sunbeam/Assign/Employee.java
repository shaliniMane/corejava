package com.sunbeam.Assign;

public class Employee {
	private int empid;
	private String name;
	protected double Basicsalary;
	private Date joining;
	public Employee() {
		this.empid = 0;
		this.Basicsalary = 0.0;
		this.name = "";
		this.joining = new Date();
	}
	public Employee(int empid, String name, double salary, Date joining) {
		this.empid = empid;
		this.name = name;
		this.Basicsalary = salary;
		this.joining = joining;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Basicsalary;
	}
	public void setSalary(double salary) {
		this.Basicsalary = salary;
	}
	public Date getJoining() {
		return joining;
	}
	public void setJoining(Date joining) {
		this.joining = joining;
	}
	
	public double getTotalSalary()
	{
		return this.Basicsalary;
	}
	public static double calculateTotalSalary(Employee emp[])
	{
		double total = 0.0;
		for(int i=0;i<emp.length;i++)
		{
		total = total + emp[i].getSalary();
		}
		
		return total;
	}
	
	public void accept()
	{
		System.out.println("Enter empId:");
		this.empid = Main.sc.nextInt();
		System.out.println("Enter Name:");
		this.name = Main.sc.next();
		System.out.println("Enter Basic salary:");
		this.Basicsalary = Main.sc.nextDouble();
		
	}
	
	public void display() {
		System.out.printf("Empid : %d\n", this.empid);
		System.out.printf("Name : %s\n", this.name);
		System.out.printf("Salary : %f\n", this.Basicsalary);
		System.out.print("Joining Date : ");
		this.joining.display();
	}
}

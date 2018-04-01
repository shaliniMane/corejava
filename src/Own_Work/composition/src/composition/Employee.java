package composition;

import java.util.Scanner;

public class Employee {
	private int empid;
	private String name;
	//private double salary;
	private Date joining;
	private Address addr;
	private double Incrsal;
	protected double basicSalary;
	
	private String dept;	// DEV, QA, ADMIN

	
	public Employee() {
		this.empid = 0;
		//this.salary = 0.0;
		this.name = "";
		this.joining = new Date();
		this.addr = new Address();
		this.basicSalary =0.0;
		this.dept="";
	}
	public Employee(int empid, String name,double basicsal,String Dept, Date joining, Address addr) {
		this.empid = empid;
		this.name = name;
		//this.salary = salary;
		this.joining = joining;
		this.addr = addr;
		this.basicSalary = basicsal;
		this.dept = Dept;
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
	/*public double getSalary() {
		return salary;
	}*/
	/*public void setSalary(double salary) {
		this.salary = salary;
	}*/
	public Date getJoining() {
		return joining;
	}
	public void setJoining(Date joining) {
		this.joining = joining;
	}
	
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id:");
		this.empid = sc.nextInt();
		System.out.println("Enter employee name:");
		this.name = sc.next();
		System.out.println("Enter employee Dept:");
		this.dept = sc.next();
		System.out.println("Enter employee basic salary:");
		this.basicSalary = sc.nextDouble();
	}
	public void display() {
		System.out.printf("Empid : %d\n", this.empid);
		System.out.printf("Name : %s\n", this.name);
		//System.out.printf("Salary : %f\n", this.salary);
		System.out.printf("Department : %s\n", this.dept);
		System.out.printf("Basic sal : %f\n", this.basicSalary);
		System.out.printf("Apprisal salary: %f\n",this.Incrsal);
		System.out.print("Joining Date : ");
		this.joining.display();
		System.out.print("Address: : ");
		this.addr.display();
	}
	
	public void appraisals(double percentage)
	{
		          double per = (this.basicSalary*percentage)/100;
	              this.Incrsal =	this.basicSalary +per;
	 
	}
}
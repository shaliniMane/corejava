package com.sunbeam.Assign;

import java.util.Scanner;

public class Main {
	
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Date d1 = new Date(12, 3, 2018);
		d1.display();
	
		/*Employee e1 = new Employee();
		e1.display();
		*/
		Date d2 = new Date(31, 5, 2004);
		Employee e2 = new Employee(4, "Nilesh", 50000, d2);
		e2.display();
		
		Employee[] emp = new Employee[4];
		int choice;
		for(int i = 0; i<emp.length; i++)
		{
			System.out.println("\n1. Labor\n2.Manager\n3.Viceprecident\n4SalesManager\n Enter choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: //Labor
				emp[i] = new Labor();
				emp[i].accept();
				break;
			case 2: // Manager
				emp[i] = new Manager();
				emp[i].accept();
				break;
			case 3: //VicePrecident
				emp[i] = new VicePrecident();
				emp[i].accept();
				break;
			case 4: // salesManager
				emp[i] = new SalesManager();
				emp[i].accept();
				break;
			}

		}
		for(int i=0;i<emp.length;i++)
		{
			emp[i].display();
		}
		
		double bill = Employee.calculateTotalSalary(emp);
		System.out.printf("Final bill: %f\n",bill);
		
		
		
		
		/*		
		for(int i= 0; i< 5;i++)
		{
		emp[i].Accept();
		//e2.display();
		
		
		
		double Totsal = Employee.calculateTotalSalary(emp);
		for(int i=0;i<emp.length;i++)
		{
			emp[i].display();
		}
		System.out.printf("Final Total salary: %f\n",Totsal);
		
		Labor l1 =new Labor();
		l1.Accept();
		l1.display();
		l1.getTotalSalary();
		
		Manager m =new Manager();
		m.Accept();
		m.display();
	    m.getTotalSalary();
		
		SalesManager sm =new SalesManager();
		sm.Accept();
		sm.display();
		sm.getTotalSalary();
		
		MarketingManager mm =new MarketingManager();
		mm.Accept();
		mm.display();
		mm.getTotalSalary();
*/	
		
	}
}

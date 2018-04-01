package com.sunbeam.Polymorphism;

import java.util.Scanner;

public class PolymorphismMain {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] arr = new Product[5];
		int choice;
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println("\n1. Book\n2. Tape\n Enter choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: //Book
				arr[i] = new Book();
				arr[i].accept();
				break;
			case 2: // tape
				arr[i] = new Tape();
				arr[i].accept();
				break;

			}

		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i].display();
		}
		
		double bill = Product.getTotalBill(arr);
		System.out.printf("Final bill: %f\n",bill);
	}
	
}

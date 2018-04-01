package com.sunbeaminfo.sorting;

import java.util.Scanner;

public class Main {
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
            int arr[]=new int[5];//declaration and instantiation  
System.out.println("Enter array element:");
		 Sorting.accept(arr);
		 System.out.println("Elem of array:");
	   Sorting.print(arr);
	   System.out.println("Sorted array:");
	   Sorting.sort(arr);
		
	}

}

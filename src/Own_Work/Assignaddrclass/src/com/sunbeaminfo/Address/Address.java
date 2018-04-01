package com.sunbeaminfo.Address;

import java.util.Scanner;

public class Address {
	
	private String line1;
	private String line2;
	private String city;
	private String pin;
	
	public Address()
	{
		this("kate","puram ","pune ","411061 ");
	}
	public Address(String line1, String line2, String city, String pin) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.pin = pin;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	public void accept()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Line1:");
	this.line1 = sc.next();
	System.out.println("Enter Line2:");
	this.line2 = sc.next();
	System.out.println("Enter City:");
	this.city = sc.next();
	System.out.println("Enter Pin:");
	this.pin = sc.next();
	}
	public void display()
	{
		System.out.printf("Address: \n Line: %s\nLine2: %s\nCity: %s\nPin: %s",this.line1,this.line2,this.city,this.pin);
		
	}
	
	
}
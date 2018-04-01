package com.sunbeam.Polymorphism;

public class Product {
	private String Title;
	private double price;
	public Product()
	{
		this.Title = "";
		this.price =0.0;

	}
	public Product(String title, double price) {
		super();
		Title = title;
		this.price = price;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static double getTotalBill(Product[] arr)
	{
		double total = 0.0;
		for(int i=0;i<arr.length;i++)
		{
			total = total + arr[i].getPrice();
		}
		return total;
	}
	public void accept()
	{
		System.out.println("Title:");
		this.Title = PolymorphismMain.sc.next();
		System.out.println("Price:");
		this.price = PolymorphismMain.sc.nextDouble();
	}
	public void display()
	{
		System.out.printf("Title: %s\nPrice: %f\n",this.Title,this.price);
	}
}
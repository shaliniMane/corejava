package com.sunbeam.Polymorphism;

public class Book extends Product {
	private int Pages;
	public Book()
	{
		this.Pages = 0;
	}
	public Book(int pages) {
		super();
		Pages = pages;
	}
	public int getPages() {
		return Pages;
	}
	public void setPages(int pages) {
		Pages = pages;
	}
	public void accept()
	{
		super.accept();
		System.out.println("Pages:");
		this.Pages = PolymorphismMain.sc.nextInt();
	}
	public void display()
	{
		super.display();
		System.out.printf("Pages: %d\n",this.Pages);
	}
}


import java.util.Scanner;
class Grosssalary
{
  private double salary;
  private double HRA;
  private  double DA;
  private double TA;
  private double GS;
  public Grosssalary()
  {
	 salary =0.0;
	 HRA = 0.0;
	 DA = 0.0;
	 TA = 0.0;
	 GS = 0.0;

  }
  public Grosssalary(double sal, double hra, double da, double ta,double gs)

  {
    salary = sal;
	 HRA = hra;
	 DA = da;
	 TA = ta;
	 GS= gs;

  }
  public double getsalary()
  {
	 return salary;
  }
 public void setsalary(double sal)
 {
	salary = sal;
 }

 public void display()
 {
	System.out.println( salary+ " "+HRA+ " " +DA+ " "+TA+ " "+GS);
 }
 public void calHra(double salary)
 {
    
	HRA = (salary * 20)/100;
 }

 public void calDa(double salary)
 {
    
	DA = (salary *35)/100;
 }

 public void calTa(double salary)
 {
    
	TA = (salary * 12)/100;
 }

 public void calGs(double salary)
 {
    
    GS= salary + HRA + DA + TA;
 }
}
class Main
{
  public static void main(String[] args)
  {
 		 Scanner sc = new Scanner(System.in);
		//Grosssalary g2 = new Grosssalary(50000,13,23,32,12);
//		g2.display();
		 Grosssalary g = new Grosssalary();
		System.out.print("Enter salary:");
		double sal = sc.nextDouble();
		g.setsalary(sal);
	  	g.calHra(sal);
       g.calDa(sal);
		 g.calTa(sal);
		 g.calGs(sal);
		 g.display();
  }
}

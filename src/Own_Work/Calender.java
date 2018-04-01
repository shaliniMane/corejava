class  Calender
{
  private string month;
  private int year;



  Calender()
  {
	 month = "";
	 year = 0000;
  }
  Calender(string mont, int yr)
  {
	 month = mont;
	 year = yr;
  }
public string getmonth()
{
  return month;
}

public void setmonth(string mon)
{
  month = mon;
}

public int getyear()
  {
	 return year;
  }
public void setyear(int yr)
{
   year = yr;
}
  public void Nameofmonth(int mon)
  {
     	 if(!(mon>=1 && mon <=12))
			System.out.println("Invalid month.");


  }
  public void NoOfDaysInMonth(int yr)
  {
	 int months[] = {31,28,31,30,31,30,31,30,31,30,31,30};
     if(!(yr>=100 && yr<=9999))
		 System.out.println("Invalid year");

	  if(!(dd>=1 && dd<=months[mon]))
		 System.out.println("Invalid day");
  }
public void display()
{
 System.out.println(Name+" "+Days+" ");
}

}
class Main
{
  public static void main(String[] args)
	 {
        Calender c = new Calender();

		  System.out.println("Enter Month");
          Scanner sc = new Scanner(System.in);
           int mon = sc.nextInt();
            c.Nameofmnth(mon);

		  System.out.println("Enter year");
		  int yr = sc.nextInt();
           c.NoOfDaysInMonth(yr);
	 }
}

import java.util.Scanner;
class Time
{
  private int hours;
  private int minutes;
  private int seconds;
  public Time()
  {
	 hours = 0;
	 minutes = 0;
	 seconds = 0;
  }
  public Time(int h, int m, int s)
  {
	 hours = h;
	 minutes = m;
	 seconds = s;

  }
  public int getHours()
  {
	 return hours;
  }
  public void setHours(int h)
  {
	 hours = h;
  }
  public int getMinutes()
	   { 
	     return minutes;
	   } 
  public void setMinutes(int m)
   {
     minutes = m;
	}
  public int getSeconds()
  {
	 return seconds;
  }
  public void setSeconds(int s)
  {
	 seconds = s;
  }
  public void display()
  {
	 System.out.printf("%d:%d:%d\n",hours,minutes,seconds);
  }
  public void incrSeconds()
  {
	 seconds++;
	 if(seconds >= 60)
	 {
		seconds = 0;
		minutes++;
		if(minutes >= 60)
		{
		  minutes = 0;
		  hours++;
		  if(hours >=24)
		  {
			 hours = 0;
		  }
		}
	 }
  }
}
class Main
{
  public static void main(String[] args)
  {
	 Time t1 = new Time();
	 t1.display();

	 Time t2 = new Time(23, 59, 58);
	 t2.display();

	 t2.incrSeconds();
	 t2.display();

	 Scanner sc = new Scanner(System.in);
	 Time t3 = new Time();



	 System.out.print("Enter Time (hh mm ss):");
	 int h = sc.nextInt();
		t3.setHours(h);
	 int m = sc.nextInt();
	 t3.setMinutes(m);
	 int s = sc.nextInt();
	 t3.setSeconds(s);
	 t3.display();
	 t3.incrSeconds();
	 t3.display();

  }
}

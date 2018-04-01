import java.util.Scanner;
class TimeDemo
{
  private int hours;
  private int minutes;
  private int seconds;

  public TimeDemo()
  {
    hours = 0;
	 minutes = 0;
	 seconds = 0;
  }
  public TimeDemo(int h, int m, int s)
  {
	 hours = h;
	 minutes = m;
	 seconds = s;
  }
  public int gethours()
  {
	 return hours;
  }
  public void sethours(int h)
  {
	 if(h < 0 || h >= 60)
		     throw new RuntimeException("Invalid hours");
	 hours = h;
  }
  public int getminutes()
  {
	 return minutes;
  }
  public void setminutes(int m)
  {
	 if(m < 0 || m>=60)
		throw new RuntimeException("Invalid minutes");
	 minutes  = m;
  }
  public int getseconds()
  {
	 return seconds;
  }
  public void setseconds(int s)
  {
	 if(s < 0 || s>= 60)
		     throw new RuntimeException("Invalid seconds");
	 seconds = s;
  }
  public void display()
  {
	 System.out.println( +hours+" "+minutes+" "+seconds);
  }
  public void incrSeconds()
  {
	 seconds++;
	 if(seconds >= 60)
		seconds  = 0;
	 minutes++;
	 if(minutes >= 60)
		minutes = 0;
	 hours++;
	 if(hours >= 24)
		hours = 0;
  }
}



class Main
{
 public static void main(String [] args)
  {
	 TimeDemo t1 = new TimeDemo(); 
	 TimeDemo t2 = new TimeDemo(23,59,58);
	 t2.display();

	 t2.incrSeconds();
	 t2.display();

	 t2.incrSeconds();
	 t2.display();

	 Scanner sc = new Scanner(System.in);
	 Time t3 = new Time();

	 try
	 {
		System.out.print("Enter Time(hh mm ss)");
		int h = sc.nextInt();
		t3.sethours(h);
		int m = sc.nextInt();
		t3.setminutes(m);

		int s = sc.nextInt();
		t3.setseconds(s);

		t3.display();
		t3.incrSeconds();
		t3.display();

	 }catch(RuntimeException e){
	 System.out.println("Exception occured: " + e.getMessage());
	 e.printStackTrace();
  }
  System.out.println("Good bye..");
  Time t4 = new Time();
  t4.display();
}
}

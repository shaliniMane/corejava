package Second;
import First.One;
import java.util.Scanner;
public class Two
{
  public static void main(String[] args)
  {
	 System.out.println("Second.Two.main()");
	 One obj = new One();
	 obj.display();
	 try
	 {
		Two t1 = new Two();
		Scanner sc = new Scanner(System.in);
System.out.println("Enter num and num2");
		int result, num1,num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
      result = num1/num2;
		System.out.println(result);
	 }catch(RuntimeException e)
	 {
		e.printStackTrace();
	 }
  }
}

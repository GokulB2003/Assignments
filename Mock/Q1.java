/* Q1. Write a Java program to convert seconds to hours, minutes and seconds.  */
import java.util.*;
public class Q1
{
	public static void main(String args[])
	{
		//using Scanner class of util package
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no.of seconds");
		int sec=sc.nextInt();
		
		//1hr=3600 sec
		//1 min=60 sec;
		
		int hrs=(sec/3600);				//convert seconds to hours
		System.out.println("hrs:"+hrs);

		sec=sec-(hrs*3600);

		int min=(sec/60);				//seconds to minutes
		System.out.println("min:"+min);

	
		int seconds=(sec%60);				//seconds to hours, minutes,seconds
		System.out.println("Seconds:"+seconds);

		
	}
}
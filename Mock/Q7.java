/* Q7. Write a Java program to check whether a triangle is equilateral , isoscale 
or scalene. */
import java.util.*;
public class Q7
{
	public static void main(String args[])
	{
		//using Scanner class of util package
		Scanner sc=new Scanner(System.in);
		
		//take input of all three angles from user
		System.out.println("Enter the value of Angle1");
		int a=sc.nextInt();
		
		System.out.println("Enter the value of Angle2");
		int b=sc.nextInt();
		
		System.out.println("Enter the value of Angle3");
		int c=sc.nextInt();

		//in equilateral triangle three sides sum is 180
		//in isoscale trianle both sides are same 
		//in scalene triangle three sides are different
		
		String str=(((a==b) && (b==c)) && ((a+b+c)==180)) ? "Equilateral" : ((a==b) || (b==c) || (a==c)) ? "Isoscale": "Scalene";
		System.out.println(str);
	}
}
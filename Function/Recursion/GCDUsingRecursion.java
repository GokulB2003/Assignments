/*Write a program to find the greatest common divisor (GCD) of two numbers using recursion.
*/
import java.util.*;
public class GCDUsingRecursion
{	static int result=0;
	public static int GCD(int a,int b,int i)
	{
		if(i<=a/2)
		{
			if(a%i==0 && b%i==0)
			result=i;
			GCD(a,b,++i);
		}
		return result;
		
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		int result=GCD(a,b,1);
		System.out.println(result);
		
		
	}
}
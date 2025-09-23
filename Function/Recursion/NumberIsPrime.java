/*Write a program to check whether a given number is prime using recursion*/
import java.util.*;
class ABC
{
	Boolean checkPrime(int n,int i)
	{	if(i>=n/2)
		{
			return true;
		}
		if(n%i==0)
		{
			return false;
		}
		checkPrime(n,i+1);
		return true;
	}
}
public class NumberIsPrime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ABC obj=new ABC();
		Boolean b=obj.checkPrime(n,2);
		if(b)
		{
			System.out.println("Prime num");
		}
		else
		System.out.println("Not Prime");	
	}
}
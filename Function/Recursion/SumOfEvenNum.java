/*Write a program to find the sum of even numbers up to n using recursion.
*/
import java.util.*;
class Without
{
	int s(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n%2==0)
		{
			return n+s(--n);
		}
		else
		return s(--n);
	}	
}
class ABC		//using third parameter
{
	int sum(int n,int s)
	{
		if(n==0)
		{
			return s;
		}
		if(n%2==0)
		{
			s+=n;
		}
		return sum(--n,s);
	}
}
public class SumOfEvenNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		ABC obj1 = new ABC();
	        Without obj2 = new Without();


        System.out.println("Using extra parameter: " + obj1.sum(n, 0));
        System.out.println("Without extra parameter: " + obj2.s(n));
		
				
	}
}
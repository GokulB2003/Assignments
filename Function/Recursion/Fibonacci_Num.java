/*Write a program to print the first n Fibonacci numbers using recursion.
*/
import java.util.*;
class PrintFibbo
{
	int fibbo(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fibbo(n-1)+fibbo(n-2);
		
	}
}
public class Fibonacci_num
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PrintFibbo obj=new PrintFibbo();
		for(int i=0; i<=n; i++)
		{
		System.out.println(obj.fibbo(i));
		
		}
		//System.out.println(result);
		
	}
}
/*Check Prime Number
Write a function isPrime(int n) that checks if a number is prime or not.
Use it in main() to test different inputs.
*/
import java.util.*;
public class CheckPrimeUsingFun
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number n:");
		int n=sc.nextInt();
		int result=prime(n);
		if(result==1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
	public static int prime(int n)
	{	int a=0;
		Boolean flag=true;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			a=1;
		}
		else
		{
		a=0;
		}
		return a;
	}
}
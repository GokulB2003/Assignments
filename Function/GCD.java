/*Write a function to find the GCD (HCF) of two numbers*/
/*Write a function to find the LCM of two numbers using HCF.*/

import java.util.*;
class H
{
	int HCF(int a,int b)
	{	int n=0,f=0;
		if(a>b)
		{
			n=b;
		}
		else
		{
			n=a;
		}
		int i=1;
		while(i<=n/2)
		{
			if(a%i==0 && b%i==0)
			{
				f=i;
			}
			i++;
		}
		return f;
	}

	double LCM(int a,int b,int re)
	{
		
		double result=(a*b)/re;
		return result;
	}
}
public class GCD
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of B:");
		int b=sc.nextInt();
		H obj=new H();
		int result=obj.HCF(a,b);
		System.out.println("HCF"+result);
		double re=obj.LCM(a,b,result);
		System.out.println("LCM is:"+re);
		
	}
	
}
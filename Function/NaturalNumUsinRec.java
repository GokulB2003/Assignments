/*Write a program to find the sum of first n natural numbers using recursion.
*/
import java.util.*;

class ABB
{
	int result=0;
int sum(int i,int n)
{
	if(i>n)
	{
		return result;
	}
	else
	{
		result+=i;
		return sum(++i,n);
	}
											//n(n+1)/2==>10(11)==>110/2==>55 
		
}

		//Or

int sm=0;
int s(int n)
{
	if(n==0)
	{
		return sm;
	}
	else
	{	
		sm+=n;
		return s(n-1); 
	}
}
}
public class NaturalNumUsinRec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		ABB obj=new ABB();
		int i=1;
		int result=obj.sum(i,n);
		System.out.println(result);

		
	}
}
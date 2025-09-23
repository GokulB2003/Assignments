/*Write a program to find the sum of squares of first n natural numbers using recursion.
*/
import java.util.*;
class ABC
{
	int sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		
		return n*n+sum(n-1);
	}
}
public class SumOfSqrOf1stnNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ABC obj=new ABC();
		System.out.println(obj.sum(n));
	}
}
/*
Write a java program to display 1 to nth Perfect Number.
perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6,which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.

*/
import java.util.*;
public class PerfectNumberAll
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j=2;
		while(j<n)
		{
			int count=0;
			int i=1;
			while(i<j)
			{
				if(j%i==0)
				{
					count+=i;
				}
			i++;
			}	
			if(count==j)
			{
				System.out.println(j);
			}
		j++;
		}
	}


}
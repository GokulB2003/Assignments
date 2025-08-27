/* Write a Java program to check whether a given number is a Harshad number (i.e., divisible by the sum of its digits) for numbers from 1 to n.
*/
import java.util.*;
public class Harshad
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		int temp=n;//20
		int j=1;
		while(j<temp)//20
		{	n=j;
			int sum=0;
			while(n!=0)//1 2
			{
				int rem=n%10;
				sum+=rem;
				n=n/10;
				
			}
			//System.out.println(sum);
			if((j%sum)==0)//2
			{
				System.out.println(j);
			}
			//System.out.println(j);
		    j++;
		}
	}
	
}
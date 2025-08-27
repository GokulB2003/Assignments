/*Q46. Write a Java program to find all Abundant numbers up to n.
 An Abundant number is a number for which the sum of its proper divisors is greater than the number itself.
 Example: 12 is abundant because its proper divisors are 1, 2, 3, 4, 6 → sum = 16 > 12.
Explanation:
 Use nested loops: outer for numbers from 1 to n; inner for finding proper divisors and summing them. Compare sum with the number.
*/
import java.util.*;
public class Abundat
{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
		while(i<n)
		{
			int temp=i;
			int j=1,sum=0;
				
			while(j<=i/2)
			{
				if(i%j==0)
				{
					sum+=j;
				}
			j++;
			}
			if(sum>i)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
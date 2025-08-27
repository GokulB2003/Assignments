/*Q48. Write a Java program to display all Twin Primes between 1 and n.
 Twin Primes are pairs of prime numbers that differ by 2.
 Example: (3, 5), (5, 7), (11, 13).
Explanation:
 Use loops:
First, loop through numbers from 2 to n.
For each, check if it and the next number +2 are both prime using an inner loop.
If both are prime, print the pair.
*/
import java.util.*;
public class TwinPrime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int i=2;
		while(i<n)
		{	Boolean flag=false;
			int temp=i,j=2;
			while(j<=(temp/2))
			{
				if(temp%j==0)
				{
					flag=true;
				}
				j++;
			}
			temp=temp+2;
			j=2;
			while(j<=(temp/2))
			{
				if(temp%j==0)
				{
					flag=true;
				}
				j++;
			}
			if(flag==false)
			{
				System.out.println("("+ i + "," + temp +")");
			}

		i++;

		}
		
	}
}
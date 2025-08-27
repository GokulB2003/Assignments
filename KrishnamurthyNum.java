/*Q50. Write a Java program to check whether a given number is a Krishnamurthy Number and list all Krishnamurthy numbers up to n.
 A Krishnamurthy number is a number whose sum of the factorials of its digits equals the number itself.
 Example: 145 → 1! + 4! + 5! = 145.
Explanation:
 Use loops:
Outer loop for numbers from 1 to n.
Inner loop to extract digits and compute each digit’s factorial with another nested loop.
Sum and compare with the original number.
*/
import java.util.*;
public class KrishnamurthyNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int i=1;
		while(i<n)
		{
			int temp=i;
			int fact=1;
			int sum=0;
			while(temp!=0)
			{	int rem=temp%10;
				fact=1;
				while(rem!=0)
				{
					fact=fact*rem;
					rem--;
				}
				sum+=fact;
				temp=temp/10;
			}
			//System.out.println(sum);
			//System.out.println(i);
			if(sum==i)
			{
				System.out.println(i);
			}

		 i++;
		}
	}
}
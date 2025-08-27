/*Q43. Write a Java program to find the largest and smallest digit of a given number.
 Explanation:
 Use a while loop to extract digits, compare each digit to track max and min.
*/
import java.util.*;
public class LargestAndSmall{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		int max=0,min=0;
		while(n!=0)
		{	int rem=n%10;
			if(rem>max)
			{
				max=rem;
			}
			else
			{	if(rem<min)
				{
				min=rem;
				}	
			}
				
			n=n/10;
		}
		System.out.println(max);
		System.out.println(min);	
	 }
}
/* Write a java program to display 1 to nth Armstrong Number.
Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.
*/
import java.util.*;
public class AllArmStrong{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
		
		while(i<n)
		{	int count=0;
			int j=i;
			int sum=0;
			int temp=j;
			while(j!=0)
			{	
				count++;
				j=j/10;
			}
			j=temp;
			while(j!=0)
			{	int rem=j%10;
				int power=(int)(Math.pow((rem),count));
				sum+=power;
				j=j/10;
			}
			if(sum==temp)
			{
				System.out.println(i);
			}
						
			i++;
			
		}
		
		
	}
}
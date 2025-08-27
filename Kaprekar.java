/*Q44. Write a Java program to check whether a given number is a Kaprekar number or not, and to display all Kaprekar numbers up to n.
A Kaprekar number is a non-negative integer, the representation of whose square can be split into two parts that add up to the original number itself.
 For example:
9² = 81 → split as 8 and 1 → 8 + 1 = 9
45² = 2025 → split as 20 and 25 → 20 + 25 = 45
*/
import java.util.*;
public class Kaprekar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		int i=1;
		while(i<n)
		{
			int sqr=i*i;
			int t=i;
			int temp=sqr;
			//System.out.println(sqr);
			int sum=0,rem=0,count=0;
			while(t!=0)
			{	++count;
				t=t/10;
				
			}
			sqr=temp;	
			//System.out.println();
			 int pow = (int)Math.pow(10,(count));  // pow = 100
                         int right = sqr % pow;   //  81%100           // right = 2025 % 100 = 25
                         int left = sqr / pow;    //              // left = 2025 / 100 = 20

			sqr=temp;
			sum=(left+right);
			//sum=t;
			//System.out.println(i);
			if(sum==i)
			{	System.out.println(i);
			}

			//System.out.println(sum);
			i++;
		
		}
		
		
	}
}
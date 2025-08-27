/*Q38. Write a java program to find HCF (GCD) of two numbers.
*/
import java.util.*;
public class GCD
{	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first digit:");
		int a=sc.nextInt();
		System.out.println("Enter the value of second digit:");
		int b=sc.nextInt();
		//6 1 2 3
		//9 1 3
		int n=0;
		if(a<b)
		{
		 n=a;
		}
		else{
		 n=b;
		}
		int sum=0;
		int i=1;
		while(i<=n/2)
		{
			if((a%i==0) && (b%i==0))
			{sum=i;
			}
			i++;

		}
		System.out.println(sum);
	}
}
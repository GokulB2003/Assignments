/*Q39. Write a java program to find LCM of two numbers.
*/
import java.util.*;
public class LCM
{
	public static void main(String args[])
	{Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the value of a:");
	 int a=sc.nextInt();
	 System.out.println("Enter the value of b:");
	 int b=sc.nextInt();

	//4 8 12 16 20 24 28 32 36 40 
	//8 16 24 32 40 48 56 62 70 78
	int n=0,i=1;
	n=(a>b)?a:b;      /*(a*b/GCD)*/ 
	while(true)
	{
		if((n%a==0) && (n%b==0))
		{
			System.out.print(n);
			break;
		}
	n++;
	}
	}
}
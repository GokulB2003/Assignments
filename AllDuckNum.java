/*. Write a java program to display 1 to nth Duck Number.
*/
import java.util.*;
public class AllDuckNum
{	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of n:");
		int n=sc.nextInt();
		System.out.println("Enter the number which number u want:");//3
		int p=sc.nextInt();
		System.out.println("Enter the number which number u want:");//5
		int q=sc.nextInt();
		int sum=0;
		int count=0;
		int i=1;
		while(i<=n)
		{	boolean flag=true;
			int j=i;
			while(j!=0)
			{
				int rem=j%10;
				if(rem==0)
				{
					
					flag=false;
				}
			j=j/10;
			}
			if(flag==false)
			{	System.out.println(i);
				count++;
				if((count==p) || (count==q))
				{
					sum+=i;
					//System.out.println(sum);
				}
			}
		 i++;
		}
		System.out.println(sum);
	}
}
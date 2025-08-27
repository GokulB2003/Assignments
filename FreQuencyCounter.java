/* Write a java program to find the frequency of each digit in a given integer.
*/
import java.util.*;
public class FreQuencyCounter{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int count=0,i=0;
		int temp=n;
		while(i<9)//0
		{	count=0;
			n=temp;
			while(n!=0)//123 1
			{
				int rem=n%10;//3 2
				if(rem==i)//
				{
					count++;
				}
				n=n/10;
			}
			if(count>0){
			System.out.println(i+": "+count);
			}
			i++;
		}
		
				
	}
}
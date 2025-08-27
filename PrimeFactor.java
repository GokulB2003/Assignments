/* Write a java program to find all prime factors of a number.*/
import java.util.*;
public class PrimeFactor
{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter the number:");
		int n=sc.nextInt();
		int i=2;
		Boolean flag=false;
		int j=1;
		while(j<n) //15 2
		{       i=2;
			while(i<j) //3
			{

				if(j%i==0) 
				{
					flag=true;
					break;
				}
			i++;
			}
			if(flag==false)
			{
				if(n%j==0)
				{
					System.out.println(j);
				}
			}
		
		j++;	//2
		}
				
		
		
		
	}
}

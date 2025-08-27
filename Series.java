/*Q51. Write a java program to display following series :
           	1  2  2  4  3  6  4  8  5  10  6  12
*/
import java.util.*;
public class Series
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int i=1;
		while(i<n)
		{	if(i==1)
			System.out.print(i+" "+(i*2));
			else
			{
				System.out.print(" "+i+" "+(i*2));
			}
			
		i++;
		}
		
		
	}
}
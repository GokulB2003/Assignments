/*Write a java program to display following series :
2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1*/
import java.util.*;
public class CubeSeries
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		//int n=sc.nextInt();
		int i=2;
		int j=10;
		int q=j;
		while(j>0)
		{	
			if(i==2)
			System.out.print(i);
			else{
			int p=j*j;
			System.out.print(" "+(p*j));
			System.out.print(" "+i);
			}
		j--;
		i=i+2;
		}
		
	}
}	
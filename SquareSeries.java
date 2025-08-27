 /*Q53. Write a java program to display following series :
           	1  4  9  16  25  36  49  64  81  100*/
import java.util.*;
public class SquareSeries
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		//int n=sc.nextInt();
		int i=1;
		int square=1;
		while(i<=10)
		{
			square=i*i;
			if(i==1)
			System.out.print(square);
			else{
				System.out.print(" "+square);
			}
			i++;
		}
	}
}

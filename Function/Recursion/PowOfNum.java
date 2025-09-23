/*Write a program to calculate the power of a number (x^n) using recursion.*/

import java.util.*;
public class PowOfNum
{	int pow=1;
	public static int power(int base,int index)
	{
		if(index==0)
		{
			return 1;
		}
		else
		return base*power(base,--index);
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		int result=power(2,4);
		System.out.println(result);

		
	}
}
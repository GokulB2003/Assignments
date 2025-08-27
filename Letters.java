/*
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA
*/

import java.util.*;
public class Letters
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(j+64));					
							
			}
			for(int k=i-1; k>=1; k--)
			{
				System.out.print((char)(k+64));
			}

			System.out.println();
		      
		}

			
		
	}

}
/*
123454321 
1234321 
12321 
121 
1 
*/
import java.util.*;
public class PyramidUltaa
{
	public static void main(String args[])
	{
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			for(int j=i-1; j>=1; j--)
			{
				System.out.print(j);
			}

			System.out.println();
		}
				
	}	
}
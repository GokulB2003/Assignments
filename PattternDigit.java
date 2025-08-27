/*
	1
       1 2
     1	   3
    1       4  
*/
import java.util.*;
public class PattternDigit
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if((6-i)==j && (4+i)==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
					
				System.out.println();
		}
	}
}
/*
*
** 
***
****
*****
****
***
**
*
*/
import java.util.*;
public class SolidHalfDiamond
{
	public static void main(String args[])
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i<=5)
				{
				if(i>=j)
				{
					System.out.print("*");
				}
				}
				else
				{
					if(j<=(10-i))
					{
						System.out.print("*");	
					}
				}
				
			}
			System.out.println();
		}
	}
}
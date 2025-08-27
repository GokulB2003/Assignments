/*
3
44
555
6666
555
44
3
*/

import java.util.*;
public class HollowDiamondDiff
{
	public static void main(String args[])
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=4; j++)
			{	
				if(i<=4)
				{
					if(i>=j)
					{
						System.out.print(i+2);
					}
				}
				else
				{
					if(j<=(8-i))
					{
						System.out.print(10-i);
					}
				}

			}
			System.out.println();
		}
	}
} 
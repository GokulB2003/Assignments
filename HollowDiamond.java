import java.util.*;
public class HollowDiamond
{
	public static void main(String args[])
	{
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if(i<=5)
				{
					if(j==(6-i) || (j==(i+4) && i!=1))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					if(j==(i-5) || j==(15-i))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
			}
			System.out.println();

		}
	}

}
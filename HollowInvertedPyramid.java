/**/
import java.util.*;
public class HollowInvertedPyramid
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if((i==1))
				{
					System.out.print(j);
					
				}
				else if(j==1)
				{
					System.out.print(i);
				}
				else if( ((j!=1) && (6-i)==j))
				{
					System.out.print(5);
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
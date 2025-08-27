/*    	1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/
import java.util.*;
public class PalindromePyramid
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if((6-i)==j)
				{
					for(int k=1; k<=i; k++)
					{
						System.out.print(k);
					}
				}
			}
			for(int p=(i-1); p>=1; p--)
			{
				System.out.print(p);
			}
			System.out.println();
		}
	}
}
/*
	1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4

*/
import java.util.*;
public class PatternWithDigit
{
	public static void main(String args[])
	{	int p=1;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=7; j++)
			{
				if(j>=(5-i) && (j<=(3+i)))
				{
					System.out.print(j+" ");
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

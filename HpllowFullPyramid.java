/*



*/
import java.util.*;
public class HpllowFullPyramid
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			int k=1;
			for(int j=1; j<=9; j++)
			{	
				if(((6-i)==j) && j!=1 )
				{
					System.out.print(1);
				}
				else if((4+i)==j )
				{
					System.out.print(i);
				}
				else if((i==5) && (j%2!=0) )
				{
					System.out.print(k);
					k++;
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
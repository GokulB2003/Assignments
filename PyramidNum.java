/*
1	 1
12	21
123    321
1234  4321
1234554321
*/
import java.util.*;
public class PyramidNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=10; j++)
			{	
				
				if(i>=j)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
				int g=1;
				while(g<=1)
				{
					if(11-i<=j)
					{
					int p=(11-j);
					System.out.print(p);
					}
					else
					System.out.print(" ");
				g++;
				}

				
			}
			System.out.println();
		}
	}
}
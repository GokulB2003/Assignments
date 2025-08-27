import java.util.*;
public class ABC
{
	public static void main(String args[])
	{	int n=5;
		for(int i=1; i<5; i++)
		{
			for(int j=1; j<=5; j++)
			{	if((i==1) &&(j!=5))
				{
					System.out.print(j);
				}
				if((((j==1) && (i!=j)) &&(j!=5)))
				{
					System.out.print(i+" ");
				}
				if(j==(6-i))
				{
					System.out.print(n);
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
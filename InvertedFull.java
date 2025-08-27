import java.util.*;
public class InvertedFull
{
	public static void main(String args[])
	{
				{
			for(int i=1; i<=6; i++)
			{	boolean flag=true;
				for(int j=1; j<=11; j++)
				{
					if((j>=i) && (j<=(12-i)) && flag)
					{
					System.out.print("*");
					flag=false;	
					}
					else
					{
					System.out.print(" ");
					flag=true;
					}
				}
				System.out.println();
			}
			
		}
	}
}
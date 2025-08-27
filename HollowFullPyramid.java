import java.util.*;
public class HollowFullPyramid
{
	public static void main(String args[])
	{
		for(int i=1; i<=6; i++)
		{	boolean flag=true;
			for(int j=1; j<=11; j++)
			{
				if((i+5)==j || (7-i)==j)
				{
					System.out.print("*");
					flag=false;
				}
				if((i==6) && flag)
				{
					System.out.print("*");
					flag=false;
				}
				else
				{
					System.out.print(" ");
					flag=false;
				}
			}
				System.out.println();
		}
	}
}
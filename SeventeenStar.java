import java.util.*;
public class SeventeenStar
{
	public static void main(String args[])
	{	
		for(int i=1;i<=5; i++)
		{
			Boolean flag=true;
			for(int j=1; j<=17; j++)
			{	
				if((i>=(10-j)) && (j<=(i+8)) && flag==true)
				{
					System.out.print(i);
					flag=false;
				}
				else
				{
					System.out.print("*");
					flag=true;
				}
			}
			System.out.println();
		}
	}
}
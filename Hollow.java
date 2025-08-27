import java.util.*;
public class Hollow1
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int k=i; k<=(i-1); k++)
			{
				int p=i;


				for(int j=1; j<=5; j++)
				{
									
					if(i>=j)
					{
						System.out.print(j);
						System.out.print(p);
						p--;
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

			
		
	}
}
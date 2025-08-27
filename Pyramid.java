import java.util.*;
public class Pyramid
{
	public static void main(String args[])
	{	int k=0;
		for(int i=1; i<=5; i++)
		{
			boolean flag=true;
			for(int j=1; j<=10; j++)
			{	if(j<=5)
				{
					if(j%2!=0 && i>=j)
					{
					System.out.print(0);
					//flag=false;		
					}
					else if(j%2==0 && i>=j)
					{
						System.out.print(1);
					}
					else
					{
						System.out.print(" ");	
					}
				}
				else
				{
					if(j>=(10-i) && flag)
					{
						System.out.print(0);
					 	flag=false;		
					}
					else if( (j>=(10-i)) && flag==false)
					{
						System.out.print(1);
						flag=true;
					}
					else
					{
						System.out.print(" ");	
					}

				}
			}
			System.out.println();
			
		}
	}
}
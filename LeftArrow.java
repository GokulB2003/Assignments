/*LeftArrow*/
public class LeftArrow
{
	public static void main(String args[])
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if(i<=5)
				{	if(i==5 || ((6-i)==j && i!=5))
					System.out.print("*");
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					if((i-4)==j)
					{
						System.out.print("*");	
					}
					else
					{	System.out.print(" ");

					}
				}
			}
			System.out.println(" ");
		}
	}
}
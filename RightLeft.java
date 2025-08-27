/*
	 1
        1 2
       1   3 
      1     4

*/
public class RightLeft
{
	public static void main(String args[])
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=7; j++)
			{
				if(j==(5-i))
				{
					System.out.print(1);
				}
				if((j==i+3) && (i!=1))
				{
					System.out.print(i);
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
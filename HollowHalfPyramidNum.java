/*
1
1 2
1  3
1   4
12345
*/
public class HollowHalfPyramidNum
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if((j==1) || (j==i) ||(i==5))
				{
					System.out.print(j);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
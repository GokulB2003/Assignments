import java.util.*;
public class TriangleWithNum
{
	public static void main(String args[])
	{	int k=1;
		for(int i=1; i<=4; i++)
		{
			Boolean flag=true;
			for(int j=1; j<=7; j++)
			{
				if(j>=5-i && j<=(3+i) && flag)
				{
					System.out.print(k);
					k++;
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
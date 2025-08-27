import java.util.*;
public class Diamond
{
	public static void main(String args[])
	{
		for(int i=1; i<=10; i++)
		{	Boolean flag=true;
			for(int j=1; j<=9; j++)
			{	if(i<=5){
				if((j>=(6-i)) && (j<=i+4) && flag)
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
				else
				{
					if(j>=(i-5) && (j<=(15-i)) && flag)
					{
						System.out.print("*");
						flag=false;
						
					}
					else{
						System.out.print(" ");
						flag=true;
					}
				}
											
			}
			System.out.println();
		}
	}
}
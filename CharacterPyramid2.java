
/* 
C program to print following character pyramid: 
ABCDEDCBA 
ABCDEDCBA 
ABC   CBA 
AB     BA 
A       A 
*/
import java.util.*;
public class CharacterPyramid2
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{	char ch='A';
			for(int j=1; j<=9; j++)
			{
				if(j<=(6-i) && j<=5)
				{	if(i==1 && j==5)
					{
						System.out.print(ch);
					}
					else
					System.out.print((char)ch++);

				}
				else if(j>5 && (j>=i+4))
				{	
					System.out.print(--ch);
					
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
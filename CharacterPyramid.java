/*C program to print character pyramid as given below: 
A 
B C 
D E F 
G H I J 
K L M N O 
*/
import java.util.*;
public class CharacterPyramid
{
	public static void main(String args[])
	{
		int p=65;
		for(int i=1; i<=5; i++)
		{	boolean flag=true;
			for(int j=1; j<=9; j++)
			{
				if(j<=((i*2)-1) && flag)
				{
					System.out.print((char)p++);
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
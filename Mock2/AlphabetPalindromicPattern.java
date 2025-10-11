//Alphabet Palindromic Pyramid


import java.util.*;
public class AlphabetPalindromicPattern
{
	public static void main(String args[])
	{	//char ch='A';
		char ch='A';
		for(int i=1; i<=9; i++)
		{

		    for(int j=1; j<=5; j++)
		    {
			
				if(j>=(6-i) && j<=(i+4))
				{
					System.out.print(ch);
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
//Alphabet Palindromic Pyramid


import java.util.*;
public class AlphabetPalindromicPatternNew
{
	public static void main(String args[])
	{	//char ch='A';
		
		for(int i=1; i<=5; i++)
		{
			char ch='A';
			ch=(char)(ch+(i-1));
		    for(int j=1; j<=9; j++)
		    {
			
				if(j>=(6-i) && j<=(i+4))
				{	
					if(j<5)
					System.out.print(ch--);
					else
					{
						System.out.print(ch++);
					}
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
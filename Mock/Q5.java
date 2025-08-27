/*Q5. Write a java program to input any character and check whether it is alphabet, digit or special 
character. */
import java.util.*;
public class Q5
{
	public static void main(String args[])
	{
		//using Scanner class of util package
		Scanner sc=new Scanner(System.in);
		
		//take Input character from user
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		//check it is  alphabet ,digit,special:
		
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))  //check for character
		{
			System.out.println("Alphabet");
		}
		else if((ch=='!') || (ch=='?') || (ch=='@') || (ch=='#') || (ch=='%') || (ch=='&') || (ch=='*') )//check for special character
		{
			System.out.println("Special Character");
		}
		else
		{
			System.out.println("Digit");        		//checking for digit
		}

		

	}
}
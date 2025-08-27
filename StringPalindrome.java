/*Check if a string is a palindrome using the two-pointer approach.
*/
import java.util.*;
public class StringPalindrome
{
	public static void main(String args[])
	{	String ch="ABA";
		//char p[]=ch.toCharArray();
		ch.toCharArray();
		//char ch[]={'a','e','a'};
		int start=0;
		int end=ch.length()-1;
		Boolean flag=true;
		while(start<=end)
		{
			if(ch.charAt(start)!=ch.charAt(end))
			{
				flag=false;
				break;
			}
			start++;
			end--;
		}
		if(flag==false)
		{
			System.out.print("Not Palindrome");
		}
		else
		{
			System.out.println("Palindrome");
		}
	}
}
/*Write a program to check whether a given number is a palindrome using recursion.*/
import java.util.*;
class Check
{	int rev=0;
	int checkPalin(int n)
	{
		if(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			return checkPalin(n/10);
		}
		return rev;
	} 
}
public class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Check obj=new Check();

		int result=obj.checkPalin(n);
		if(result==n)
		{
			System.out.println("Palindrome");
		}
		else
		System.out.println("Not Palindrome");

	}
}
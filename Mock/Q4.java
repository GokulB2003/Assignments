/*Q4. Write a java program to check whether number is palindrome or not palindrome using   
ternary operators.*/
import java.util.*;
public class Q4
{
	public static void main(String args[])
	{
		//using Scanner class of util package
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the 3 digit value of n:");
		int n=sc.nextInt();
		

		//without using loop

		//only for last digit reverse
		int temp=n,rev=0;
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;

		//second last Digit reverse
		
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;

		//Third last digit 
		 rem=n%10;
		rev=rev*10+rem;
		n=n/10;

		//check both values are equal or not after reversing
		String str=(rev==temp) ? "Palindrome" : "Not palindrome";
		System.out.println(str);

	}
}

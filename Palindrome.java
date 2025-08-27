/*
Write a java program to check whether number is palindrome or not.
121=121 
*/
import java.util.*;
public class Palindrome{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int no=sc.nextInt();
	int original=no;
	int rev=0;
	
	no = (no%10)*100 +( (no/10)%10)*10 + no /100;
	String palindrome=(original==no) ? "Palindrome" : "not palindrome";
	System.out.println(palindrome);
	
	
	
	
	
}

}
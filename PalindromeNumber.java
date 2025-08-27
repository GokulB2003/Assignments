//Write a java program to check whether a number is palindrome or not. 
import java.util.*;
public class PalindromeNumber{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();//121
int original=n;//121
int rev=0;
while(n>0)
{
	int rem=n%10;//1 2 1
	rev=rev*10+rem;//10 30 40
	n=n/10;//12 1 0
	
}
if(original==rev){
System.out.println("palindrome");
}
else{
System.out.println("Not a palindrome");
}

}
}
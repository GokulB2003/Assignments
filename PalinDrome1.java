//Q14. Write a java program to check whether a number is palindrome or not.
import java.util.*;
public class PalinDrome1{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp=n;

int rev=0;
while(n!=0)
{int rem=n%10;
rev=rev*10+rem;
n=n/10;
}
String str=(temp==rev)? "Palindrome" :"Not Palindrome";
System.out.println(str);
}
}
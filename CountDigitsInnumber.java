//Write a C program to count the number of digits in a number.
import java.util.*;
public class CountDigitsInnumber{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the vlue of n:");
int n=sc.nextInt();
int count=0;
while(n!=0)
{
	int rem=n%10;
	count++;
	n=n/10;
}
System.out.println(count);
}
}

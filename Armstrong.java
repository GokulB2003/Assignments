//Java Program to Check Armstrong Number
import java.util.*;
public class Armstrong{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n");
int n=sc.nextInt();//370
int original_number=n;
int sum=0;
while(n!=0)
{
	int rem=n%10;
	int cube=rem*rem*rem;
	sum+=cube;
	n=n/10;
	
}
String a=(sum==original_number) ?"Armstrong" :"Not ArmStrong";
System.out.println(a); 

}
}
/*
rite a java program to Check Number Is Spy Number or Not.
Example :
        	 A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
	 Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8

*/
import java.util.*;
public class SpyNumber{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int sum=0,product=1;
while(n>0)
{
int rem=n%10;
sum+=rem;
product=product*rem;
n=n/10;
}
if(sum==product)
{
System.out.println("Spy number");
}
else{
System.out.println("Not a spy number");
}



}
}
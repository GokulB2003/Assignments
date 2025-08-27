/* Write a program to calculate sum of first and last digit of a number without using loop.
Input : 123
Output : 4
*/
import java.util.*;
public class FirstAndLastSum{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value:");
	int n=sc.nextInt();//123
	int last=n%10; //3
	int sum=0;//0
	sum+=last;//3
	n=n/10;//12

	last=n%10;//2
	n=n/10;//1
	last=n%10;//1
	sum+=last;
	System.out.println("the sum of first and last digit is:"+sum);

	
}
}
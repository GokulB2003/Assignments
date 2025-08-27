/* Write a Java program and compute the sum of an integer's digits.
Input : 123
Output : 6
*/

import java.util.*;
public class AddDigits{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
	int n=sc.nextInt();//123

        int sum=0;
	int rem=n%10;//3
	sum=sum+rem;//3
	n=n/10;//12
	rem=n%10;//2
	sum+=rem;//5
	n=n/10;//1       1/10=0
	rem=n%10;//
	sum+=rem;//6
	
	System.out.println("the sum of digits is:"+sum);
	
	

}
}
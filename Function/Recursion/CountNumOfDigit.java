/*Write a program to count the number of digits in a given number using recursion.
*/
import java.util.*;
class CountDigit
{
	int count(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return 1+count(n/10);
		
	}
}
public class CountNumOfDigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		CountDigit obj=new CountDigit();
		System.out.println(obj.count(n));

	}
}
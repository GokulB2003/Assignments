/*Write a program to reverse a given number using recursion.
*/
import java.util.*;
class ABC
{	
	int reverse(int n,int rev)
	{
		if(n==0)
		{
			return rev;
		}
		int rem=n%10;
		rev=rev*10+rem;
		return reverse(n/10,rev);

	/*	
		int n=123;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
	*/
			
	}
}
public class RevNumUsingRecursion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ABC obj=new ABC();
		System.out.println(obj.reverse(n,0));	
	}
}
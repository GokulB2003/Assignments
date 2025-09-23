/*Write a program to find the product of digits of a given number using recursion.
*/
import java.util.*;
class NewOR
{
	int product(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return (n%10)*product(n/10);
	}
}
	//OR
class ABC
{
	int Product(int n,int prod)
	{	if(n==0)
		{
			return prod;
		}
		if(n!=0)
		{
			int rem=n%10;
			prod=prod*rem;
			
		}
		return Product(n/10,prod);
	}
}
public class ProductOfDigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ABC obj=new ABC();
		NewOR ab=new NewOR();
		System.out.println(ab.product(n));
		System.out.println(obj.Product(n,1));
		
			
	}
}
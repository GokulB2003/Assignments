/*Write a program to print numbers from 1 to n using recursion.
*/
import java.util.*;
class ABC
{
	void Nums(int n)
	{	
		if(n==0)
		{
			return;
		}
		Nums(n-1);
		System.out.print(n+" ");
	}
}
public class PrintNumFrom1ToN
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ABC obj=new ABC();
		obj.Nums(n);
		
	}
}
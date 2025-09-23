/*Write a program to print numbers from n down to 1 using recursion.*/
import java.util.*;
class ABC
{
	void num(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		num(n-1);
	}
}
public class PrintNumfromNto1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num n:");
		int n=sc.nextInt();
		ABC obj=new ABC();
		obj.num(n);
		//System.out.println(r);
	}
}
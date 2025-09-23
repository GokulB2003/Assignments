/*Write a program to calculate the factorial of a given number using recursion.
*/
import java.util.*;
class ABC
{
int fact(int n)
{
	if(n==0)
	return 1;
	else
	{
		return n*fact(n-1);
	}
}
}
public class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ABC obj=new ABC();
		int p=obj.fact(n);
		System.out.println(p);

	}
}
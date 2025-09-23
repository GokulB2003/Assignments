/*Write a program to calculate the nth triangular number using recursion.*/
import java.util.*;
class NthNum
{
	int nthNum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n+nthNum(n-1);

	}
}
public class NthTriangularNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		NthNum obj=new NthNum();
		System.out.println(obj.nthNum(n));
				

	}
}
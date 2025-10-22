import java.util.*;
public class SumofSqr
{
	public static int sumOfs(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n*n+sumOfs(n-1);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sumOfs(n));
	}
}

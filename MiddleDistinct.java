/*Q52. Print the middle value among 3 distinct integers.*/
import java.util.*;
public class MiddleDistinct
{	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a!=b) &&(b!=c))
		{
			if((a>b && a<c) || (a>c && a<b))
			{
				System.out.println(a);
			}
			else if((b<c && b>a) || (b>c && b<a))
			{
				System.out.println(b);
			}
			else{
				System.out.println(c);
			}
		}
	}
}
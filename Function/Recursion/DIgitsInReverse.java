/*16. Write a program to print the digits of a number in reverse order using recursion.
*/
import java.util.*;
class ABC
{	
    void PrintR(int n)
    {
	if(n==0)
	{
		return;
	}
	
		int rem=n%10;
		System.out.println(rem);
		PrintR(n/10);
      }
	
}
public class DIgitsInReverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ABC obj=new ABC();
		obj.PrintR(n);
		
	}
}
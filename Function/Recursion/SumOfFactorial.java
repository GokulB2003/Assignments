/*Write a program to find the sum of factorials from 1 to n using recursion.
*/
import java.util.*;
class Fact
{
	int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n*factorial(n-1);
	}
}
public class SumOfFactorial
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter the num:");
        int n = sc.nextInt();
	Fact obj=new Fact();
	int sum=0;
	for(int i=1; i<=n; i++)//1->1 2->2 3->6 4->24 
	{	//System.out.println(obj.factorial(n));
		sum+=obj.factorial(i);
	}
	System.out.println(sum);
     }

}
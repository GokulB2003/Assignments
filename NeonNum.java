/*Write a java program to check whether number is neon or not.
Input : 9
Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.
*/
import java.util.*;
public class NeonNum{
public static void main(String args[])
{	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();//9
	int square=n*n;//81

	int sum=0;//0
	int rem=square%10;//1
	sum+=rem;//1
	square=square/10;//8
	rem=square%10;//8
	sum+=rem;//9
	String a= (sum==9) ? "Neon number" : "not neon number";
	System.out.println(a);
	
	
}
}
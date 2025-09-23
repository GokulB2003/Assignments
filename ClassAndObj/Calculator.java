/*2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/
import java.util.*;
class Arithmetic
{
	int add(int a,int b)
	{

		return a+b;
	}
	int sub(int a,int b)
	{
		return a-b;
	}
	int multi(int a,int b)
	{
		return a*b;
	}
	int div(int a,int b)
	{
		return (a/b);
	}
}
public class Calculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Arithmetic obj=new Arithmetic();
		
		System.out.println("Select the choice");
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.Div");
		int choice=sc.nextInt();
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of B");
		int b=sc.nextInt();
		int result=0;
		switch(choice)
		{
			case 1:
				result=obj.add(a,b);
				System.out.println(result);
				break;
			case 2:
				result=obj.sub(a,b);
				System.out.println(result);
				break;
			case 3:
				result=obj.multi(a,b);
				System.out.println(result);
				break;
			case 4:
				result=obj.div(a,b);
				System.out.println(result);
				break;
			default:
				System.out.println("wrong choice:");


		}
		
		
		
	}
}
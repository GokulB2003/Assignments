/*Q9. Create a Java program to simulate a simple calculator using a switch case. 
It should take two numbers and an operator (+, -, *, /, %) as input and perform 
the corresponding operation. 
 Explanation: 
 Use a switch on the operator to handle different arithmetic operations. Add  
default to handle invalid operators. */

import java.util.*;
public class Q9
{
	public static void main(String args[])
	{
		//using Scanner class of util package
		Scanner sc=new Scanner(System.in);
		
		//take operations which u want to perform
		System.out.println("Enter the opearator:");
		char ch=sc.next().charAt(0);
		
		//take numbers from user
		System.out.println("Enter the a");
		int a=sc.nextInt();
		
		System.out.println("Enter the b:");
		int b=sc.nextInt();
		
		switch(ch)
		{
			case '+':
				System.out.println((a+b));//for addition
				break;
			case '-':
				System.out.println((a-b));//for sub
				break;
			case '*':
				System.out.println((a*b));//for mul
				break;
			case '/':
				System.out.println((a/b));//for division
				break;
			case '%':
				System.out.println((a%b));//for modulo
				break;
			default:
				System.out.println("Enter valid choice");//for addition
				break;
		}


	}
}
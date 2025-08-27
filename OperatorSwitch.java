/*
Create a Java program to simulate a simple calculator using a switch case. It should take two numbers and an operator (+, -, *, /, %) as input and perform the corresponding operation.
Explanation:
 Use a switch on the operator to handle different arithmetic operations. Add default to handle invalid operators.
*/
import java.util.*;
public class OperatorSwitch{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a");
int a=sc.nextInt();
System.out.println("b");
int b=sc.nextInt();

System.out.println("Enter operator");
char ch=sc.next().charAt(0);

switch(ch)
{
case '+':
	System.out.println(a+b);
	break;
case '-':
	System.out.println(a-b);
	break;
case '*':
	System.out.println(a*b);
	break;
case '%':
	System.out.println(a%b);
	break;
case '/':
	System.out.println(a/b);
	break;
	
}
}
}
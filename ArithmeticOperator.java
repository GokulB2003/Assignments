import java.util.*;
public class ArithmeticOperator{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the value of a:");
int a=sc.nextInt();
System.out.print("Enter the value of B:");
int b=sc.nextInt();
//Addition
System.out.println("Adddition"+(a+b));
//subtraction
System.out.println("subtraction is"+(b-a));
//Multiplication
System.out.println("Multiplication is"+(a*b));

//mod operator
System.out.println("the remainder is"+(b%a));
//division
System.out.println("Division is"+(a/b));
//Ternary operator
int x=b>a ? 1 : 0;

}
}
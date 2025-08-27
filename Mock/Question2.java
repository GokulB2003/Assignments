/* Q2. Write a java program swap two number without using third variable.*/
import java.util.*;
public class Question2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1:");
		int a=sc.nextInt();
		System.out.println("Enter the num2:");
		int b=sc.nextInt();
		System.out.println("the numbers before swapping is:"+"num1:"+a+"num2:"+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("the numbers after swapping:"+"num1:"+a+"num2"+b);
		
	}
}
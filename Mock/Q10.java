/* Q10. Write a menu-driven program in java using switch case. 
            1. input any alphabet and check whether it is vowel or consonant. 
            2.Find the max number using 3 numbers. 
          3. input any number & check number is divisible by 5 & 11.*/

import java.util.*;
public class Q10
{
	public static void main(String args[])
	{
		//using Scanner class of util package
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the case to perform which operation:");
		System.out.println("1. input any alphabet and check whether it is vowel or consonant.");
		System.out.println("2.Find the max number using 3 numbers.");
		System.out.println(" 3. input any number & check number is divisible by 5 & 11");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("input alphabet");
				char ch=sc.next().charAt(0);
				if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') || (ch=='A') || (ch=='E') || (ch=='I') || 					(ch=='O')|| (ch=='U'))
				{
					System.out.println("vowel");
					break;
				}
				else
				{
					System.out.println("Consonent");
					break;
				}
			case 2:
				System.out.println("Enter a:");
				int a=sc.nextInt();
				System.out.println("Enter b:");
				int b=sc.nextInt();
				System.out.println("Enter c:");
				int c=sc.nextInt();
				if((a>b) &&(a>c))
				{
					System.out.println(a);
					break;
				}
				else if(b>a && b>c)
				{
					System.out.println(b);
					break;
				}
				else
				{
					System.out.println(c);
					break;
				}
			case 3:
				System.out.println("Enter n:");
				int p=sc.nextInt();
				if(((p%5)==0) && ((p%11)==0))
				{
					System.out.println("Divisible by 5&11");
					break;
				}
				else
				{
					System.out.println("Not Divisible");
					break;
				}

			default:
				 System.out.println("Enter the valid choice:");
				

		}


		
		
	}
}

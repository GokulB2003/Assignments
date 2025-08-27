/*Q28. Write a java program to find all roots of a quadratic equation using if else. How to find all roots of a quadratic equation using if else in java programming.
 
Example
Input a: 8 ,  b: -4 , c: -2
Output Root1: 0.80
Root2: -0.30
*/

import java.util.*;
public class Quadratic
{	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		//Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		double root=Math.sqrt((b*b)-(4*a*c));
		//for positive root
		double po=(-b+root)/(2*a);
		System.out.println(po);

		 double na=(-b-root)/(2*a);
		System.out.println(na);

	
		
		
		

	}
}
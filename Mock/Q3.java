/* Q3. Write a java program to enter two angles of a triangle and find the third angle.  */

import java.util.*;
public class Q3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//Take input from user as remaining angles

		int a=sc.nextInt();
		int b=sc.nextInt();

		//all three angles have sum=180
		
		int thirdAngle=180-(a+b);

		System.out.println("the third angle is:"+thirdAngle);
	}
}
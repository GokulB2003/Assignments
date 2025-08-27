//Write a java program to enter marks of five subjects and calculate total marks and percentage.
import java.util.*;
public class CalMarksScan{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of sub1");
	int sub1=sc.nextInt();
	System.out.println("Enter the value of Sub2");
	int sub2=sc.nextInt();
	System.out.println("Enter the value of Sub3");
	int sub3=sc.nextInt();
	System.out.println("Enter the value of Sub4");
	int sub4=sc.nextInt();
	System.out.println("Enter the value of Sub5");
	int sub5=sc.nextInt();	
	int total=(sub1+sub2+sub3+sub4+sub5);
	System.out.println("total addition is"+total);


}
}
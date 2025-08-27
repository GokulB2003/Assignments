import java.util.*;
public class PositiveZeo{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	String str=(n==0) ? "Zero":(n>0)? "positive" : "negative";
	System.out.println("The number is"+str);
}
}
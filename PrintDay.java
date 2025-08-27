//Q54.Given a number 1–7, print the day name.
import java.util.*;
public class PrintDay{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	String val=((n==1) ? "Sunday":(n==2) ? "Monday" :(n==3) ? "Tuesday" :(n==4) ? "wednesday" : (n==5) ? "thursday" : (n==6) ? "friday" : (n==7) ? "saturday" : "please Enter the value between the 1-7");
System.out.println(val);
}
}
//Write a Java program to check whether a year is a leap year or not
import java.util.*;
public class LeapOrNot{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the leap year");
int year=sc.nextInt();
if((year%4==0 && year%10!=0) || (year%400==0))
{
System.out.println("this is leap year");
}
else{
System.out.println("Not a leap Year");
}
}
}
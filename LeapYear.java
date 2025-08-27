/*. Write a Java program to check whether a year is leap year or not.
*/
import java.util.*;
public class LeapYear{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the year");
int year=sc.nextInt();
String str=((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "leap year" : "not leap year";//2100 1900
System.out.println(str);


}
}
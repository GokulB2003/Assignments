// Write a Java program to check whether character is alphabetic or not
import java.util.*;
public class CheckAlpha{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character:");
char ch=sc.next().charAt(0);
String str=((ch>='a'&& ch<='z') ||(ch>='A' && ch<='Z')) ? "alphabetic" : ((ch=='@') || (ch=='#') ) ? "Special character" : "digit";
System.out.println(str);
}
}
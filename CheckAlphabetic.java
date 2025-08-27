//Write a Java program to check whether a character is alphabetic or not.
import java.util.*;
public class CheckAlphabetic{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character:");
char ch=sc.next().charAt(0);
if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z'))
{
System.out.println("this is a character");
} 
else{
System.out.println("this is not a character");
}

}
}
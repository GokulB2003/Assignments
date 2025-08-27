//Write a Java program to check whether a number is divisible by 5 and 11 or not.
import java.util.*;
public class Divisible{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of the n:");
int n=sc.nextInt();
if((n%5==0) && (n%11==0))
{
System.out.println("Divisible by both 5 and 11:");

}
else{
System.out.println("not divisible");

}

}
}
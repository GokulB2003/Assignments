//Write a Java program to check whether a triangle is valid or not.
import java.util.*;
public class ValidTriangle{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the angle1:");
int a=sc.nextInt();
System.out.println("Enter the angle2:");
int b=sc.nextInt();
System.out.println("Enter the angle3:");
int c=sc.nextInt();
int sum=a+b+c;
if(sum==180)
{
System.out.println("this is a triangle");
}
else{
System.out.println("Not a triangle");
}
}

}
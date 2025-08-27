//Write a java program to find maximum between three numbers.
// Write a java program to find the maximum between two numbers.

import java.util.*;
public class MaxiInThree{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a:");
int a=sc.nextInt();
System.out.println("Enter the value of b:");
int b=sc.nextInt();
System.out.println("Enter the value of b:");
int c=sc.nextInt();
String maxi=(a>b && a>c) ? "a is grater" :(b>a && b>c) ? "b" : "c is greater";
System.out.println(maxi); 

}
}
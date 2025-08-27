//Q45. Write a java program to find the minimum between two numbers. 
//Q46. Write a java program to find a minimum between three numbers

import java.util.*;
public class MinBetThree{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a:");
int a=sc.nextInt();
System.out.println("Enter the value of b:");
int b=sc.nextInt();
System.out.println("Enter the value of b:");
int c=sc.nextInt();
String mini=((a==b)&& (a>c))? "a and b greater than c":((b==c && b>a))? "b and c is grater than a" :((a==b)&&(a==c)) ? "All are same" :"";
System.out.println(mini); 

}
}
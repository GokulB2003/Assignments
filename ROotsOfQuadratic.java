/*Write a java program to find all roots of a quadratic equation using if else. How to find all roots of a quadratic equation using if else in java programming.
Example
Input a: 8 ,  b: -4 , c: -2
Output Root1: 0.80
Root2: -0.30
*/
import java.util.*;
public class ROotsOfQuadratic{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int dis=(b*b)-(4*a*c);
if(dis>0)
{
double root1=(-b+Math.sqrt(dis)/2);
System.out.println(root1);
double root2=(b-Math.sqrt(dis)/2);
System.out.println(root2);

}
else if(dis==0)
{
double root1=(-b)/(2*a);
System.out.println(root1);
}
else{
double root1=(-dis)/(2*a);
System.out.println(root1);

}
}
}


// Write a java program to find a maximum between three numbers.
import java.util.*;
public class MiniBetThree{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numner: A");
int a=sc.nextInt();
System.out.println("Enter the number :B");
int b=sc.nextInt();
System.out.println("Enter the number :C");
int c=sc.nextInt();
if(a<b && a<c)
{
System.out.println("a min");

}
else if(b<a && b<c)
{
System.out.println("b is min");
}
else{
System.out.println("min is c");
}


}
}
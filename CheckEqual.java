//Write a java program to accept two integers and check whether they are equal or not.
import java.util.*;
public class CheckEqual
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the integer");
int a=sc.nextInt();
System.out.println("Enter the integer");
int b=sc.nextInt();
if(a==b)
{
System.out.println("Equal");
}
else{
System.out.println("Not Equal");

}
}
}
//Write a Java program to check whether a number is positive , negative or zero.
import java.util.*;
public class PositiveNeg{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of the n");
int n=sc.nextInt();
/*if(n==0)
{
System.out.println("Zero");

}
else if(n>0)
{
System.out.println("psitive");
}
else{
System.out.println("negative");
}*/
String str=(n==0)?"Zero":(n>0)?"Positive":"negative";
System.out.println(str);
}
}
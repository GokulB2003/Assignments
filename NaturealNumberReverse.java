//Write a C program to print all natural numbers in reverse (from n to 1). - using while loop
import java.util.*;
public class NaturealNumberReverse{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the vlue of n:");
int n=sc.nextInt();
while(n>=1)
{
System.out.println(n);
n--;

}
}
}
//Q11. Write a java program to calculate the sum of digits of a number.
import java.util.*;
public class SumOfDigit{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
while(n!=0)
{
int rem=n%10;
sum+=rem;
n=n/10;

}
System.out.println(sum);
}
}

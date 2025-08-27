//Q18. Write a java program to find the first and last digit of a number.
import java.util.*;
public class FirstLast{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int last=n%10;
int rem=0;
while(n)
{
rem=n%10;
n=n/10;
}
System.out.println("last n:"+last)
System.out.println("first"+rem);
}
}
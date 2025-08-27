//Write a C program to find the sum of all odd numbers between 1 to n.

import java.util.*;
public class AllOddNumber{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the vlue of n:");
int n=sc.nextInt();
int i=1;
while(i<=n)
{
if(i%2!=0)
{
System.out.println("the odd numbers between this is:"+i);
}
i++;

}
}
}

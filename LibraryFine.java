/*
Calculate fine for library book return:
Input: Number of days late
Logic:
Up to 5 days → ₹2/day
6–10 days → ₹3/day
11–30 days → ₹5/day
More than 30 days → Membership canceled + ₹500 fine
Output: Total fine + membership status.

*/
import java.util.*;
public class LibraryFine{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no. of days late");
int n=sc.nextInt();
if(n>0 && n<=5)
{
int fine=n*2;
System.out.println("total fine needs to paid:"+fine);
}
else if(n>5 && n<=10)
{
int fine=n*3;
System.out.println("total fine needs to paid:"+fine);
}
else if(n>10 && n<=30)
{
int fine=n*5;
System.out.println("total fine needs to paid:"+fine);
}

else
{
//Membership canceled + ₹500 fine
System.out.println("Membership canceled +₹500 fine");
}
}
}
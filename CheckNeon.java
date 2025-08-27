/*Q26. Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.*/
import java.util.*;
public class CheckNeon{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp=n;
int square=n*n;
int sum=0;

while(square!=0)
{
int rem=square%10;
//n=rem*rem;
sum+=rem;
square=square/10;
}
if(sum==temp){
System.out.println("Neon Number");
}
else{
System.out.printf("Not Neon Number");
}
}
}

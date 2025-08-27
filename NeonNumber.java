/*
Write a java program to check whether a number is neon or not.      	
        	Input : 9
        	Output : Neon Number
        	Explanation: square is 9*9 = 81 and
        	The sum of the digits of the square is 9. 
*/
import java.util.*;
public class NeonNumber{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();

int original=n;//n
int square=n*n;//64
int rem=square%10;//4
int a=rem;//4
square=square/10;//6
rem=square%10;//6
int b=rem;//6
square=square/10;//0
int sum=a+b;//10
if(original==sum)
{
System.out.println("Neon number");
}
else{
System.out.println("Not a neon number");
}
}
}
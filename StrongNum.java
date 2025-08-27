/*Q24. Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,
*/
import java.util.*;
public class StrongNum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int temp=n;
while(n!=0)
{
	int rem=n%10;
int fact=1;
	while(rem!=0)
{
	fact=fact*rem;
	rem--;

}
sum+=fact;
n=n/10;
}
String str=(sum==temp) ? "Strong Number" :"Not Strong Number";
System.out.println(str);
}
}
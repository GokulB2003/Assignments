/*Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.
*/
import java.util.*;
public class DuckNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
boolean flag=false;
while(n!=0)
{
	int rem=n%10;
	if(rem==0)
{
//System.out.println("Duck number");
 flag=true;
break;
}

n=n/10;
}
if(flag==true)
{System.out.println("Duck Number");
}
else{
System.out.println("Not Duck Number");
}
}
}
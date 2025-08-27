//Q25. Write a java program to Check Number Is Armstrong Number or Not.
/*Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.*/

import java.util.*;
public class ArmStrongg{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();//153

int temp=n;//153
int count=0;

while(n!=0){
int rem=n%10;//351
count++;//123
n=n/10;
}

//System.out.println(count);
int i=count;//3
n=temp;//153
int sum=1;//0
int s=0;

while(n!=0)//1
{
int rem=n%10;//3 5 1
i=count;//3
sum=1;
while(i>0)//3 2 1
{
	sum=sum*rem;//3 9 27 1  1 1
	i--;//2 1 0
	
}
//System.out.println("Sum is:"+sum);
s+=sum;;//27+125+1
n=n/10;

}
System.out.println(s);
String ans=(s==temp)?"ArmStromg":"Not ArmStrong";
System.out.println(ans);

}
}
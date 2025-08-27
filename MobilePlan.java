/*
Mobile plan billing system:
Input: Minutes used in a month
Logic:
Up to 100 mins → Base ₹199
101–300 mins → ₹199 + ₹1/min for extra
301–500 mins → ₹199 + ₹1.5/min for extra
Above 500 mins → ₹199 + ₹2/min for extra
Output: Total monthly bill.

*/
import java.util.*;
public class MobilePlan{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Minutes used in Month");
int min=sc.nextInt();
if(min>0 && min<=100)
{
System.out.println("paid RS:"+100);
}
else if(min>100 && min<300)
{
	min=min-100;
int a=(min*1)+199;
System.out.println("paid"+a);
}
else if(min>300 && min<500)
{
	min=min-100;
	double a=(min*1.5)+199;
	System.out.println("paid"+a);
}
else{
min=min-100;
	int a=(min*2)+199;
	System.out.println("paid"+a);
}


}
}

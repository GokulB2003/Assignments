/*Calculate commission based on sales amount:
Input: Sales amount
Logic:
Sales < 5000 → 2% commission
Sales 5000–10000 → 5% commission
Sales > 10000 → 10% commission
Output: Display commission amount.
*/

import java.util.*;
public class CalCommission{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Sales amount:");
int sales=sc.nextInt();
if(sales<5000)
{
	double comission=(sales*2)/100;
	double total=comission+sales;
System.out.println("total sales amount with:"+total);
}
else if(sales>5000 && sales<=10000)
{
double comission=(sales*5)/100;
	double total=comission+sales;
System.out.println("total sales amount with:"+total);

}
else
{
double comission=(sales*10)/100;
	double total=comission+sales;
System.out.println("total sales amount with:"+total);

}


}
}

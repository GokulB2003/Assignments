/* Write a java program to input electricity unit charges & calculate total electricity bill according to the given condition
                	For first 50 units Rs. 0.50/unit
                	For next 100 units Rs. 0.75/unit
                	For next 150 units Rs. 1.20/unit
                	For unit above 250 Rs. 1.50/unit
 An additional surcharge of 20% is added to the bill.
*/
import java.util.Scanner;
public class ElectricityBill{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("input electricity unit");
int unit=sc.nextInt();
double surcharge=0;
if(unit<50)
{
double total=unit*0.50;
surcharge=(double)(total*20)/100.0;
total=total+(int)surcharge;
System.out.println("For first 50 units"+total);
}
else if(unit>50 && unit<=100)
{
double total=unit*0.75;
surcharge=(total*20)/100.0;
total=total+(int)surcharge;
System.out.println("For first 100 units"+total);
}
else if(unit>100 && unit<=150)
{
double total=unit*1.20;
surcharge=(total*20)/100.0;
total=total+(int)surcharge;
System.out.println("For first 100 units"+total);
}
else 
{
double total=unit*1.50;
surcharge=(total*20)/100.0;
total=total+(int)surcharge;
System.out.println("For first 100 units"+total);
}



}
}
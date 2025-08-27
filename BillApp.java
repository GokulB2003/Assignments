import java.util.*;
public class BillApp{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the prize");
int price=sc.nextInt();

System.out.println("Enter the amount of discount");
int discount=sc.nextInt();

double caldiscount=price * (discount/100.0);
double totalprice=price-caldiscount;//95

System.out.println("Enter the tax amount:");
int tax=sc.nextInt();

double totalTax=totalprice* (tax/100.0);//
double p=totalTax+totalprice;
System.out.println("total amount you need to pay with discount and price"+p);




}
}
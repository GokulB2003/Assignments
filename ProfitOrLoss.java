//Write a Java program to input cost price and selling price of a product and check profit or loss.
import java.util.*;
public class ProfitOrLoss{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the cost Price:");
int costPrice=sc.nextInt();
System.out.println("Enter the selling price:");
int SellingPrice=sc.nextInt();

int price=SellingPrice-costPrice;
String P=(SellingPrice>costPrice) ? "profit" :"Loss";
System.out.println("Either profit or loss"+P+":"+price);
}
}
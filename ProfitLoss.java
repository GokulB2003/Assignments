//Write a Java program to input cost price and selling price of a product and check profit or loss.
import java.util.*;
public class ProfitLoss{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the cost price of the product:");
	int costPrice=sc.nextInt();
	System.out.println("Enter the selling price of the product ");
	int SellingPrice=sc.nextInt();
	int profit=SellingPrice-costPrice;
	if(SellingPrice>costPrice)
{
System.out.println("the profit is"+profit);
}
else{
System.out.println("the loss is"+profit);
}
	
}
}
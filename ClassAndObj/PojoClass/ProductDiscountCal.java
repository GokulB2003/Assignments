/*9. Product Discount Calculation
Task:
 Create a Product class with fields: name, price, and discountPercentage.
 In the main method:
Create a Product object.
Calculate the discounted price and print the result.
Explanation:
 This teaches applying percentages and using object fields.
*/
import java.util.*;
class Product
{
	private String name;
	private int price;
	private double disPer;
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(int p)
	{
		price=p;
	}
	public int getPrice()
	{
		return price;
	}
	public void setDisPer(int p)
	{
		disPer=p;
	}
	public double getDisPer()
	{
		return disPer;
	}

}
class CalDiscount
{
	Product p[];
	public void set(Product[] p)
	{
		this.p=p;
	}
	public void calDiscount()
	{	double total=0.0;
		for(int i=0; i<p.length; i++)
		{
			total=(p[i].getPrice()*p[i].getDisPer())/100;
			System.out.println("Price of"+p[i].getName()+" "+(p[i].getPrice()-total));
			
		}
	}
	
}
public class ProductDiscountCal
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of Products");
		int n=sc.nextInt();
		Product[] p=new Product[n];
		for(int i=0; i<p.length; i++)
		{
			p[i]=new Product();
			System.out.println("ENter the Name of the product:");
			String name=sc.next();
			p[i].setName(name);
			System.out.println("Enter the Price of poduct:"+p[i].getName());
			int price=sc.nextInt();
			p[i].setPrice(price);
			System.out.println("Enter the Amount of discount in %");
			p[i].setDisPer(sc.nextInt());
			
		}
		CalDiscount obj=new CalDiscount();
		obj.set(p);
		obj.calDiscount();
		
	}
}
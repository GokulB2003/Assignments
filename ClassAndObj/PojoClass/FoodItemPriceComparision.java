/*6. Food Item Price Comparison
Task:
 Create a FoodItem class with fields: name and price.
 In the main method:
Create two FoodItem objects.
Compare their prices and print the name of the cheaper food item.
Explanation:
 This helps understand comparison logic with custom objects.
*/
import java.util.*;
class FoodItem
{
	private String name;
	private int price;
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
	
}
public class FoodItemPriceComparision
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		FoodItem[] f=new FoodItem[n];
		for(int i=0; i<f.length; i++)
		{
			f[i]=new FoodItem();
			System.out.println("Enter the name of the Item:");
			String name=sc.next();
			f[i].setName(name);
			System.out.println("Enter the price of the Item");
			int price=sc.nextInt();
			f[i].setPrice(price);
		}
		int m= Integer.MAX_VALUE;
		int i=0;
		String cheapName=" ";
		while(i<f.length)
		{
			if(f[i].getPrice()<m)
			{
				m=f[i].getPrice();
				cheapName=f[i].getName();
			}
			i++;
		}
		System.out.println("the chepeast Name is the"+cheapName);
		
	}
}
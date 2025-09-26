/*1. Library Book Management
Task:
 Create a Book class with fields: title, author, and price.
 In the main method:
Create two individual Book objects.
Compare the prices of the two books and print the title of the more expensive book.
Explanation:
 This task teaches object instantiation and accessing instance variables directly to perform comparisons.
*/
import java.util.*;
class Book
{
	private String title;
	private String author;
	private int price;
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setAuthor(String a)
	{
		this.author=a;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setPrice(int p)
	{
		this.price=p;
	}
	public int getPrice()
	{
		return price;
	}
}

public class LibraryBookManagement
{
	public static void main(String args[])
	{
		Book obj1=new Book();
		obj1.setTitle("C++");
		obj1.setAuthor("E-BalguruSwami");
		obj1.setPrice(120);
		
		int a=obj1.getPrice();

		Book obj2=new Book();
		obj2.setTitle("C");
		obj2.setAuthor("Denis Richi");
		obj2.setPrice(190);

		int b=obj2.getPrice();
		if(a>b)
		{
			System.out.println(obj1.getTitle());
		}
		else
		{
			System.out.println(obj2.getTitle());
		}			
	}
}
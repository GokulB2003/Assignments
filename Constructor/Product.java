package org.Constructor;
import java.util.*;
/*Q4. Problem:
 Create a class Product with fields id, name, and price.
 Implement:
A parameterized constructor to initialize product details.


A copy constructor to copy data from another object.
Display both objects to confirm the copy works.
Hint:
 Use Product(Product p) to copy fields.
Explanation:
 This question checks understanding of how to duplicate object data using a copy constructor.
*/
class Product {
	int id;
	String name;
	int price;
	Product(int id,String name,int p)
	{
		this.id=id;
		this.name=name;
		this.price=p;
	}
	Product(Product p)
	{
			this.id=p.id;
			this.name=p.name;
			this.price=p.price;
	}
	public void displaydata()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		
	}
	
}

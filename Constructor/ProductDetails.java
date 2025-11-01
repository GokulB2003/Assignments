package org.Constructor;
import java.util.*;


public class ProductDetails {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		System.out.println("Enter the Price:");
		int p=sc.nextInt();
		Product obj=new Product(id,name,p);
		Product abc=new Product(obj);
		obj.displaydata();
		
		
	}
}

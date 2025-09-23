/*
**2. Menu-Driven Calculator**

**Description:**

* Display a menu with 4 operations: Add, Subtract, Multiply, Divide.
* Use a do-while loop to keep showing the menu until the user chooses "Exit".
* Use **continue** to skip calculation if the user enters an invalid choice.
* If the user enters "Exit", **break** the loop.

---
*/

import java.util.*;
public class MenuDriven
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the Menu");
		
		int choose;
		
		do
		{
			
		System.out.println("Choose the Menu");
		System.out.println("0:EXIT");
		System.out.println("1:Addition");
		System.out.println("2:Sub");
		System.out.println("3:Mul");
		System.out.println("4:Div");
		choose=sc.nextInt();
		switch(choose)
		{
			case 1:
				System.out.println("Enter the value of A:");
				int a=sc.nextInt();
				System.out.println("Enter the value of B");
				int b=sc.nextInt();
				System.out.println("Addition is:"+(a+b));
				break;
			case 2:
				
				System.out.println("Enter the value of A:");
				a=sc.nextInt();
				System.out.println("Enter the value of B");
				b=sc.nextInt();
				System.out.println("sub is:"+(a-b));
				break;
			case 3:
				
				System.out.println("Enter the value of A:");
				 a=sc.nextInt();
				System.out.println("Enter the value of B");
				b=sc.nextInt();
				System.out.println("Mul is:"+(a*b));
				break;
			case 4:
				
				System.out.println("Enter the value of A:");
				a=sc.nextInt();
				System.out.println("Enter the value of B");
				 b=sc.nextInt();
				System.out.println("Div is:"+(a/b));
				break;
			default:
				if(choose!=0){
				System.out.println("Enter vaid input");
				continue;
				}

				
						
		}
		}
		while(choose!=0);
	}
}
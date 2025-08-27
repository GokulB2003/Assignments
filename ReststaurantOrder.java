/*
 **9. Restaurant Ordering System**

**Description:**

* Show menu items and let user order.
* If they choose "skip", **continue** to next iteration without adding to order.
* If "done" is entered, **break** and print final bill.
* Implement using a do-while loop.

---
*/
import java.util.*;
public class ReststaurantOrder
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("********************************************");
		System.out.println("****Welcome To Hotel Tiranga****");
		System.out.println("Items Menu:");
		System.out.println("1.vadapav: Rs 10");
		System.out.println("2.MisaLPav :Rs 90");
		System.out.println("3.Coffee: Rs 25");
		System.out.println("4.Tea: RS 12");
		System.out.println("5.Chikan Thali : RS 250");
		System.out.println("6.Enter 'skip'");
		System.out.println("7.done-final Bill");
		String choose;
		int total_bill=0,qty=0;
		do
		{
			System.out.println("select the choice ");
			choose=sc.next();
			switch(choose)
			{
				case "1":
					System.out.println("Enter the Quantity of vadapav:");
					qty=sc.nextInt();
					total_bill+=(10*qty);
					break;
				case "2":
					System.out.println("Enter the Quantity of MisaLPav:");
					qty=sc.nextInt();
					total_bill+=(90*qty);
					break;
				case "3":
					System.out.println("Enter the Quantity of Coffee:");
					qty=sc.nextInt();
					total_bill+=(25*qty);
					break;
				case "4":
					System.out.println("Enter the Quantity of Tea:");
					qty=sc.nextInt();
					total_bill+=(12*qty);
					break;
				case "5":
					System.out.println("Enter the Quantity of Chikan Thali:");
					qty=sc.nextInt();
					total_bill+=(250*qty);
					break;
				case "skip":
					continue;
				case "done":
					System.out.println("Final Bill:"+total_bill);
					break;
				default:
					System.out.println("Enter the valid choice:");

					
			}
			
		}while(!choose.equals("done"));
	

		
		
		
	}
}

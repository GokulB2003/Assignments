/*
**5. E-commerce Checkout Simulation**

**Description:**

* Display a list of items with prices.
* Use a do-while loop to let the user keep adding items to the cart until they type "checkout".
* If they type "skip", use **continue** to skip adding that item.
* On checkout, print the total and exit the loop.

---
*/
import java.util.*;
public class E_Commerce
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int total=0;
		//System.out.println("How many Items User want:");
		//int n=sc.nextInt();

		System.out.println("Welcome to the E-Commerce Checkout!");
        	System.out.println("Items available:");
       		System.out.println("1. Item1 - Rs 100");
       		System.out.println("2. Item2 - Rs 200");
        	System.out.println("3. Item3 - Rs 300");
        	System.out.println("4. Item4 - Rs 400");
        	System.out.println("Type skip to skip adding an item checkout to finish\n");
		String str="checkout";
		String guess;
		do
		{	
			
				//System.out.println("Enter the Item");
				//String Item1=sc.next();
				//String Item2=sc.next();
				//String Item3=sc.next();
				//String Item4=sc.next();

			System.out.println("Enter the Item user guess");
			guess=sc.next();
			
			switch(guess)
			{
				case "1":
					total+=100;
					break;
				case "2":
					total+=200;
					break;
				case "3":
					total+=300;
					break;
				case "4":
					total+=400;
					break;
				case "skip":
					   continue;
				case "checkout":
						System.out.println("total RS is"+total);
						break;
				 default:
                    			System.out.println("Invalid choice please try again");
			}
		
			
					
			
		}
		while(!guess.equalsIgnoreCase(str));
			
	}
}
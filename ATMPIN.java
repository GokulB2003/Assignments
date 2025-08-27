/**1. ATM PIN Validation**

**Description:**
Write a program that:

* Asks the user for a 4-digit ATM PIN.
* Gives **max 3 attempts** to enter the correct PIN using a do-while loop.
* If the PIN is correct, print "Access Granted" and **break** the loop.
* If attempts are over, print "Card Blocked".
*/
import java.util.*;
public class ATMPIN
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int originalPin=1234;
		int i=1;
		do
		{
			System.out.println("Enter the Pin");	
			int Pin=sc.nextInt();
			if(Pin==originalPin)
			{
				System.out.println("Grant Access");
				break;
			}
			i++;	
		}
		while(i<=3);
		/*{
			
		}*/
		if(i>3){
		System.out.println("Card Block ");
		}
		
		
	}
}
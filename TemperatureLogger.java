/*
**6. Temperature Logger**

**Description:**

* Ask the user to enter daily temperatures.
* Use **continue** if the entered temperature is negative (invalid reading).
* Use **break** if the user enters "stop".
* Keep looping with do-while until break condition.

---
*/
import java.util.*;
public class TemperatureLogger
{
   public static void main(String args[])
  {
		Scanner sc=new Scanner(System.in);
		System.out.println("*********************************************");
		
		int choice;
		
	do
	{
		
		System.out.println("Enter the choice:");
		System.out.println("1.Enter temp");
		System.out.println("2.Stop");
		choice=sc.nextInt();

		switch(choice)
		{
			case 1:
			System.out.println("Enter the temp:");
			int temp=sc.nextInt();
			if(temp<0)
			{	System.out.println("please enter the temp positive");
				continue;
			}
			else
			{
			System.out.println("todays temp:"+temp);
			break;
			}
			case 2:
				System.out.println("Stop");
				break;
								
			default:
			System.out.println("Enter the proper choice");
			
		}
	}while(choice!=2);
			
   }
}
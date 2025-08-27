 /*Q6. Calculate commission based on sales amount: 
• Input: Sales amount 
• Logic: 
o Sales < 5000 → 2% commission 
o Sales 5000–10000 → 5% commission 
o Sales > 10000 → 10% commission 
• Output: Display commission amount. 
*/

import java.util.*;
public class Q6
{
	public static void main(String args[])
	{
		//using Scanner class of util package
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the sales amount:");		//Enter sales Amnt
		int Sales=sc.nextInt();
		
		double cmn=0;
		if(Sales>0 && Sales<5000)				//Sales < 5000 → 2% commission 
		{
			//add two % commission
			cmn=(Sales*2)/100;
			System.out.println("Commision Amnt is:"+cmn);
			
		}
		else if(Sales>=5000 && Sales<=10000)			//Sales 5000–10000 → 5% commission 
		{
			//add  5% commission
			cmn=(Sales*5)/100;
			System.out.println("Commision Amnt is:"+cmn);
			
		}
		else if(Sales>10000)					//Sales > 10000 → 10% commission 
		{
			//add two % commission
			cmn=(Sales*10)/100;
			System.out.println("Commision Amnt is:"+cmn);
			
		}


	
	}
}
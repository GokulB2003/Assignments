/*
 Write a menu-driven program using do-while and switch-case to perform operations on  a bank account balance (initial balance entered by user):
Deposit money.
Withdraw money (only if sufficient balance).
Check current balance.
Exit.
Program should repeatedly allow operations until exit.

*/
import java.util.*;
public class BankAccountB
{
	public static void main(String args[])
	{	System.out.println("******Bank Of Maharashtra*******");
		System.out.println("Select the choice");
		Scanner sc=new Scanner(System.in);
		int choice,balance=0;
		do
		{
			System.out.println("1.Deposit Money");
			System.out.println("2.Withdraw Money");
			System.out.println("3.check Balance");
			System.out.println("4.Exit");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter the amount to deposit:");
					int deposit=sc.nextInt();
					balance+=deposit;
					break;
					continue;
				case 2:
					System.out.println("Enter the amount to withdraw:");
					int w=sc.nextInt();
					if(w<balance)
					{
						balance-=w;
					}
					break;
				case 3:
					System.out.println("Balance:"+balance);
					break;
				case 4:
					System.out.println("Exit");
					break;
				default:
					System.out.println("Entr the valid choice:");
			
			}
			
			
			
			
			
		}
		while(choice!=4);
		
	}
}
/*10. Bank Account Balance Update
Task:
 Create a BankAccount class with fields: accountHolderName and balance.
 In the main method:
Create a BankAccount object.
Deposit an amount into the account and print the updated balance.
Explanation:
 This introduces updating object fields and performing logical operations.
*/
import java.util.*;
class BankAccount
{
	private String ActHolderName;
	private int balance;
	private int ABC;
	public void setName(String n)
	{
		this.ActHolderName=n;
	}
	public String getACtHolderName()
	{
		return ActHolderName;
	}
	public void setInitialBalance(int b)
	{
		this.ABC=b;
	}
	public int getInitBalance()
	{
		return ABC;
	}
	public void setBalance(int b)
	{
		balance=b;
	}
	public int getBalance()
	{
		return balance;
	}
}
class AccntUpdate
{
	BankAccount b[];
	public void set(BankAccount[] b)
	{	
		this.b=b;
	}
	public void updateBal()
	{
		for(int i=0; i<b.length; i++)
		{
			int total=b[i].getBalance()+b[i].getInitBalance();
			System.out.println(b[i].getACtHolderName()+" "+total);
		}
	}
	
}
public class BankBalanceUpdate
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of Bank Account No u want to Update:");
		int n=sc.nextInt();
		BankAccount b[]=new BankAccount[n];
		for(int i=0; i<b.length; i++)
		{	b[i]=new BankAccount();
			System.out.println("Enter the AccoundHolder name:");
			b[i].setName(sc.next());
			
			System.out.println("Enter the Initial Amnt in Acnt");
			b[i].setInitialBalance(sc.nextInt());
			System.out.println("Enter the Amount in Account ");
			b[i].setBalance(sc.nextInt());
			
			
		}
		AccntUpdate obj=new AccntUpdate();
		obj.set(b);
		obj.updateBal();
		
	}
}
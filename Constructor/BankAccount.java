package org.Constructor;
import java.util.*;

/* Create a class BankAccount with fields:
 accNo, accHolder, balance.
 Use:
A default constructor to set balance = 1000


A parameterized constructor to initialize all fields


A method deposit() to add money


A method display() to show details.


Hint: Use constructor overloading for default and parameterized constructors.
Explanation:
 This question tests constructor overloading — how multiple constructors can initialize objects differently.*/

 class BankAccount {
	
	static int accNo;
	static String accHolder;
	static int balance;
	BankAccount()
	{
		this.balance=1000;
		
	}
	BankAccount(int accNo,String accHolder,int newdeposit)
	{
		this.accNo=accNo;
		this.accHolder=accHolder;
		this.balance=newdeposit;

	}
	public static void deposit(int amnt)
	{
		balance+=amnt;
		display();
	
	}
	public static void display()
	{
		System.out.println("Accnt no:"+accNo);
		System.out.println("Account Holder name:"+accHolder);
		System.out.println("total balance in the account is:"+balance);
		
	}
	
}

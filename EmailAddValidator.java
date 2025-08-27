/*
**8. Email Address Validator**

**Description:**

* Ask the user for an email address.
* If email doesn’t contain '@', **continue** to ask again.
* If user enters "cancel", **break**.
* Use a do-while loop to validate and accept only proper emails.

---
*/

import java.util.*;
public class EmailAddValidator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Email");
		//String str=sc.nextLine();
		int choice;
		do
		{	
			System.out.println("select the choice");
			System.out.println("1:Enter the mail");
			System.out.println("2:Cancel");	
			choice=sc.nextInt();
			String str=" ";
			sc.nextLine();	
			boolean flag=true;
			switch(choice)
			{
				//boolean flag=true;
				case 1 :
				        System.out.println("Enter the mail");
					str=sc.nextLine();

					for(int i=0; i<str.length(); i++)
					{
						if(str.charAt(i)!='@')
						{
							 flag=false;

							continue;
						}
						else
						{
							if(str.endsWith(".com")){
							
							flag=true;

							break;
							}
						}
				
				
					}
					break;

				case 2 :
					System.out.println("Cancel");
					flag=false;
					break;
				default:
					System.out.println("Enter the valid choice:");

			}
			if(flag)
			{
				System.out.println("Mail Accepted");
				break;

			}
			else
			{
				System.out.println("Invalid mail");
				
			}
			
			
	      }while(choice !=2);
	}
}
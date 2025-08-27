/***3. Password Strength Checker**

**Description:**

* Ask the user to enter a password in a do-while loop.
* If the password length is less than 6 characters, display a message and **continue** to re-ask.
* If the password is "quit", stop asking (**break**).
* Otherwise, print "Password accepted" and exit.
---
*/
import java.util.*;
public class PasswordStrength
{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String str;
	do
	{
		System.out.println("Enter the String");
		str=sc.next();
		if(str.equals("quite"))
		{
			break;
		}
		else{
		if(str.length()<6)
		{
			System.out.println("Password length is less than 6:");
			continue;
		}		
		else
		{
			System.out.println("password Accepted");
			break;
		}	
		}
	}
	while(str.length() !=6);
}
}

//Write a program to find first and last digit of a number without using loop in three digit.
public class FirstLastDigit{
public static void main(String args[])
{
	System.out.println("Enter the number");
	int n=Integer.parseInt(args[0]);
	int rem=n%10;
	System.out.println("the last digit is:"+rem);
	n=n/10;
	int secondlast=n%10;
	n=n/10;
	int firstDigit=n%10;
	System.out.println("the first digit is:"+firstDigit);
	
		
	
}
}
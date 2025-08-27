/*Q3.Write a menu-driven program using switch and do-while to perform operations on a single character:
Check if the character is an alphabet.
If alphabet, check vowel or consonant.
If digit, check even or odd.
Convert uppercase to lowercase or vice versa.
Exit the program
*/
import java.util.*;
public class OperationsOnSingleChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the character:");
		char ch =sc.next().charAt(0);
		int choice;
		do
		{
			System.out.println("1.Check if the character is an alphabet. ");
			System.out.println("2.Check if the character check vowel or consonant ");
			System.out.println("3.Check if the check even or odd.");
			System.out.println("4.Convert uppercase to lowercase or vice versa.");
			System.out.println("5.Exit.");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					if(Character.isAlphabetic(ch))
					{
						System.out.println("Character is Alphabet");
					}
					else
					{
						System.out.println("Character is not Alphabet");
					}
					break;
				case 2:
					if(Character.isAlphabetic(ch))
					{
						char p=Character.toLowerCase(ch);
						if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u')
						{
							System.out.println("Vowel");
						}
						else
						{
							System.out.println("Consonent");
						}
					}
					break;
				case 3:
					if(Character.isDigit(ch))
					{
					int n=ch-'0';
					if(n%2==0)
					{
						System.out.println("Even Number");
					}
					else
					{
						System.out.println("Odd number");
					}
					}
					else
					{
						System.out.println("not a DIgit");
					}
					break;
				case 4:
					if(Character.isAlphabetic(ch))
					{
					if((ch>='A' && ch <='Z'))
					{
						System.out.println(Character.toLowerCase(ch));
					}
					else
					{
						System.out.println(Character.toUpperCase(ch));
					}
					}
					break;
				case 5:
					System.out.println("Exiting program...");
					System.exit(0);
					break;
				default:
					System.out.println("Enter the valid choice");

					
			}
							
		}while(choice !=5);
	}
}
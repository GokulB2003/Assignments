/*Q45. Write a Java program to check whether a given number is a Disarium number or not, and display all Disarium numbers up to n.
 A Disarium number is a number whose sum of its digits powered with their respective positions is equal to the number itself.
 Example: 135 is a Disarium number because 1¹ + 3² + 5³ = 1 + 9 + 125 = 135.
Explanation:
 Use a loop to count digits. Use another loop to extract each digit and calculate the digit raised to its position power using only loops (no Math.pow()). Check if the sum equals the original number.
*/
import java.util.*;
public class Disarium
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int j=1;
	while(j<n){
		int p=j;
		int sum=0;
		int count=0;

		while(p!=0)
		{
			count++;
			p=p/10;
		}
		p=j;
		//while(count!=0)
		//{	//sum=0;
			
			while(p!=0 && count!=0)
			{   int rem=0;
				rem=p%10;
				int pow=1,i=0;

				while(i<count)
				{
					pow=pow*rem;
					i++;
				}	
				sum+=pow;
				p=p/10;
				count--;
			}
		//count--;
		//}
		if(sum==j)
		{
			System.out.println(j);
		}
		j++;
		
	
		}	
	}
}
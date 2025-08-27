/*6. Count Number of Even and Odd Elements
 Problem:
Count how many even and odd elements are present.
Example:
Input: [1, 2, 3, 4, 5, 6]  
Output: Even: 3, Odd: 3
*/
import java.util.*;
public class EvenAndOddCount
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,4,5,6};
		int Even=0,Odd=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				Even++;
			}
			else
			{
				Odd++;
			}
		}
		System.out.print("Even"+Even+","+"Odd"+Odd);
	}
}
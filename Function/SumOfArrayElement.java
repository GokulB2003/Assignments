/*Q2. Calculate Sum of Array Elements
Class: ArraySum
Functions:
void inputArray(int arr[])
int calculateSum()
Logic: Traverse array and add all values to sum.
*/
import java.util.*;
public class SumOfArrayElement
{	static int s=0;
	public static int sum(int arr[])
	{	for(int i=0; i<arr.length; i++)
		{
			s+=arr[i];
		}
		return s;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={10,20,50,30,90};
		System.out.println(sum(arr));
		
	}
}
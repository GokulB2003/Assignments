/*Q6. Write a java program to search element in array , its element found or not.

*/
import java.util.*;
public class LinearSearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int arr[]=new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target element");
		int target=sc.nextInt();
		Boolean flag=false;
		int index=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==target)
			{
				flag=true;
				index=i;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Element is found at index"+index);
		}
		else
		{
			System.out.println("Element is not found:");
		}
	}
}
/*Q1. Find Maximum Element in Array
Class: ArrayMax
Functions:
void inputArray(int arr[]) → take array input
int findMax() → display maximum element
int findMin() → display minimum element
Logic: Loop through array, compare each element, store max.
*/
import java.util.*;
public class MaxiElementArr
{
	public static int findMax(int arr[])
	{	int maxi=0;
		for(int i=0; i<arr.length; i++)
		{
			maxi=Math.max(maxi,arr[i]);
		}
		return maxi;
	}
	public static int findMin(int arr[])
	{
		int min=Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			min=Math.min(arr[i],min);
		}
		return min;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={10,20,30,40,50};
	
		System.out.println("Maximum Element:"+MaxiElementArr.findMax(arr));
		System.out.println("Min Element is:"+MaxiElementArr.findMin(arr));
		
		
	}
}
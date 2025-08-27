/*1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,   -1,  2,  1,   -5.  ,4]  
Output: 6.  (from subarray [4,-1,2,1])
*/
import java.util.*;
public class MaxSumSubArray 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[9];
		System.out.println("Enter");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int maxi=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{	int sum=0;
			for(int j=i; j<arr.length; j++)
			{
				sum+=arr[j];
				if(sum>maxi)
				{
					maxi=sum;
				}
				
			}
		}
		System.out.print(maxi);
	}
}
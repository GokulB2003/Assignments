/*Find First Negative Number in Every Window of Size K
For each window of size k, find the first negative number.
Input: arr[] = [-8, 2, 3, -6, 1] , k = 2
Output: [-8, 0, -6, -6]
*/
import java.util.*;
public class FirstNegativeNum
{
	public static void main(String args[])
	{
		int arr[]={2,-5,6,-1,4,-7};
		boolean flag=true;
		int k=3,s=0,e=0,negativenum=-1;
		while(e<arr.length)
		{
			if(arr[e]<0 && flag)
			{					
					negativenum=arr[e];
				        flag=false;
				
			}
			if((e-s+1)==k)
			{
				
				
				if(flag==false)
				{
					System.out.println(negativenum);
					
				}
				if(arr[s]==negativenum)
				{
					flag=true;
					s++;
				}
			}
			
			e++;	
			
		}
				
	}
	
}
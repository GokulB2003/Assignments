/*Merge Two Sorted Arrays (No Extra Space)
Merge two sorted arrays in-place using the two-pointer method*/
import java.util.*;
public class MergeTwoSortedArr
{
   public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	int arr1[]={1,3,4,5,6};
	int arr2[]={7,8,9};
	int arr3[]=new int[arr1.length+arr2.length];
	int j=0,k=0;
	//System.out.println(arr3.length);
	for(int i=0; i<arr3.length; i++)
	{	if(i<arr1.length)//5 //3
		{
			arr3[j]=arr1[i];//1 3  4 5 6   
			j++;//2 //3 4
		}
		else
		{
			arr3[i]=arr2[k];
			//System.out.println(arr2[k]);
			k++;		
		}
		
	}
	//System.out.println(arr3.length); 
	for(int i=0; i<arr3.length; i++)
	{
		System.out.println(arr3[i]+" ");
	}
    }
}
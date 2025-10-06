/*Q3. Calculate Average of Array Elements
Class: ArrayAverage
Functions:
void inputArray(int arr[])
double findAverage()
Logic: Use sum ÷ total elements.
*/
class ABC
{	int A(int arr[])
	{
	int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		int AVG=sum/arr.length;
		return AVG;
	}
}
public class AvgOfArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={10,20,30,50,60};
		ABC obj=new ABC();
		int ans=obj.A(arr);
		System.out.println(ans);
		
		
		
	}
}
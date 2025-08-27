/*Write a java program to display 1 to nth Strong Number.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,

*/
import java.util.*;
public class AllStrongNum{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int temp=n;
	int j=1;
	while(j<n)//4
	{	int i=j;
		int sum=0;
		
			
		while(i!=0){ //2 //3
		int rem=i%10;//2 //3
		int fact=1;
		while(rem!=0)// 2 1
		{
			fact=fact*rem;//1 //2 //3 6 
			rem--;	//1 //2 1
		}
		sum+=fact;
		i=i/10;
		}
		
		if(sum==j)
		{	System.out.println(j);
		}
	j++;
		
		
	}

	
}
}
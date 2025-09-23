/*Write a function to find the sum of cubes of first n natural numbers.*/
import java.util.*;
class SumOfCube
{
	int cube(int n)
	{
		int i=1,sum=0;
		while(i<=n)
		{
			
			int c=i*i*i;
			sum+=c;
			i++;
		} 
		return sum;
		
	}
}
public class SumOfCubeOfNaturalNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		SumOfCube obj=new SumOfCube();
		int result=obj.cube(n);
		System.out.println(result);

	}
}
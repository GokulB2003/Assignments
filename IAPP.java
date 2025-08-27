/*write a program */
import java.util.*;
public class IAPP{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value I the Array:");
		int a[]=new int[]{10,20,30,40,50};
		int b[];
		b=a;
		for(int i=0; i<b.length; i++)
		{	
			b[i]=b[i]*10;		
		}
		for(int i=0; i<a.length; i++)
		{	
			System.out.println(a[i]);		
		}

}
}
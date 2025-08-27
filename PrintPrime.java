//printallPrimeNumber
import java.util.*;
public class PrintPrime{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0;
	int j=2;
        while(j<n)
	{
		int flag=1;
		int i=2;
        	while(i<j) 
        	{     
        		/*if(j==i)
        		{
        			++i;
        		}*/

       		if((j%i)==0)
       		{
       			flag=0;
       		}
       		i++;
       		}
       		if(flag==1)
		{
	       		System.out.println(j);
      		 }
       		j++;

    		 }

   	 }
}
/*
1
2*3
4*5*6
7*8*9*10
7*8*9*10
4*5*6
2*3
1

*/
import java.util.*;
public class SolidHalf2nd
{	
	public static void main(String args[])
	{
		int n=4,m=1;
		for(int i=1; i<=n; i++)
		{	Boolean flag=true;

			for(int j=1; j<=i*2-1; j++)
			{
				if(flag==true)
				{
					System.out.print(m);
					flag=false;
					m++;
				}
				else
				{
					System.out.print("*");
					flag=true;
				}
					
			}
			System.out.println();

		}
	         m = 7; // start number for lower half
       		 int p = 4;
        	for (int i = 1; i <= n; i++) {
            		boolean flag = true;
            		for (int j = 1; j <= p * 2 - 1; j++) {
                		if (flag) {
                   		 System.out.print(m);
                    		m++;
                   		 flag = false;
               			 } else {
                    		System.out.print("*");
                    		flag = true;
               			 }
            			}
           			 p--;
            		System.out.println();
		}
	}
}
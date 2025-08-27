/* Q54. Write a java program to display following series :
           	1  2  4  7  11  16  22  29  37  46.
*/
import java.util.*;
public class DiffSeries
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		//int n=sc.nextInt();
		int i=1,j=0;
		while(j<10)
		{	
			i=i+j;
			if(i==1){
				System.out.print(i);
			}
			else
			{
				System.out.print(" "+i);
			}			
			j++;
		}
		
	}
}
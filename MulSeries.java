/*Q55. Write a java program to display following series :
           	5  3  10  6  15  9  20  12  25  15  30  18  35  21  40
*/
import java.util.*;
public class MulSeries
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		//int n=sc.nextInt();
		int i=1;
		while(i<=10)
		{	
			int five=i*5;
			int three=i*3;
			System.out.print(" "+five);
			System.out.print(" "+three);
			i++;
		}

	}
}
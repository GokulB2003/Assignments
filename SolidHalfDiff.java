/*
1
2*2
3*3*3
4*4*4*4
4*4*4*4
3*3*3
2*2
1
*/
public class SolidHalfDiff
{
	public static void main(String args[])
	{	int m=4;
		for(int i=1; i<=m; i++)
		{
			Boolean flag=true;
			for(int j=1; j<=7; j++)
			{
				
			   if(i<=4)
			  {
			   	if(j<i*2 && flag)
				{
					System.out.print(i);
					flag=false;
				}
				else if(j<i*2 &&flag==false)
				{
					System.out.print("*");
					flag=true;
				}
				
			   }
				
		       }
			System.out.println();
			
		}
		int n=4;
		int temp=n;
		for(int i=1; i<=temp; i++)
		{	boolean flag=true;
			for(int j=1; j<=n*2-1; j++)
			{	
				if(flag && (j%2!=0))
				{
					System.out.print(n);
				flag=false;
				}
				else
				{
					System.out.print("*");
					flag=true;	
				}
			}
			n--;
			System.out.println();
		}
	}
}
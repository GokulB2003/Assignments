/*print the square series*/
public class SeriesOfSqr
{
	public static void printSeries(int start,int count)
	{
		if(count==0)
		{
			return;
		}
		
		int s=start*10;
		System.out.println(s*s);
		printSeries(start+1,count-1);
	}
	public static void main(String args[])
	{
		printSeries(1,5);
		
	}
}
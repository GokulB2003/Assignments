/*
                         *
			* *
		      *  *  *
		     *  *  *  * 
		    *  *  *  * *
		   *  *  *  * * *


*/
import java.util.*;
public class FullPyramid
{
	public static void main(String args[])
	{
		for(int i=1; i<=6; i++)
		{	boolean flag=true;
			for(int j=1; j<=11; j++)
			{	
				if(((7-i)<=j) && ((i+5)>=j) && flag)
				{
					System.out.print("*");
					flag=false;
				}
				else{
					System.out.print(" ");
					flag=true;
					}	
			}
			System.out.println();
		}
	}
}
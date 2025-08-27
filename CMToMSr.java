//Write a java program to enter length in centimeter and convert into meter and kilometer.
import java.util.*;
public class CMToMSr{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value in cm");
	double cm=sc.nextDouble();
	int m=(int)(cm*(1/100.0));
	System.out.println("the value after converting in meter is"+m);
	int km=(int)(cm/1000);
	System.out.println("the value after converting in km is:"+km);
	
}

}
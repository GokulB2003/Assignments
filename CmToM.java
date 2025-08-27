//. Write a java program to enter length in centimeter and convert into meter and kilometer.
public class CmToM{
public static void main(String args[])
{
	//1cm=1/100=0.01 m;
	System.out.println("Enter the number of cm");
	int cm=Integer.parseInt(args[0]);
	double m=(cm*0.01);
	double km=cm /100000.0;//m*10000
	System.out.println("the length in m is:"+ m +"in km is:"+ km);
}
}
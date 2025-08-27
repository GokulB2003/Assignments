//Write a java program to enter temperature in Celsius and convert it into Fahrenheit.Formula :-  
//fah = (cel * 9 / 5) + 32;
public class CelciusToFarenheit{
public static void main(String args[])
{
	System.out.println("enter the temp in Celcius");
	int cel=Integer.parseInt(args[0]);
	int fah=(int)(cel *(9/5)) + 32;
	System.out.println("the temp in fah is"+fah);
	
}
}
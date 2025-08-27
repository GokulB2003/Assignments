//Write a java program to enter temperature in Fahrenheit and convert to Celsius.Formula :- 
//cel = (fah - 32) * 5 / 9;
public class FahrenheitToCel{
public static void main(String args[])
{
System.out.println("Enter the value in Fahrenheit");
int f=Integer.parseInt(args[0]);
float celcius=((f-32)*5/9);
System.out.println("The temperature in celcius is:"+celcius);
}
}


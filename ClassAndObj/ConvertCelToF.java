/*9. Convert Celsius to Fahrenheit
Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
Explanation: Demonstrates unit conversion logic.
*/
import java.util.*;
class Fahrenheit
{
	int convert(int temp)
	{
		int result=((temp*(9/5))+32);
		return result;
	}
}
public class ConvertCelToF
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of cel");
		int cel=sc.nextInt();
		Fahrenheit obj=new Fahrenheit();
		int temp=obj.convert(cel);
		System.out.println(temp);
		
	}
}
/* Write a java program to enter temperature in Celsius and convert it into Fahrenheit.Formula :-  
				fah = (cel * 9 / 5) + 32;*/
import java.util.*;

public class CelToF{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value in Celcius:");
	int Cel=sc.nextInt();
	float far=((Cel*9)/5)+32;
	System.out.println("the value in Farhrnite is"+far);
	
}
} 


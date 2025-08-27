//Write a java program to enter temperature in Fahrenheit and convert to Celsius.
//Formula :- cel = (fah - 32) * 5 / 9;
import java.util.*;
public class FToCel{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value in Farenhit:");
int far=sc.nextInt();
float cel=((far-32)*5)/9;
System.out.println("the value in celcius is:"+cel);
}
}

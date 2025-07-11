import java.util.*;
public class DataTypes{


public static void main(String args[])
{
int x=Integer.parseInt(args[0]);
int a=Integer.parseInt(args[1]);
char ch=args[2].charAt(0);
System.out.print("the value of x is"+x);
System.out.println("the value of A is"+a);
System.out.println("the character is"+ch);

float f=Float.parseFloat(args[3]);
System.out.print("the value of float is"+f);

double d=Double.parseDouble(args[4]);
System.out.println("the value of double is"+d);
long b=Long.parseLong(args[5]);
System.out.println("the value of long is "+b);

}
}
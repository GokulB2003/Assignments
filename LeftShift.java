//left shift
import java.util.*;
public class LeftShift{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int leftShift=a<<2;
int rightShift=a>>2;
System.out.println("The left shift"+leftShift);
System.out.println("The right shift of"+a+"is"+rightShift);
}
}
import java.util.*;
public class CommandLineArg{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
String str=a>b ? "A is greater than B" : "B is greater than A";
System.out.print(str);
}
}
//Write a java program to input any character and check whether it is alphabet, digit or special character.
import java.util.*;
public class AlpDigitSpecial{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the alphabet");
char ch=sc.next().charAt(0);
if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z'))
{
System.out.println("Alphabet");
}
else if((ch=='&')||(ch=='@')||(ch=='?')||(ch=='*')||(ch=='+')||(ch=='$')||(ch=='%')||(ch=='#')||(ch=='/'))
{
System.out.println("special character");
}
else{
System.out.println("Digit");
}
}
}
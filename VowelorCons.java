//Write a java program to input any alphabet and check whether it is vowel or consonant.
import java.util.*;
public class VowelorCons{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any alphabet");
char ch=sc.next().charAt(0);
if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
{
System.out.println("this is a vowel:");
}
else{
System.out.println("This is not a vowel");
}
}
}
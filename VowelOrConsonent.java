//Write a java program to input any alphabet and check whether it is vowel or consonant.
import java.util.*;
public class VowelOrConsonent{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character:");
char ch=sc.next().charAt(0);
String str=((ch=='a')|| (ch=='e') || (ch=='i') ||(ch=='o') || (ch=='u') || (ch=='A')|| (ch=='E') || (ch=='I') ||(ch=='O') || (ch=='U')) ? "vowel" : "consonant";
System.out.println(str);
}
}
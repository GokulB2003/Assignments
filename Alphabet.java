//Write a C program to print all alphabets from a to z. - using while loop
import java.util.*;
public class Alphabet{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the vlue of n:");
char ch=sc.next().charAt(0);
while(ch<='z')
{
System.out.print(ch+ " ");
ch++;
}
}
}
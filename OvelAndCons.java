/*
Write a program to input a character and check whether it is a vowel or consonant using a switch case.
Explanation:
 Switch on the lowercase character. Use cases for 'a', 'e', 'i', 'o', 'u'; default for consonant.

*/
import java.util.*;
public class OvelAndCons{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter char");
char ch=sc.next().charAt(0);

if(ch>='A' && ch<='Z')
{
 ch=(char)(ch+32);
}
switch(ch){
case 'a','e','i','o','u':
			System.out.println("vowel");
			break;
default:
	System.out.println("consonent");
}
}
}
//Q15. Write a java program to print all ASCII characters with their values.
import java.util.*;
public class ASCIIAndValue{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
//int n=sc.nextInt();
char ch=sc.next().charAt(0);

while(ch<='z')
{
int p=ch;
System.out.println(ch+" "+(p));
ch++;
}
}
}
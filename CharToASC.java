//char to ASCII
import java.util.*;
public class CharToASC{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the char");
char ch=sc.nextLine().charAt(0);
int ASCII=(int)(ch);
System.out.println("the value of ASCII is:"+ASCII);
}
}

//Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
import java.util.*;
public class PassOrFail{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Marks of Student");
int a=sc.nextInt();

String str=(a>=40) ? "Pass" : "Fail";
System.out.println(str); 

}
}
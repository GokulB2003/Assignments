/*Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50)
— using nested ternary operators.
*/
import java.util.*;
public class Score{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Marks of Student");
int M=sc.nextInt();

String str=(M>=90) ? "Excellent" : (M>=75 && M<90) ? "Good" : (M>=50 && M<75) ? "AVG" : "Poor";
System.out.println(str); 

}
}
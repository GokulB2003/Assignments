//Q56. Given (x, y), print quadrant I, II, III, IV or "Axis".
import java.util.*;
public class PrintQuadrent{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of the X:");
int x=sc.nextInt();
System.out.println("Enter the value of Y");
int y=sc.nextInt();
String Quaderent=(x>0 && y>0) ? "First Quadrent" : (x<0 && y>0) ? "Second Quaderent" : (x<0 && y<0)? "Third Quadrent" : "Fourth Quaderent";
System.out.println("values lies in"+Quaderent); 


}
}
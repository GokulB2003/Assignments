/*Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.
*/
import java.util.*;
class ABC{
public static boolean check(int n)
{
	double a=Math.sqrt(n);
	
	return ((a-Math.floor(a))==0);
	//return abc;

}
}
public class PerfectSquare{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:");
int n=sc.nextInt();
boolean c=ABC.check(n);
if(c)
{
System.out.println("perfect Square");
}
else{
System.out.println("Not Perfect square");
}
}
}




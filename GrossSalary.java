/*Q44. Write a java program to input basic salary of an employee and calculate its Gross salary according to following.
Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95%
*/
import java.util.*;
public class GrossSalary{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Salary:");
int BS=sc.nextInt();

/*int HRA=0;
int s=(BS<=10000) ? HRA=((BS*20)/100)+  :
System.out.println(str); 
*/

String str = (BS >0 && BS<=10000)? "The salary is"+((BS*20/100)+(BS*80/100)+BS): (BS >10000 && BS<=20000)?"The salary is"+((BS*25/100)+(BS*90/100)+BS):"The salary is"+((BS*30/100)+(BS*95/100)+BS);
System.out.printf("%s",str);
}
}
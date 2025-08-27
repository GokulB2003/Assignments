
import java.util.*;
public class NetSalary{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the basic salary:");
int basicSalary=sc.nextInt();

System.out.println("Enter the HRA amount:");
int HRA=sc.nextInt();

int HRAA=((basicSalary*HRA)/100);
System.out.println("Enter the value of the DA");//one type of pention
int DA=sc.nextInt();
DA=(basicSalary*DA)/100;

int total=HRAA+DA+basicSalary;
System.out.println("the total salary need to paid for employee is:"+total);
		
}

}
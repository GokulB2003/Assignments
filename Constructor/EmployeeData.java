/*Q1. Problem:
 Create a class Employee with fields:
empId, empName, basicSalary, hra, da, and grossSalary.
Use a parameterized constructor to initialize empId, empName, and basicSalary.
 HRA = 10% of basic, DA = 15% of basic, and Gross = Basic + HRA + DA.
 Display all employee details and salary slip.
Hint: Use constructor to calculate the salary.
Explanation:
 This helps you understand how constructors can perform initial calculations immediately after object creation.
*/
import java.util.*;
class Employee
{
	int EmpId;
	int basicSalary;
	int hra;
	int da;
	int grossSalary;
	String name;
		Employee(int E,String n,int bs)
		{
			this.EmpId=E;
			this.name=n;
			this.basicSalary=bs;
			calculateSalary();
		}
	public void calculateSalary()
	{
		hra=basicSalary*10/100;
		da=basicSalary*15/100;
		grossSalary=basicSalary+hra+da;
		
	}
	public void displaySalary()
	{
		System.out.println("Name of Employee:"+name);
		System.out.println("HRA:"+hra);
		System.out.println("DA:"+da);
		System.out.println("Total gross salary of the employee:"+grossSalary);
		
	}

}
public class EmployeeData
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee(1,"Sagar",50000);
		emp.displaySalary();
		
	}
	
}
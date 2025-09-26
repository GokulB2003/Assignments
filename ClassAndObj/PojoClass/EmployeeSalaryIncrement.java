/*2. Employee Salary Increment
Task:
 Create an Employee class with fields: name, salary, and department.
 In the main method:
Create an Employee object.
Increase the employee's salary by 10% and print the updated salary.
Explanation:
 This introduces instance variable manipulation and basic arithmetic operations.
*/
import java.util.*;
class Employee
{
	private String name;
	private int salary;
	private String department;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{	
		return salary;
	}
}
class InputData
{
	Scanner sc=new Scanner(System.in);
	Employee[] emp;
	public void setData(Employee[] emp)
	{
		this.emp=emp;
		for(int i=0; i<emp.length; i++)
		{
			System.out.println("Enter the salary and Name:");
			String name=sc.next();
			int s=sc.nextInt();
			emp[i]=new Employee();
			emp[i].setName(name);
			emp[i].setSalary(s);
			
		}
	}
	public void show()
	{
		for(int i=0; i<emp.length; i++)
		{
			System.out.println(emp[i].getName());
			int sa=emp[i].getSalary();
			int p=sa*10/100;
			sa=sa+p;
			emp[i].setSalary(sa);
			System.out.println(emp[i].getSalary());
			
			
		}
	}
	
}
public class EmployeeSalaryIncrement
{
	public static void main(String args[])
	{
		
		Employee[] emp=new Employee[2];
		InputData obj=new InputData();
		obj.setData(emp);
		obj.show();
		
		
		
		
	}
}
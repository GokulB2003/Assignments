/*3. Person Age Verification
Task:
 Create a Person class with fields: name and age.
 In the main method:
Create a Person object.
Check if the person is eligible to vote (age >= 18) and print the result.
Explanation:
 This demonstrates condition checking using instance variables.
*/
import java.util.*;
class Person
{
	private String name;
	private int age;
	public void setName(String n)
	{
		this.name=n;
	}
	public String getName()
	{
		return name;	
	}
	public void setAge(int a)
	{
		this.age=a;
		
	}
	public int getAge()
	{
		return age;
	}
	public boolean checkAge()
	{
		return age>=18;
		
	}	
	
}
class InputData
{
	Person[] per;
	public void setData(Person[] per)
	{
		this.per=per;
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<per.length; i++)
		{	System.out.println("Enter the name of person");
			String name=sc.next();
			per[i]=new Person();
			per[i].setName(name);
			System.out.println("Enter the Age:");
			int age=sc.nextInt();
			per[i].setAge(age);
			
		}
		
	}
	public void show()
	{
		for(int i=0; i<per.length; i++)
		{
			boolean ab=per[i].checkAge();
			if(ab==true)
			{
				System.out.println(per[i].getName()+":is eligible to vote");
			}
			else
			{
				System.out.println(per[i].getName()+":Person is not eligible to vote");
			}
			
		}
	}
	
}

public class PersonAgeVerification

{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//Person obj=new Person();
		
		/*obj.setName("Raju");
		System.out.println("Enter the Age:");
		int age=sc.nextInt();
		obj.setAge(age);
		
		*/
		System.out.println("Enter the how many/no. of persons u want to be Insert");
		int n=sc.nextInt();
		Person emp[]=new Person[n];
		InputData obj=new InputData();
		obj.setData(emp);
		obj.show();
				
	}
}
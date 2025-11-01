package org.Constructor;
import java.util.*;

public class Student {

	/*Q2. Problem:
 Create a class Student with fields rollNo, name, m1, m2, m3, and total.
 Use a parameterized constructor to assign values to roll number, name, and marks.
 Calculate total marks inside the constructor and display details using a function.
Hint: Constructor should perform addition logic.
Explanation:
 Shows how to use constructors to initialize and process multiple fields at once.
*/
	int rollno;
	String name;
	int m1;
	int m2;
	int m3;
	int marks;
	int total;
	Student(int r,String n,int m1,int m2,int m3)
	{
		this.rollno=r;
		this.name=n;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		calTotal();
	}
	public void calTotal()
	{
		total=m1+m2+m3;
		System.out.println("total sum of marks is:"+total);
		
	}
}

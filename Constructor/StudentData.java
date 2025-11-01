package org.Constructor;
import java.util.*;

public class StudentData {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		/*Q2. Problem:
 Create a class Student with fields rollNo, name, m1, m2, m3, and total.
 Use a parameterized constructor to assign values to roll number, name, and marks.
 Calculate total marks inside the constructor and display details using a function.
Hint: Constructor should perform addition logic.
Explanation:
 Shows how to use constructors to initialize and process multiple fields at once.
*/
		Student s=new Student(1,"Sagar",100,50,60);
		
	}
}

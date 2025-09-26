package org.Student;
import java.util.*;
/*Create a Student class with fields: name, marks, and subject.
 In the main method:
Create a Student object.
Check if the student has passed or failed the subject (passing marks >= 40) and print the result.
Explanation:
 This task involves condition checking and field manipulation.*/

public class StudentGradeEvaluation {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of subjects");
		int total=sc.nextInt();
		Student[] s=new Student[total];
		for(int i=0; i<s.length; i++)
		{
			s[i]=new Student();
			System.out.println("Enter the Name of the student ");
			String name=sc.next();
			System.out.println("Enter the Name of the subject:");
			String nb=sc.next();
			s[i].setName(name);
			s[i].setSubjects(nb);
			System.out.println("Enter the marks of "+s[i].getSubjects());
			int mark=sc.nextInt();
			s[i].setMarks(mark);
			
		}
		ChekPassOrFail obj=new ChekPassOrFail();
		obj.check(s);
		obj.checkPass();
		
	}
}

package org.Student;
import java.util.*;

/*Create a Student class with fields: name, marks, and subject.
In the main method:
Create a Student object.
Check if the student has passed or failed the subject (passing marks >= 40) and print the result.
Explanation:
This task involves condition checking and field manipulation.*/

class ChekPassOrFail {
	Student s[];
	public void check(Student[] s)
	{
		this.s=s;
	}
	public void checkPass()
	{
		for(int i=0; i<s.length; i++)
		{
			if(s[i].getMarks()>=40)
			{
				System.out.println(s[i].getName()+"pass:in"+s[i].getSubjects());
			}
			else
			{
				System.out.println(s[i].getName()+"Fail"+s[i].getSubjects());
			}
		}
	}
	
}

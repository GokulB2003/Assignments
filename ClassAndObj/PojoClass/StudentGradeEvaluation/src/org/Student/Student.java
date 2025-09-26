package org.Student;
/*Create a Student class with fields: name, marks, and subject.
 In the main method:
Create a Student object.
Check if the student has passed or failed the subject (passing marks >= 40) and print the result.
Explanation:
 This task involves condition checking and field manipulation.*/
public class Student {
	private String name;
	private int marks;
	private String subjects;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSubjects() {
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	
	

}

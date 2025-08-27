/*
**10. Student Marks Entry**

**Description:**

* Keep asking for student marks in a do-while loop.
* If marks are negative, **continue** to skip and ask again.
* If "stop" is entered, **break**.
* Finally, display average marks of valid entries.
*/
import java.util.*;
public class StudentsMarksEntry
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Marks Management System");
		System.out.println("1.Enter the Marks");
		System.out.println("2.Stop");
		int count=0,total=0;
		int choice;
		do
		{
			System.out.println("1.Enter the Marks");
			System.out.println("2.Stop");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter the Marks:");
					int marks=sc.nextInt();
					if(marks<0)
					{
						continue;
					}
					else
					{
						total+=marks;
						count++;	
					}
					break;
				case 2:
					double AVG=total/count;
					System.out.println("AVG Marks:"+(AVG));
					break;
				default:
					System.out.println("Enter the valid choice");
					
					
			}
			
			
		}while(choice!=2);
		
	}
}
 /*Write a java program to input marks of five subjects Physics, Chemistry, Biology,
        	    Mathematics and Computer, calculate percentage and grade according to given conditions:
                    	percentage >= 90% : Grade A
                    	percentage >= 80% : Grade B
                    	percentage >= 70% : Grade C
                    	percentage >= 60% : Grade D
                    	percentage >= 40% : Grade E
                    	percentage < 40% : Grade F*/
import java.util.*;
public class PercentageToGrade{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Marks of five sub");
int sub1=sc.nextInt();
int sub2=sc.nextInt();
int sub3=sc.nextInt();
int sub4=sc.nextInt();
int sub5=sc.nextInt();
double total=(double)(sub1+sub2+sub3+sub4+sub5);
double per=(double)(total/500)*100.0;
if(per>=90)
{
System.out.println("A");
}
else if(per>=80 && per<90)
{
System.out.println("B");
}
else if(per>=70 && per<80)
{
System.out.println("C");
}
else if(per>=60 && per<70)
{
System.out.println("D");
}
else if(per>=40 && per<60)
{
System.out.println("E");
}
else{
System.out.println("F");
}
}
}
	
 

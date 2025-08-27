//Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
import java.util.*;
public class CandidateAge
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Age");
int age=sc.nextInt();
if(age>18)
{
System.out.println("He can vote");
}
else{
System.out.println("He cannot vote");

}
}
}
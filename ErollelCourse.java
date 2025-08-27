import java.util.*;
public class ErollelCourse{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("NN friends who wish to enroll in a course together.");
int nn=sc.nextInt();
System.out.println(" course has a maximum capacity");
int mm=sc.nextInt();
System.out.println("If there are KK other students who have already enrolled in the course");
int kk=sc.nextInt();
int total=kk+nn;
//1<=N<=M <=100
//0<=K<=M

if((1<nn) && (mm<=100))
{
if(total<=mm)
{
System.out.println("YES");
}
else{
System.out.println("NO");
}
}
else{
System.out.println("Enter the valid choice");

}
}
}

//Write a java program to enter two angles of a triangle and find the third angle.
public class FindThirdAngle{
public static void main(String args[])
{
	System.out.println("enter the angle one and angle 2");
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int totalsum=180;
	int sum=a+b;
	int thirdAngle=totalsum-sum;
	System.out.println(thirdAngle);
	
}
}
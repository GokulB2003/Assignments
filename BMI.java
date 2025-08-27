public class BMI{//Body Mass Index
public static void main(String args[])
{
	System.out.println("Enter the weight in (Kg)");
	System.out.println("Enter the height in meter");
	int weight=Integer.parseInt(args[0]);
	int height=Integer.parseInt(args[1]);
	int heightSqrt=(height*height);
	double BMII=(double)(weight/heightSqrt);
System.out.println("BMI IS"+BMII);
	
}
}
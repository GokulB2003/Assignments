//Write a java program swap two number using third variable;
public class Swapping{
public static void main(String args[])
{
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);

	int temp=a;
	a=b;
	b=temp;
	System.out.printf("value of a is:"+"%d",a);
	System.out.printf("value of b:"+"%d",b);
	
}
}
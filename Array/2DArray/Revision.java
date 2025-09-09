/* Write a java program swap two number without using third variable. */
public class Revision
{
public static void main (String args[])
{
	//Scanner sc=new Scanner(System.in);
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	char ch=args[2].charAt(0);
	//int d=args[3].next();
	a=a^b;
	b=a^b;
	a=a^b;
	final int p=10;
	++p;
	System.out.println((char)(ch+32));
	System.out.println(p);
}	
}

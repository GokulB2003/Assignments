//fibbonnaci series
import java.util.*;
public class Fibbonacci{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=sc.nextInt();
int a=0;
int b=1;
//0,1,1,2,3,5,8,13......
for(int i=1; i<=n; i++)
{
	int next_Term=a+b;
	a=b;
	b=next_Term;
	System.out.println("the final series is:"+next_Term);

}
}
}
/*
calculate power like base=2 index=3 so ans=8;

*/
import java.util.*;
public class PowerApp{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int base=sc.nextInt();
int index=sc.nextInt();
int a=1;
int i=1;
while(i<=index)
{
	a=a*base;
	i++;


}
System.out.println(a);

}
}
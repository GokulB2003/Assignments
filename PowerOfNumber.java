//Q16. Write a java program to find power of a number.
import java.util.*;
public class PowerOfNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int base=sc.nextInt();
int power=sc.nextInt();
int total=1;
while(power>0)
{
total=total*base;
power--;
}
System.out.println(total);

}
}
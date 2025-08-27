/*Q25.Write a java program to find the total number of notes in a given amount.  
                    	
            Enter the amount: 2528
Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1*/

import java.util.*;
public class Notes{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount");
int n=sc.nextInt();
int fivehundred=n/500;
System.out.println("five hundread"+fivehundred);
if(fivehundred!=0)
{
n=n-(fivehundred*500);	
}
int hundread=n/100;
System.out.println("one hundread"+hundread);
if(hundread!=0)
{
n=n-(100*hundread);
}
int fifty=n/50;
System.out.println("fifty"+fifty);
if(fifty!=0)
{
n=n-(fifty*50);
}
int ten=n/10;
System.out.println("ten"+ten);
if(ten!=0)
{
n=n-(ten*10);
}
int five=n/5;
System.out.println("five"+five);
if(five!=0)
{
n=n-(five*5);
}
int two=n/2;
System.out.println("two"+two);
if(two!=0)
{
n=n-(two*2);
}
int one=n/1;
System.out.println("one"+one);
if(one!=0)
{
n=n-(one*1);
}





}
}

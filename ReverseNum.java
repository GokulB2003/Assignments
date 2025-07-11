//Write a Java program to reverse a number without using loop.
//Input a number: 123
//Reverse number: 321
public class ReverseNum{
public static void main(String args[])
{	
	int n=Integer.parseInt(args[0]);//123
        int rev=0;
	int rem=n%10;//3
	rev=rev+rem*100;//300
	n=n/10;//12
	rem=n%10;//2
	rev=rev+rem*10;//320
	n=n/10;//1
	rem=n%10;
	rev=rev+rem*1;
	
System.out.println("the reverse number of"+n+"is"+ rev);
	
	
}
}
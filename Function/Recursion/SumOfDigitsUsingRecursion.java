/*Write a program to calculate the sum of digits of a given number using recursion.

*/
/*
import java.util.*;
class ABC
{
	void SumOfDigit(int n,int sum)
	{
		if(n==0)
		{
			System.out.println(sum);
			return;
		}
			int rem=n%10;
			sum+=rem;
			SumOfDigit(n/10,sum);	
	}
}
public class SumOfDigitsUsingRecursion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		ABC obj=new ABC();
		obj.SumOfDigit(n,sum);
		
	}
}
*/
		//OR

import java.util.*;

class ABC {
    int SumOfDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + SumOfDigit(n / 10);
    }
}

public class SumOfDigitsUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ABC obj = new ABC();
        int result = obj.SumOfDigit(n);
        System.out.println(result);
    }
}


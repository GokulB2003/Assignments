/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

*/
import java.util.*;
class Solution {
    public int climbStairs(int n) {
        int a=1;
        if(n==1)return n;
        int b=2;
        if(n==b)return n;
        int c=0;
        for(int i=2; i<n; i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
        
    }
}
*/
or using recursion

	class Solution {
    public int climbStairs(int n) {
       if(n==1)
       return 1;
       if(n==2)
       return n;
       return climbStairs(n-1)+climbStairs(n-2);
        
    }
}

/*

public class NthStairs
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=5;
		Solution obj=new Solution();
		System.out.println("Total no. of ways to climb is:"+obj.climbStairs(n));
	}
}
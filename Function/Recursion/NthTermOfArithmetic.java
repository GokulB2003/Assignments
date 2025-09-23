/* Write a program to calculate the nth term of an arithmetic series using recursion. */
import java.util.*;

class ABC
{
    int nthTerm(int a, int d, int n)
    {
        if (n == 1)  // base case → first term
        {
            return a;
        }
        // recursive case: reduce n and add d
        return nthTerm(a, d, n - 1) + d;
    }
}

public class NthTermOfArithmetic
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term (a1): ");
        int a = sc.nextInt();

        System.out.print("Enter the common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter the term number (n): ");
        int n = sc.nextInt();

        ABC obj = new ABC();
        System.out.println("The " + n + "th term is: " + obj.nthTerm(a, d, n));
    }
}

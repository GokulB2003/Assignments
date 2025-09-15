/*Write a function to find the sum of cubes of first n natural numbers.
*/
import java.util.*;
public class SumOfCubes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=fsum(int n);
        int cube=sum*sum*sum;
        System.out.print(cube);
        /*int sum=0;
         for(int i=1;i<=n; i++)
         {
           int c=cube(i);
           sum+=c;
         }

         System.out.println(sum);*/
         
    }
     public static int fsum(int n)
    {
        int sum=n*(n+1)/2;
        return sum;
    }
        
    /*  public static int cube(int n)
    {
        return n*n*n;
    }*/

}
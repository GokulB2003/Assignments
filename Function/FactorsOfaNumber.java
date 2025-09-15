import java.util.*;
public class FactorsOfaNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       boolean b=factor(n);
       {
        if(b)
        {
            System.out.print("perfect");
        }
        else
        {
            System.out.println("not");
        }
       }
        //System.out.println(p);
        
    }
    public static boolean factor(int n)
    {   int sum=0;
        for(int i=1; i<=n/2; i++)
        {
            if(n%i==0)
            {
             sum+=i;
            }
          
        }
       // return q;
       if(sum==n)
       {
           return true; 
       }
       else
       {
        return false;
       }
    }
}
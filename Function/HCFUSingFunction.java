import java.util.*;
public class HCFUSingFunction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("b");
        int b=sc.nextInt();
      
        int q=HCF(a,b);
        System.out.print("HCF"+q);
        double LCM=(a*b)/q;
        System.out.print("LCM is:"+LCM);


    }
    public static int HCF(int a,int b)
    {
        int maxi=0;
        if(a<b)
        {
            maxi=a;
        }
        else
        {
            maxi=b;
        }
        int p=0;
        for(int i=1; i<=maxi/2; i++)
        {
            if(a%i==0 && b%i==0)
            {
                p=Math.max(p,i);

            }
        }
        return p;

    }
}
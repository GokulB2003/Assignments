import java.util.*;
class ABC
{
	int b,i;
	void setInt(int index,int base)
	{
		b=base;
		i=index;
		
	}
	int getpow()
	{
		int p=1;
		while(i!=0)//3
		{
			p=p*b;
			i--;
		}
		return p;
	}
}
public class Power
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//int base,index;
		ABC obj=new ABC();
		obj.setInt(3,2);
		int result=obj.getpow();
		System.out.println(result);
		
		
	}
}
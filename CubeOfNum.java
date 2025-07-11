//import java.lang.Math;
public class CubeOfNum{
public static void main(String args[])
{
	int a=Integer.parseInt(args[0]);
	//int ans=(a*a)*a;
	int ans=(int)Math.pow(a,3);
	
	System.out.println(ans);
}
}
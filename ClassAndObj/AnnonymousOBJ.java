//Annonymous object
class Multi
{
	int mult(int a,int b)
	{
		return a*b;
	}
}
public class AnnonymousOBJ
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		int a=2,b=4;
		System.out.println(new Multi().mult(a,b));
		System.out.println(new Multi().mult(5,6));
		
	}
}
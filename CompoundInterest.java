//Write a java program to calculate the compound intrest.
public class CompoundInterest{
public static void main(String args[])
{
	//A = P (1 + r/n)^(nt);
	double Principle=Double.parseDouble(args[0]);
	//rate % per year
	double rate=Double.parseDouble(args[1]);
	// n is the number of times that interest is compounded per year
	int n=Integer.parseInt(args[2]);
//no.of years
	int years=Integer.parseInt(args[3]);
	int a=n*years;
	double b=(1+rate/n);
	

	double total_amount=Principle*Math.pow(b,a);
	System.out.println(total_amount);
}
}
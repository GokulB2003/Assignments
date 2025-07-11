public class CalculateGST{
public static void main(String args[])
{
	int Qty=Integer.parseInt(args[0]);
	int rate=Integer.parseInt(args[1]);
	int total =Qty*rate;
	int GST=(total*18)/100;
	int GSTBill=GST+total;
	System.out.println("the total bill is"+GSTBill);
	System.out.println("the total bill without GST is"+total);
	
}
}
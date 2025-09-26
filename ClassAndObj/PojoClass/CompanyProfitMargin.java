/*5. Company Profit Margin
Task:
 Create a Company class with fields: companyName, revenue, and expenses.
 In the main method:
Create a Company object.
Calculate the profit margin (profit/revenue) and display the result.
Explanation:
 This introduces basic mathematical operations and accessing object fields.
*/
import java.util.*;
class Company
{
	private String companyName;
	private int revenue;
	private int expense;
	
	public void setName(String n)
	{
		this.companyName=n;
	}
	public String getName()
	{
		return companyName;
	}
	public void setRevenue(int r)
	{
		this.revenue=r;
	}
	public int getRevenue()
	{
		return revenue;
	}
	public void setExpense(int e)
	{
		this.expense=e;
	}
	public int getExpense()
	{
		return expense;
	}
	public int P()
	{
		int profit=revenue-expense;
		return profit;
	}
		
	
}
class CalP
{
	Company[] c;
	public void profit(Company[] c)
	{
		this.c=c;
		for(int i=0; i<c.length; i++)
		{
			//c[i]=new Company();
			int profit=c[i].P();
			double PM=((double)profit/(double)c[i].getRevenue())*100;
			System.out.println(PM);
		}
	}
	
}

public class CompanyProfitMargin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Company obj1=new Company();

		System.out.println("ENter the size:");
		int n=sc.nextInt();

		Company cmp[]=new Company[n];
		for(int i=0; i<cmp.length; i++)
		{
			System.out.println("ENter the Name of Company");
			String name=sc.next();
			cmp[i]=new Company();
			System.out.println("ENter the revenue");
			int r=sc.nextInt();
			System.out.println("ENter the Expense");
			int e=sc.nextInt();
			
			cmp[i].setName(name);
			cmp[i].setRevenue(r);
			cmp[i].setExpense(e);

		}
		CalP obj=new CalP();
		obj.profit(cmp);
		
				
		
		
	}
}

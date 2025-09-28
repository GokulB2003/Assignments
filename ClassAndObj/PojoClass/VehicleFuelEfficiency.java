/*8. Vehicle Fuel Efficiency
Task:
 Create a Vehicle class with fields: model, mileage, and fuelCapacity.
 In the main method:
Create a Vehicle object.
Calculate how far the vehicle can travel (mileage * fuelCapacity) and print the result.
Explanation:
 This reinforces using object fields for calculations.
*/
import java.util.*;
class Vehicle
{
	private String model;
	private int mileage;
	private int fuelCapacity;  
	public void setModel(String m)
	{
		model=m;
	}
	public String getModel()
	{
		return model;
	}
	public void setMileage(int n)
	{
		mileage=n;
	}
	public int getMileage()
	{
		return mileage;
	}
	public void setFuel(int f)
	{
		fuelCapacity=f;
	}
	public int getFuel()
	{
		return fuelCapacity;
	}
}
class Calculate
{
	Vehicle[] v;
	public void set(Vehicle[] v)
	{
		this.v=v;

		for(int i=0; i<v.length; i++)
		{
			System.out.println(v[i].getModel()+" "+"vehicle can be travel distance:"+(v[i].getFuel()*v[i].getMileage()));
		}
	}
	
}

public class VehicleFuelEfficiency
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Vehicles:");
		int n=sc.nextInt();
		Vehicle[] v=new Vehicle[n];
		for(int i=0; i<v.length; i++)
		{
			v[i]=new Vehicle();
			System.out.println("Enter the model");
			String m=sc.next();
			v[i].setModel(m);
			System.out.println("Enter the mileage");
			int ml=sc.nextInt();
			v[i].setMileage(ml);
			System.out.println("Enter the fuelCapacity of"+v[i].getModel()); 
			int capacity=sc.nextInt();
			v[i].setFuel(capacity);
			
		}
		Calculate obj=new Calculate();
		obj.set(v);
		
		
		

		
	}
}
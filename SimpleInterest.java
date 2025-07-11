// Write a java program to calculate the simple intrest.

public class SimpleInterest{
public static void main(String args[]){
System.out.println("Enter the value of the Profit,rate and time");
float principle=Float.parseFloat(args[0]);
float rate=Float.parseFloat(args[1]);
float time=Float.parseFloat(args[2]);
float Interest=(principle*rate*time)/100;
System.out.println("SimpleInterest is:"+Interest);
float total=(principle+Interest);
System.out.println(total);

}
}
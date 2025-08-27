public class MinToHrs{
public static void main(String args[]){
int min=Integer.parseInt(args[0]);
int Hrs=min/60;
int HrsTomin=min%60;
System.out.println("the hours is"+Hrs);
System.out.println("the min is:"+HrsTomin);


}
}
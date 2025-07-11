public class CalMarks{
public static void main(String args[])
{
double Marathi=Double.parseDouble(args[0]);
double English=Double.parseDouble(args[1]);
double hindi=Double.parseDouble(args[2]);
double urdu=Double.parseDouble(args[3]);
double bio=Double.parseDouble(args[4]);
double total=(Marathi+English+hindi+urdu+hindi+bio);
double totalM=500;
System.out.println("total sub marks is"+total);
double percentage=(total/totalM)*100;
System.out.println("total percentage"+percentage);

}
}
/*
The task is to find how many two-wheelers as 
well as four-wheelers need to manufacture as per the given data.
Example :
Input : • 200 -> Value of V
• 540 -> Value of W
Output : • TW =130   FW=70
Explanation: 130+70 = 200 vehicles (70*4)+(130*2)= 540 wheels
*/

import java.util.*;
public class Vehicles{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int v=sc.nextInt();
int w=sc.nextInt();
int fv=w/4;
System.out.println(fv);
int tw=fv*2;
int tt=w-tw;
double fww=(double)tt/4.0;
System.out.println(fww);

}
}
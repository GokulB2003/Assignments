/*Q21.  Write a java program to check Number Is Prime Number or Not.
Example : A prime number is a number that can only be divided by itself and 1 without remainders.The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
*/
import java.util.*;
public class CheckPrime{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
boolean flag=false;
int i=2;
while(i<n) 
{
     /*if(i==n)
      {
       ++i;
      }*/
    if((n%i)==0)//
     {
     flag=true;
	break;
     }
     i++;
    
}
if(flag==false){
    System.out.println("Prime"); 
     }
else{
System.out.println("Not prime");
}

  }
}
/*
n= Total no of Monkeys
k= Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than k Bananas)
j = Number of eatable Peanuts by single Monkey(Monkey that jumped down last may get less than j Peanuts)
m = Total number of Bananas
p = Total number of Peanuts
Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility of k and j having a value zero.
Example : Input Values 20  2  3  12  12
    Output Values Number of Monkeys left on the tree : 10

*/

import java.util.*;
public class Monkey{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of Monkeys");
int n=sc.nextInt();

System.out.println("Number of eatable Bananas by Single Monkey");
int k=sc.nextInt();

System.out.println("Number of eatable Peanuts by single Monkey");
int j=sc.nextInt();

System.out.println("Total number of Bananas");
int m=sc.nextInt();

System.out.println("Total number of Peanuts");
int p=sc.nextInt();

int totalB=(m/k);
int totalP=(p/j);
int total=totalB+totalP;

int totalNo=n-total;
System.out.println("Number of Monkeys left on the tree:"+totalNo);

}
}
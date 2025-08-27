/*MCQ*/
 //What will be the output of the following code?
import java.util.*;
public class MCQ{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);



 /*int a = 10, b = 5;
System.out.println(a + b * 2);
A) 30
 B) 20
 C) 25
 D) 10*/

/*int a = 5;
  a += 5 * 2;
  System.out.println(a);
*/


/*int x = 7;
System.out.println(x > 5 && x < 10);
output:true;
*/


/*int a = 5;
System.out.println((a * 2) == 10);
output=true;*/


/*int x = 10;
x -= 3 + 2;
System.out.println(x);*/

/*int a = 3;
a *= 2 + 1;
here we simply first add 2+1=3 then its stores in the a variable and then a=3*3=>9;
System.out.println(a);*/

/*int a = 10;
boolean b = (a % 2 == 0);
System.out.println(b);
//output:true;
*/

/*int x = 6;
System.out.println(x++ == 6 && ++x == 8);
//here x==6 is true and then we simply increse the x++=7 and compare then again ++ so x=8 and here x=8 so its becomes true */
/*


int a = 8;
System.out.println(a / 4 == 2 || a * 2 == 10);
//here we simply check only one condition i.e if(a/4==2) i.e true so its true;
*/

/*int x = 5;
x = x++ + ++x;
System.out.println(x);
*/
//5+7=12


/*int a = 3, b = 7;
System.out.println(a == b || b > a);
//true
*/

/*int a = 6;
boolean result = !(a < 5);
System.out.println(result);
//true;
*/

/*int x = 9;
System.out.println((x % 2 == 0) ? "Even" : "Odd");
//Odd
*/
/*
int a = 5, b = 3;
System.out.println((a > b) && (a + b > 10));
//false
*/


/*int x = 4;
x = x-- - --x;
System.out.println(x);
//4 --=>4-(x=3) then again 1 minus=2
*/

/*int x = 2;
System.out.println(++x * 3);
//for ++x :x=>3 then 3*3=9

int a = 12;
System.out.println((a > 10) && (a < 15));
//here we simply check 12>10=>true && 12<15=>true so output=true;
*/


 
//we simply first multiply b with 2 and then add this result into a



/*int x = 10;
x += x++ + ++x;
System.out.println(x);
//here x=10 then 10+then 10+then increse the value by 1=11 and again preincremnt+1=>10+12 then add x i.e+10=>32;
*/

/*int x = 4, y = 2;
System.out.println((x * y == 8) && (x / y == 2));//true*/


/*1. What is the result of 5 & 3 in Java?
//System.out.println(5&3);

5=0101
3=0011
______
  0001=>1
*/

/*What does the | operator do?
=>
bitwise OR
The | operator performs a bitwise OR operation on its operands. This means it compares the corresponding bits of two numbers and sets the resulting bit to 1 if at least one of the bits in the operands is 1. If both corresponding bits are 0, the resulting bit is 0. 
*/


//System.out.println(~0);
/* What is the output of ~0?
=>output:-1
The integer 0 in binary (assuming a 32-bit integer) is represented as: 00000000 00000000 00000000 00000000.
The bitwise NOT operator (~) inverts all the bits. So, ~0 would become: 11111111 11111111 11111111 11111111.
In two's complement representation, this binary value represents the integer -1.
*/

//System.out.println(4<<1);
/*4. What is the result of 4 << 1?
output:8
in memory 4=>0100 then we simply do left shift by 1 means we simply add 1 zero in right so it becomes=>1000=>8
*/

/*Which operator is used for unsigned right shift in Java?
unsigned right shift in Java is >>>.
=>It always fills the newly vacated leftmost bits with 0s, regardless of whether the original number was positive or negative.

signed right shift is >>.
=>For positive numbers, it fills the newly vacated leftmost bits with 0s.
For negative numbers, it fills the newly vacated leftmost bits with 1s (replicating the sign bit).
*/


//System.out.println(6 | 3);
/*What is the binary result of 6 | 3?
6= 0110
3= 0011
_________
   0111=>7
*/


//System.out.println(10 ^ 5);
/*What is the result of 10 ^ 5 in Java
10=1010
 5=0101
________
   1111=>15
*/


//System.out.println(1 << 3);
/*
we can write 1 as 0001 then perform left shift of 3 means simply add 3 zero on right then=>1000 =>8 
*/

 /*Which bitwise operator is used to invert all bits?
=>~
*/
//System.out.println(-1 >>>1);
/*What is the result of -1 >>> 1 in Java (32-bit int)?
output:2147483647
*/

/*Bitwise operators can only be applied to which data types?
A) boolean
 B) floating-point
 C) integral types
 D) strings
=>Integral types, such as byte, short, int, long, char
*/

/*
. Which of the following is not a valid bitwise operator in Java?
 A) &
 B) |
 C) !
 D) ^
=>c)!
*/


//System.out.println(7&2);
/*What is the result of 7 & 2?
7=0111
2=0010
______
  0010=>2*/

/*int a = 8; 
System.out.println(a >> 2);*/
/* outputs:
 a=1000
 a>>2 here we perform right shift with 2 means we simply add 2 zeroes in left so 0010=>2
*/

/*
16. What is the output of System.out.println(~5);?
A) -6
 B) 6
 C) -5
 D) 5
output:-6
step1:convert this into binary of like 0000000 0000000 000000 00101
step2:apply not operator means take a not operator i.e 0->1 and 1->0
step3:1111111 1111111 1111111 11010   ->but its a negative number 
step4:if we want to print this negative number we need to calculate its 2's complement i.e 1's complement+1;
step5:1's complement -> 00000000 00000000 0000000 00101
						+     1
	_________________________________________________
						  00110=>6 i.e -6
*/
 int x = 10;
System.out.println((x > 5) && (x++ == 10) && (++x == 12));





}}
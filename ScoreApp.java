//19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.
import java.util.*;
public class ScoreApp{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks/score");
int score=sc.nextInt();
if(score>0 && score<50){
System.out.println("poor");
}
else if(score>=50 && score<75)
{
System.out.println("Average");
}
else if(score>=75 && score<90)
{
System.out.println("Good");
}
else{
System.out.println("Excellent");
}
}
}
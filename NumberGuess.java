/*

**4. Number Guessing Game**

**Description:**

* System generates a random number between 1–100.
* Use a do-while loop to let the user guess the number.
* If guess is too high or low, give a hint and **continue**.
* If the guess is correct, print "You guessed it!" and **break**.
---
*/
import java.util.*;
public class NumberGuess
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int min=1;
		int max=100;
		int randomNum;
		int guess;
		
		randomNum=(min + (int)(Math.random() * ((max - min) + 1)));
		System.out.println("System generated"+randomNum);

	    do
	     {
		System.out.println("Enter the Guess");
		guess=sc.nextInt();
		if(guess==randomNum)
		{
			System.out.println("You guess it");
			break;
		}
		else if(guess>randomNum)
		{
			System.out.println("guess is higher than random please guess small:");
			continue;
		}
		else
		{
			System.out.println("guess is less than random please guess High:");
			continue;	
		}
	    }
	while(true);
		
	}

}
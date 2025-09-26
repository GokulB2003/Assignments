/*4. Player High Score
Task:
 Create a Player class with fields: name and score.
 In the main method:
Create two individual Player objects.
Compare their scores and print the name of the player with the higher score.
Explanation:
 This helps to understand comparing fields between objects.
*/
import java.util.*;
class Player
{
	private String name;
	private int score;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setScore(int s)
	{
		this.score=s;
	}
	public int getScore()
	{
		return score;
	}
}
public class PlayerHighScore
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name of First player:");
		String p1=sc.next();
		System.out.println("Enter the name of First player:");
		String p2=sc.next();


		System.out.println("Enter the Score of First player:");
		int player1=sc.nextInt();
		System.out.println("Enter the Score of First player:");
		int player2=sc.nextInt();
		
		Player ply[]=new Player[2];
		Player obj1=new Player();
		obj1.setName(p1);
		obj1.setScore(player1);
		int a=obj1.getScore();

		Player obj2=new Player();
		obj2.setName(p2);
		obj2.setScore(player2);
		int b=obj2.getScore();
		if(a>b)
		{
			System.out.println("player with  Higher Score:"+obj1.getName());
		}
		else
		{
			System.out.println("player with  Higher Score:"+obj2.getName());
		}
				

		
	}
}
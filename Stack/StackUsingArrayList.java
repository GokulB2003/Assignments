import java.util.*;

public class StackUsingArrayList
{
	static class Stack
	{
		static ArrayList<Integer>list=new ArrayList<>();
		public static boolean isEmpty()
		{
			return list.size()==0;
		}
		public static int peek()
		{
			return list.get(list.size()-1);
		}
		public static void push(int data)
		{
			list.add(data);
		}
		public static int pop()
		{
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Stack.push(10);
		Stack.push(20);
		Stack.push(30);
		
		while(!Stack.isEmpty())
		{
			System.out.println(Stack.peek());
			Stack.pop();
			
		}

				
	}
}
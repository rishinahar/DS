package stack;

import java.util.Stack;

public class MinimumNumberOfBracketReversalsNeededToMakeAnExpressionBalanced {
	
	public static int minimumNumberOfBracketReversalsNeededToMakeAnExpressionBalanced (String a) 
	{
		int result =0;
		
		if (a.length()%2 !=0)
			return -1;
		
		Stack<Character> stack = new Stack();
		for (int i=0;i<a.length();i++)
		{
			char c = a.charAt(i);
            if (c =='}' && !stack.empty())
            {
                if (stack.peek()=='{')
                	stack.pop();
                else
                	stack.push(c);
            }
            else
            	stack.push(c);
		}
		
		int red_len= stack.size(); 
		int n=0;
		while (!stack.isEmpty() && stack.peek() == '{')
		{
			stack.pop();
			n++;
		}
		result = red_len/2 + n%2;
		return result;
	}

	public static void main (String args[]) 
	{
		 String expr = "}}{{";	
		System.out.println(minimumNumberOfBracketReversalsNeededToMakeAnExpressionBalanced(expr));
	}
}

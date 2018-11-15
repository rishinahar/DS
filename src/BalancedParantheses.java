import java.util.Scanner;


public class BalancedParantheses {
	public static void main (String a[]) 
	 { 
		char startOperand [] = {'[','{','(' };
		char endOperand [] = {')','}',']'};
		
		Scanner sc = new Scanner(System.in);
		String exp = sc.next();
		
		char  stack [] =  new char[exp.length()];
		  int top=-1;
		  Boolean result = true;
		  for (int i=0 ;i<exp.length();i++)
		  {
			  char operand = exp.charAt(i);
			  
			  if (operand =='['||operand =='{'||operand =='(')
				  {  
					  top++;
				      stack[top] =operand; 
					  
				  }
			  else if (top !=-1)
				  {
					  if (stack[top]== '[' && operand ==']')
					  {
						  top--;
					  }
					  else if (stack[top]== '{' && operand =='}')
					  {
						  top--;
					  }
					  else  if (stack[top]== '(' && operand ==')')
					  {
						  top--;
					  }
					  else 
					  { 
					     break;
					  }
				  }
		  }		  
    		while (top!=-1)
    		{
    			System.out.print(" "+stack[top]);
    			top--;
				result = false;

    		}
		  
		if (result)
			System.out.println("TRUE  ===>  "+"The expression has balanced paranthesis ...");
		else 
			System.out.println("FALSE  ===>  "+"The expression doesn't has balanced paranthesis ...");

	  }
}

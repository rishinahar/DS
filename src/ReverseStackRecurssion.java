
public class ReverseStackRecurssion {
	static int top;
	static int rear;
	public static void main (String a[]) 
	
	{
	   int stack [] = {9,8,7,6,5,4,3,2,1,0};
	    top = stack.length-1;
	    rear = stack.length-1;
	   pop(stack,top);
	   while (top != -1)
	    {
		 System.out.print(stack[top--]);   
	    }
	}
	static void pop (int stack[] ,int top)
	{   int temp =0;
	     if (top ==-1)
	    	 return ;
		  
	     else 
	     {	 
	       temp = stack [top];
		   top--;
		   pop (stack , top );
	     } 
	     pushatEnd(stack ,temp);
		   

	     
	}
	static void pushatEnd(int stack[] ,int temp)
	{
		stack[rear] = temp;
		rear--;
	} 
	
}

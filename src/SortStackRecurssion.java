
public class SortStackRecurssion {
	static int top;
	static int rear;
	static int max;
	public static void main (String a[]) 
		
		{
		   int stack [] = {-3,14,18,-5,30};
		    top = stack.length-1;
		    rear = top;
		    max= top;
		   reverse(stack,top);
		   while (top != -1)
		    {
			 System.out.print(stack[top--]+" ");   
		    }
		}
	public static void reverse(int stack[] ,int top)
		{
			int temp =0;
		     if (top ==-1)
		    	 return ;
			  
		     else 
		     {	 
		       temp = stack [top];
			   top--;
			   reverse (stack , top);
		     } 
		      top = pushatEnd(stack ,temp);
		     int tswap =top ;
		     while(tswap < max)
		     {
		    	 if (stack[tswap] >stack[tswap+1])
		    	   {
		    		 int stemp = stack[tswap];
		    		 stack[tswap] = stack[tswap+1];
		    		 stack[tswap+1] = stemp;
		    	   }
		    	 tswap++;
		     }
		     
		}
	static int pushatEnd(int stack[] ,int temp)
	{
		stack[rear] = temp;
		rear--;
		return rear+1;
	} 
}

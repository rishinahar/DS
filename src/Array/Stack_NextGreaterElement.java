 package Array;

import java.util.Stack;


public class Stack_NextGreaterElement {
	int top =-1;
	//static int inarray[] = { 4 , 3, 8 ,6, 7}; 
	 static int inarray[] = { 4 , 5, 2 ,25}; 
	  //static int inarray[] = {11, 13, 21, 3};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//printNextGreaterElement(inarray);
		printNGE(inarray);
		System.out.println();
		getNGE(inarray);
	}
		
	// O(N) Solution
	public static void getNGE(int[] a) {
	    Stack<Integer> s = new Stack<Integer>();
	    s.push(a[0]);

	    for (int i = 1; i < a.length; i++) 
	    {
             if (s.peek() != null) 
             {
	    		while (true) 
	    		{ 
	    			if (s.isEmpty() || s.peek() > a[i]) 
	    		       { 
	    				 break; 
	    				} 
	    			
	    		    if(!s.isEmpty()) 
	    			   System.out.println(s.pop() + ":" + a[i]); 
	    		 } 
	    	  } 
	    	  s.push(a[i]); 
	    	
	     } 
	    	
	    	while (!s.isEmpty() && s.peek() != null) 
	    	{
	    		System.out.println(s.pop() + ":" + -1); 
	    	} 
	    	
	    }
	
	
	// O(N^2) Solution

	static void printNGE(int a[])
	{
		
		
		for (int i=0; i< a.length;i++)
		{
			int next =-1;
			for (int j=i+1; j<a.length;j++)
			{
				if (a[i]<a[j])
				{
					next = a[j];
					break;
				}
			}
			System.out.println("NGE of " + a[i] + " is = " + next);
		}
		
		
	}
	
	/*static void printNextGreaterElement (int a[] )
	{ 
		int ax[] = new int[a.length] ;
		int top =-1;
		for (int i =0; i< a.length; i++)
		{  int nxg = -1;
		if ( i+1 < a.length)
		{
			if (a[i+1] > a[i] )
			{
				nxg = a[i+1];
				while (top !=-1)
				{   
					if (ax[top]< nxg)
					{
						System.out.println("Next greater element for " + ax[top] +"--->> " + nxg);
						top--;
					}
					else
						break;
				}
				if (top == -1)
					System.out.println("Next greater element for " + a[i] +"--->> " + a[i+1]);
			} 
			else if (a[i+1]<a[i])
			{   top++;
			ax[top] =a[i];
			top++;
			ax[top] = a[i+1];
			}
		}	
		}
		System.out.println("Next greater element for "+a[a.length-1]+"--->> " + -1);
		while (top !=-1)
		{  if (a[top] < a[a.length-1])

		{
		 	System.out.println("Next greater element for "+ax[top]+"--->> " + -1);
			top--;
		}  
		else
		{
			System.out.println("Next greater element for "+ax[top]+"--->> " + -1);
		    top--;
		}
		}
		} */
	
	// not working
	static void printNextGreaterElement (int a[] )
	{ 
		int ax[] = new int[a.length] ;
		int top =-1;
		for (int i =0; i< a.length; i++)
		{  int nxg = -1;
		if ( i+1 < a.length)
		{
			if (a[i+1] > a[i] )
			{
				nxg = a[i+1];
				while (top !=-1)
				{   
					if (ax[top]< nxg)
					{
						System.out.println("Next greater element for " + ax[top] +"--->> " + nxg);
						top--;
					}
					else
						break;
				}
				if (top == -1)
					System.out.println("Next greater element for " + a[i] +"--->> " + nxg); // Repeat two accomodate 2nd data source
			} 
			else if (a[i+1]<a[i])
			{   top++;
			ax[top] =a[i];
			top++;
			ax[top] = a[i+1];
			}
		}	
		}
		if (top !=-1)
		{
		if (ax[top]== a[a.length-1])
		 { System.out.println("Next greater element for "+ax[top]+"--->> " + -1);
		  top--;
		 }
		else
		    System.out.println("Next greater element for "+ax[top]+"--->> " + -1);
		}
		while (top !=-1)
		{  if (a[top] < a[a.length-1])

		{
		 	System.out.println("Next greater element for "+ax[top]+"--->> " + -1);
			top--;
		}  
		else
		{
			System.out.println("Next greater element for "+ax[top]+"--->> " + -1);
		    top--;
		}
		}
 }
}	
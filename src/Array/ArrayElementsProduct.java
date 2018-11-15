package Array;

import java.util.Arrays;

public class ArrayElementsProduct {
	
	public static void main(String[] args) {
	    
		int a [] = {1, -4, 1, 4}; 
				
		
		int b [] = new int[a.length];
		  int zeroCount =0;
		  int product=1;
		  for (int i=0;i<a.length;i++ )
		  {
		    if (a[i]==0)
		    {
		      zeroCount++;
		    }
		   else
		   {
		     product = product*a[i]; 
		   }
		  }
		 
		 for (int j=0;j<a.length;j++ )
		  { 
			if(zeroCount == 0)
			{
				 b[j]= product/a[j];
			}
		    
			else if (zeroCount == 1)
		   {
				if (a[j]==0 )
			    {
			      b[j]= product;
			    }
				else
				{
					b[j]= 0;
				}
		   } 
			else
				b[j]= 0;
		  }	
		 System.out.println(Arrays.toString(b));
	}	
}

package Array;

import java.util.Arrays;
import java.util.HashMap;

public class MaximumLengthOfSubArrayThatContainsEqualNumberOfZeroAndOne {
    
	public static int MaxSubArrayLength (int a[])
	{
		int b[] =a.clone();
		
		for (int i=0; i< b.length;i++)
		{
			if (b[i] == 0)
				b[i] = -1;
		}
		
		HashMap hm = new HashMap();
		
		    int sum = 0;      // Initialize sum of elements
	        int max_len = 0;  // Initialize result
	 
	        // Traverse through the given array
	        for (int i = 0; i < b.length; i++)
	        {
	            // Add current element to sum
	            sum += b[i];                                                                                                                                                                                                                                                                                                                            
	 
	            if (b[i] == 0 && max_len == 0)
	                max_len = 1;
	 
	            if (sum == 0)
	             max_len = i+1;
	 
	            // Look this sum in hash table
	            Integer prev_i = (Integer) hm.get(sum);
	 
	            // If this sum is seen before, then update max_len
	            // if required
	            if (prev_i != null)
	               max_len = Math.max(max_len, i-prev_i);
	            else  // Else put this sum in hash table
	               hm.put(sum, i);
	        }
	 
	        return max_len;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int  b = 10;	
      int a[] = new int [b];
      
      for (int i = 0; i <b; i++)
      {
    	  a[i] = (int) Math.round( Math.random());
      }
      System.out.println(Arrays.toString(a));
      System.out.println(MaxSubArrayLength(a));
      
	}

}

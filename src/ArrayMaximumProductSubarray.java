
public class ArrayMaximumProductSubarray {
	
	//Given an array that contains both positive and negative integers, 
	//find the product of the maximum product subarray.
	
	public static void main(String[] args) {
	
		int ar[] = {2, 3, -4, 5, 6, 1 };
		int a ,b =0;
		int pos_product=ar[0];
		int neg_product=ar[0];
		int max_product =ar[0];
		for (int i=1;i<ar.length;i++)
		{
			a = pos_product * ar[i];
			b = neg_product * ar[i];
			
			pos_product = Math.max(Math.max(a,b),ar[i]);
			neg_product = Math.min(Math.min(a,b),ar[i]);
			max_product = Math.max(max_product,pos_product);
		}
	  
		
		  /* Returns the product of max product subarray. 
   Assumes that the given array always has a subarray
   with product more than 1 */
/*int maxSubarrayProduct(int arr[], int n)
{
    // max positive product ending at the current position
    int max_ending_here = 1;
 
    // min negative product ending at the current position
    int min_ending_here = 1;
 
    // Initialize overall max product
    int max_so_far = 1;
 
     Traverse through the array. Following values are
       maintained after the i'th iteration:
       max_ending_here is always 1 or some positive product
                       ending with arr[i]
       min_ending_here is always 1 or some negative product 
                       ending with arr[i] 
    for (int i = 0; i < n; i++)
    {
         If this element is positive, update max_ending_here. 
           Update min_ending_here only if min_ending_here is 
           negative 
        if (arr[i] > 0)
        {
            max_ending_here = max_ending_here*arr[i];
            min_ending_here = min (min_ending_here * arr[i], 1);
        }
 
         If this element is 0, then the maximum product 
           cannot end here, make both max_ending_here and 
           min_ending_here 0
           Assumption: Output is alway greater than or equal 
                       to 1. 
        else if (arr[i] == 0)
        {
            max_ending_here = 1;
            min_ending_here = 1;
        }
 
         If element is negative. This is tricky
           max_ending_here can either be 1 or positive. 
           min_ending_here can either be 1 or negative.
           next min_ending_here will always be prev. 
           max_ending_here * arr[i] next max_ending_here
           will be 1 if prev min_ending_here is 1, otherwise 
           next max_ending_here will be prev min_ending_here *
           arr[i] 
        else
        {
            int temp = max_ending_here;
            max_ending_here = max (min_ending_here * arr[i], 1);
            min_ending_here = temp * arr[i];
        }
 
        // update max_so_far, if needed
        if (max_so_far <  max_ending_here)
          max_so_far  =  max_ending_here;
    }
 
    return max_so_far;
}
*/		 
		
		
	/*	not a valid anwser
	    int max_curn = 1;
		int max  = 1;
		int max_i =0;
		int max_j =0;
		int result = 0;
		
		for (int i=0;i<ar.length;i++)
		  {
			
		     if (max_curn == 0)
		      {
		    	 max_curn= ar[i];
		    	 
		      }
		     else 
		      {
		    	 max_curn *= ar[i];
		    	 max_j=i;
		      }
		     if (max_curn>max)
		      {
		    	 max = max_curn;
		      }
		     if(max_curn<0)
		 		 max_j =i;
		     if(max_curn>0)
		 		 max_j =i;

		  }
		*/
		System.out.println("The Maximum Product of contiguous subarray is "+max_product);

	}

}

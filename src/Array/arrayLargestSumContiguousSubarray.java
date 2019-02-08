package Array;

public class arrayLargestSumContiguousSubarray {
	public static void main (String a[])  

	{
		
	    int ar[] = {1,2,3,4,-5,6};

//    int ar[] = {-2, -3, 4, -1, -2, 1, 5, -3};
	int max_curn = Integer.MIN_VALUE;
	int max  = Integer.MIN_VALUE;
	int max_i =0;
	int max_j =0;
	
	for (int i=0;i<ar.length;i++)
	  {
		
	     if (max_curn < 0)
	      {
	    	 max_curn= ar[i];
	    	 max_i =i;
	      }
	     else 
	      {
	    	 max_curn += ar[i];
	      }
	     if (max_curn>max)
	      {
	    	 max = max_curn;
	    	 max_j=i;
	      }
	  }
	System.out.println("The largest sum of contiguous subarray is "+max);
	System.out.println("The index of largest sum of contiguous subarray is "+max_i + "to "+max_j);

	
	}
}

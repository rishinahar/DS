	
public class MaximumSumInTheConfiguration {

	public static int rotateSum (int b[] , int i)
	{  
		int a[] = b.clone();
		int sum = 0;
		
		while (i!=0)
		 { 
			int last = a[a.length-1];
			int current =0;
			for (int j =a.length-1; j>=0;j--)
			{
					 current = a[j];
					  a[j] = last;
					  last = current;
			}
				a[a.length-1] = current;
				i--;
		 }
		
		for (int j =0; j<a.length;j++)
			sum += a[j]*j;
	  
		return sum ;
	}
	
	public static int  maxSumInTheConfiguration(int a[])
	{  int maxSum =0; 
		for (int i =0 ; i<a.length; i++)
		{
			int tempSum = rotateSum(a , i+1);
			System.out.println(" tempsum " + tempSum);
			if (tempSum > maxSum)
				maxSum = tempSum;
		}
		return maxSum;
	}
	
	 // O(N) Solution
	static int maxSum(int arr[], int n)
	{
	    // Compute sum of all array elements
	    int cum_sum = 0;
	    for (int i=0; i<n; i++)
	        cum_sum += arr[i];
	 
	    // Compute sum of i*arr[i] for initial
	    // configuration.
	    int curr_val = 0;
	    for (int i=0; i<n; i++)
	        curr_val += i*arr[i];
	 
	    // Initialize result
	    int res = curr_val;
	 
	    // Compute values for other iterations
	    for (int i=1; i<n; i++)
	    {
	        // Compute next value using previous value in
	        // O(1) time
	        int next_val = curr_val - (cum_sum - arr[i-1])
	                       + arr[i-1] * (n-1);
	 
	        // Update current value
	        curr_val = next_val;
	 
	        // Update result if required
	        res = Math.max(res, next_val);
	    }
	 
	    return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[] = {8,3,1,2};
     
     System.out.println(maxSumInTheConfiguration(a));
     System.out.println(maxSum(a,a.length));

     
	}

}

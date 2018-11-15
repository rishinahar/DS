package Array;


public class SubarrayWithGivenSum {

	public static void main (String a[])  

	{
		int arr[] = {1 ,2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 55;
		int n= arr.length;
		 int curr_sum = arr[0], start = 0, i;
		 
		    /* Add elements one by one to curr_sum and if the curr_sum exceeds the
		       sum, then remove starting element */
		    for (i = 1; i <=n; i++)
		    {
		        // If curr_sum exceeds the sum, then remove the starting elements
		        while (curr_sum > sum && start < i-1)
		        {
		            curr_sum = curr_sum - arr[start];
		            start++;
		        }
		 
		        // If curr_sum becomes equal to sum, then return true
		        if (curr_sum == sum)
		        {   int p = i-1;
		    		System.out.println(" The sub array with given sum index is  " + start +" to "+ p); 
		            return ;
		        }
		 
		        // Add this element to curr_sum
		        if (i < n)
		          curr_sum = curr_sum + arr[i];
		    }  
		    System.out.println("No such subarray for the given sum");
		// Brute force 0(n^2)
	/*	int csum = 0;
		int i , j=0;
		Boolean flag = false;
		for ( i =0 ; i<ar.length; i++)
		 {  csum = 0;
			for ( j =0 ; j<ar.length; j++)
			  {
				 csum +=ar[j];
				 if (csum == sum )
					 { flag = true;
					   break;
					 }
			   }
			if (flag)
				break;
		 }
		if (flag)
		System.out.println(" The sub array with given sum index is  " + i +" -"+j); */
 }
}
import java.util.Arrays;
import java.util.Collections;


public class MaximumSumIncreasingSubsequence {
	
	public static void main (String a[])  
	{
	  
		//int arr[] = {1,101, 2, 3, 100 ,4, 5};	
		//int arr[] ={10,5,4,3};
		int arr[] = new int [5];	
		for (int n =0 ; n<arr.length; n++)
		   { 
			arr[n] = (int) (Math.random() * ( 100 ));
		   }
		int sumarr[] = arr.clone();
		int max = sumarr[0];
	    for (int i=1; i<arr.length;i++)
	     {
		    for (int j=0; j<i;j++)
		     {
		    	if (arr[j]<arr[i])
		    	  {
		    		sumarr[i]= Math.max(sumarr[i], sumarr[j] + arr[i]);
		    		
		    	  }
		     }
	     }
	    for (int i=1; i<sumarr.length;i++)
	      {
	    	if (sumarr[i]>max)
	    		max =sumarr[i];
	      }
		/* 
		int sumarr[] =  new int[arr.length];
	     int maxsum =arr[0];
	     int j=0;
	     int sum=arr[0];
	    for (int i=1; i<arr.length;i++)
	     {
	    	if (arr[i-1]<arr[i])
	    	{
	    		sum = sum+ arr[i];
	    		sumarr[j] = sum;
	    		j++;
	    		if (sum> maxsum)
	    			maxsum = sum;
	    	}
	    	else 
	    	 {
	    		sum = sum - arr[i-1]+arr[i];
	    		sumarr[j] = sum;
	    		j++;
	    		if (sum> maxsum)
	    			maxsum = sum;
	    	 }
	     }*/
	    System.out.println("The input array is."+Arrays.toString(arr));
	    System.out.println("The sum of maximum sum sequence of the given array."+max);
	    System.out.println(Arrays.toString(sumarr));
	}
}

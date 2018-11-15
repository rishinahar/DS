import java.util.Arrays;


public class Sumoftwonumbersrepresentedasarrays {

	public static void main (String a[])  
	{
		//int a1[] = {2, 2, 7, 5, 3, 3, 7, 3, 3, 6, 8, 3, 0, 5, 0 ,6};
		int a1[] = {4,3,3,8,9};
		int a2[] = {4,3,3,8};
		int sumarr [] ;
		int carry =0;
		int i=a1.length-1;
		int j=a2.length-1;
		int k=0;
		 if (i>j)
		   {
		    	k=i;
		    	sumarr = new int[k+1];
		   }
		 else 
		  {	
			 k=j;
	    	 sumarr = new int[k+1];
		  }
		while (i>-1||j>-1)
		 {
			int sum =0;
			if (j>=0)
			   sum = a1[i]+a2[j] +carry;
			else
				sum = a1[i]+carry;
			carry =0;
			if (sum >10)
			 {
				sum = sum-10;
				carry = carry+1;
			 }
			sumarr[k] =sum;
			k--;
			i--;
			j--;
		 }
	System.out.println("The sum array is "+ Arrays.toString(sumarr));	
	}
}

import java.util.Arrays;


public class ArrayGreaterOnRightSide {
	public static void main (String a[])  

	{
		int arr[] = {2 ,11, 1,9};
	    int b[] = new int[arr.length];
        int max =-1;
        int j = 0;
	    for (int i=arr.length-1 ; i>=0;i--)
	      {
	    	   	
	    	if (arr[i]> max)    	
	    	{
	    		max= arr[i];
	    		b[j]= -1;
	    	}
	    	else  
	    		b[j]= max;
        	j++;
	      }
	     for (int k=j-1 ; k>=0;k--)
	      {
	    	 System.out.print(" "+b[k]);
	      }	 

	}
	
}

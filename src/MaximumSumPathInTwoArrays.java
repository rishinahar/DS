
public class MaximumSumPathInTwoArrays {
    
	static int maxPathSum(int ar1[], int ar2[])
    {
        int result = 0;
		
        if (ar1.length == 0 && ar2 .length !=0)
        	return ar2.length;
        if (ar1.length != 0 && ar2 .length ==0)
        	return ar1.length;
        
        int i = 0;
        int j = 0;
        
        while (i<ar1.length && j < ar2.length)
        {
        	if (ar1.length<= ar2.length)
        	 {
        		if (ar1[i] == ar2[j])
        		{
        			int tempRes = ar2.length-1 + i+1 - j;
        			
        			if (tempRes > result)
        				result = tempRes ;
        			i++;
        			j++;
        		}
        		else if (ar1[i] < ar2[j]) 
        			  i++;
        		else
        			j++;
        	 }
        	else 
        	{
        		if (ar1[i] == ar2[j])
        		{
        			int tempRes = ar1.length-1 + j+1 - i;
        			
        			if (tempRes > result)
        				result = tempRes ;
        			i++;
        			j++;
        		}
        		else if (ar1[i] < ar2[j]) 
        			  i++;
        		else
        			j++;
        		
        	}	
        }
        
		return result ;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int ar1[] = {5,8,9,10,12};
      int ar2[] = {1,5,7,8};
      
      System.out.println( "Max path for giveen two subaarays is " + maxPathSum(ar1,ar2));
	}

}

import java.util.ArrayList;
import java.util.Arrays;


public class FirstMissingInteger {
	/*public static int firstMissingPositive(ArrayList<Integer> a) {
	
		int size = a.size();
		int temp =0;
		int low = a.get(0);
		int sum = 0;
		int max = a.get(0);
		int count = 0;
		int result = 1;
		for (int i=0 ; i< size ;i++)
		  {
		     int num = a.get(i);
			  
		     if (num < 0)
		     {
		    	 result =1;
 		     }
		     if (num >=0)
		     {  
		    	 if (num <low)
		    	 {
		    		 low = num;
		    	 }
		    	 if (num > max)
		    	 {
		    		 max = num;
		    	 }	 
	    		 sum = sum +num;
                 count++;
		     } 	 
		  }
		if (count <size && count >0)
			{
				
				low = low-1;
				int sumofmax = max*(max+1)/2;
				int sumoflow = low*(low+1)/2;
				int arraysum = sumofmax-sumoflow;
			    result = arraysum -sum;
				return result; 
			}
		else if(count ==0)
			{
				return result;
			}
		else 
		   {    result = max+1;
				return result;
			}
	} */
	
	/*public static int firstMissingPositive(ArrayList<Integer> a) {
		int size = a.size();
		int result = 1;
		for (int i=0 ; i< size ;i++)
		   {
			  int temp = a.get(i);
		     
			  if (temp > 0 && temp <=size)
			    { 
				  a.add(temp-1, temp);
			    }
		   } 
		int j=1;
		for (int i=0 ; i< size ;i++)
		   { 
			int temp = a.get(i);
			  if (temp !=j)
			  {
				  return j;
			  }
			  j++;
		   }
		return result;
	}*/
public static int firstMissingPositive(ArrayList<Integer> A) {
	    
	    int n = A.size() + 1;
	    int count;
	    int idx = 0;
	    int size = A.size();
	    count = size - 1;
	    
	    for (idx = size - 1; idx >= 0; idx--) {
	        
	        int num = A.get(idx);
	        
	        if (num < 0) {
	            int val = A.get(count);
	            A.set(idx, val);
	            A.set(count, num);
	            count--;
	        }
	        
	    }
	    
	    for (idx = 0; idx <= count; idx++) {
	        
	        int num = A.get(idx);
	        
            num = Math.abs(num);
	        
	        if (num > 0 && num < n) {
	            
	            int index = num - 1;
	            int val = A.get(index);
	            A.set(index, -val);
	            
	        }
	        
	    }
	    
	    for (idx = 0; idx <= count; idx++) {
	        
	        int num = A.get(idx);
	        
	        if (num > 0) {
	            return idx + 1;
	        }
	        
	    }
	    
	    return idx + 1;
	    
	}
	
	public static void main (String a[]) 
	
	{
        ArrayList<Integer> arr = new ArrayList<Integer>();			
        arr.add(3);
        arr.add(4);
        arr.add(-1);
        arr.add(1);
			
        	System.out.println(firstMissingPositive(arr));
         int size = arr.size();
     	System.out.println("Arraylist is ----");

        	for (int i=0 ; i< size ;i++)
 		   {
 			  int temp = arr.get(i);
 	        	System.out.println(temp);
 		   } 
	}
}

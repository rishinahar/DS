import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;


public class duplicateinarray {
	
	void printRepeating(int arr[], int size)
    {
        int i;  
        System.out.println("The repeating elements are : ");
    
        for(i = 0; i < size; i++)
        {
            if(arr[Math.abs(arr[i])] > 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }         
    } 
	
	// function to find repeating elements
	void printRepeatingBetter( int arr[], int n)
	{
	    // First check all the values that are
	    // present in an array then go to that
	    // values as indexes and increment by
	    // the size of array
	    for (int i = 0; i < n; i++)
	    {
	        int index = arr[i] % n;
	        arr[index] += n;
	    }
	 
	    // Now check which value exists more
	    // than once by dividing with the size
	    // of array
	    for (int i = 0; i < n; i++)
	    {
	        if ((arr[i]/n) > 1)
	            System.out.println(i);
	    }
	}
	
	public int repeatedNumber(final List<Integer> a) {
	    HashMap hm = new HashMap<>();
	    int i=0;
	    int repeat =0;
		Iterator<Integer> ls  = a.iterator();
		while (ls.hasNext())
		{ 
			int temp = ls.next();
			if (hm.containsKey(temp))
			{  
				repeat = temp;
				return repeat;
			}
			else
				{
				hm.put(temp, i);
				i++;
				}
			
		
		}
		
		return repeat;
	}

}

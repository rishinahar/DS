package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class LargestNumberFormedFromAnArray {

	
	public static String  largestNumberFormedFromAnArray (int a[])
	{
		String result = "";
		
		int reqnum = 0;
		
		int tempMSBNUM = -1;
		int itemIndextreversed = -1;
		int count =0;
		
		while(count < a.length)
		{  
			for (int k=0 ; k< a.length; k++)
				{ 
					if (a[k] >0)
					{
						tempMSBNUM = largestofTwo(reqnum , a[k]);
						
						if(tempMSBNUM == a[k])
						 {
							reqnum = tempMSBNUM;
							itemIndextreversed = k;
						 }
					}
				    
				}
			 
			 count++;
			 a[itemIndextreversed] =-1;
			 result += reqnum;
			 reqnum = 0;
		}
		
		
		return result;
	}
	
	public static  int largestofTwo(int num1 , int num2)
	{      String nm1 = num1 +""+ num2;
		   String  nm2 = num2 +"" + num1;
		   
		   
		   int x  = Integer.parseInt(nm1);
		    
		   int y = Integer.parseInt(nm2);;
		   
		   if (x>y)
		   return num1;
		   else
		   return num2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[] ={ 1 , 9 ,54, 546, 548, 60, 60};
      
      System.out.println( largestNumberFormedFromAnArray(a));
      }

}

	 class GFG {
 
    // The main function that prints the 
    // arrangement with the largest value.
    // The function accepts a vector of strings    
    static void printLargest(ArrayList<String> arr){
     
        Collections.sort(arr, new Comparator<String>(){
 
        // A comparison function which is used by 
        // sort() in printLargest()
        @Override
        public int compare(String X, String Y) {
         
        // first append Y at the end of X
        String XY=X + Y;
         
        // then append X at the end of Y
        String YX=Y + X;
         
        // Now see which of the two formed numbers 
        // is greater
        return XY.compareTo(YX) > 0 ? -1:1;
    }
    });
         
    Iterator it = arr.iterator();
 
    while(it.hasNext())
        System.out.print(it.next());
     
    }
     
    // driver program
    public static void main (String[] args) {
         
    	ArrayList<String> arr;
        arr = new ArrayList<>();
         
        //output should be 6054854654
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        printLargest(arr);
        
        // output should be 777776
        /* arr.add("7");
        arr.add("776");
        arr.add("7");
        arr.add("7");
        */
         
        //output should be 998764543431
        /*arr.add("1");
        arr.add("34");
        arr.add("3");
        arr.add("98");
        arr.add("9");
        arr.add("76");
        arr.add("45");
        arr.add("4");
       */
    }
}
// This code is contributed by Shubham Juneja
	 
	
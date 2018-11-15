import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;


public class MedianOfInputStream {

	// O(N log(N)) Solution
    public static void addNumber(int number,PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers)
    {
    	if (lowers.size()==0 || number< lowers.peek())
    	{
    		lowers.add(number);
    	}else
    	{
    		highers.add(number);
    	}
    }
    
    public static void rebalance (PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers)
    {
    	PriorityQueue<Integer> biggerHeap  = lowers.size() > highers.size() ? lowers : highers; 
    	PriorityQueue<Integer> smallerHeap  = lowers.size() > highers.size() ? highers : lowers;
    	
    	if (biggerHeap.size() - smallerHeap.size() >=2)
    	{
    		smallerHeap.add(biggerHeap.poll());
    	}
     }
    
    public static double getMedians(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers)
    {
    	PriorityQueue<Integer> biggerHeap  = lowers.size() > highers.size() ? lowers : highers; 
    	PriorityQueue<Integer> smallerHeap  = lowers.size() > highers.size() ? highers : lowers;
    	if (biggerHeap.size() == smallerHeap.size() )
    	{
    		return (double )  (biggerHeap.peek() + smallerHeap.peek())  /2;
    	}else
    		return biggerHeap.peek();
    }
    
    public static double[] getMedian(Integer array[])
    {
    	// Sorted in Decreasing order
    	PriorityQueue<Integer> lowers =  new PriorityQueue<Integer>  (10, new Comparator<Integer>() {
    							public int compare(Integer a, Integer b) {
									return -1*a.compareTo(b);
								}
					    	});
    	
    	// Sorted in Increasing order
    	PriorityQueue<Integer> highers = new PriorityQueue<Integer>();
    	
    	double [] medians = new double [array.length];
    	
    	for (int i=0; i<array.length;i++)
    	{
    		int number = array[i];
    		addNumber(number,lowers,highers);
    		rebalance(lowers,highers);
    		medians[i] = getMedians(lowers,highers);
    		
    	}
    	return medians;  	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(" please enter the input stream , enter -1 to exit");
		Scanner sc = new Scanner(System.in);
		int num =0;
		while (num !=-1)
		{
		   num = sc.nextInt();
		   list.add(num);  
		}
		Integer [] streamArray = list.toArray(new Integer[list.size()]);
		double [] medians = getMedian(streamArray);
		
		for (int i=0;i<medians.length;i++)
			System.out.print(medians[i]+" ");
	}
    
	// O(N^2) Solution
	public static int insertionSortMedian(Integer array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }
        
        if ((array.length) %2 !=0)
         {
        	return array[(n-1)/2];
         }
        else
        {   int mid = (n-1)/2;
        	int median1 = array[mid];
        	int median2 =  array[mid+1];
        	return (median1+median2)/2;
        }
    }  
}


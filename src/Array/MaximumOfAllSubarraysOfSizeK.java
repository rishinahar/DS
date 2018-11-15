package Array;


import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;


public class MaximumOfAllSubarraysOfSizeK {
	public static void main(String[] args) {
		
		//int ar[]  ={1, 2, 3, 1, 4, 5, 2, 3, 6};
		int ar[]  ={8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		// int ar[] = {12, 1, 78, 90, 57, 89, 56};
		
		//for any k elements created a function
		System.out.println();
		printKMax(ar,ar.length,3);
	
	}
	
	// A Dequeue (Double ended queue) based method for printing maixmum element of
	// all subarrays of size k
	/*Time Complexity: O(n). It seems more than O(n) at first look. If we take a closer look, we can observe 
	 * that every element of array is added and removed at most once. So there are total 2n operations.
      Auxiliary Space: O(k)
     */ 


	static void printKMax(int arr[], int n, int k)
	{
	    // Create a Double Ended Queue, Qi that will store indexes of array elements
	    // The queue will store indexes of useful elements in every window and it will
	    // maintain decreasing order of values from front to rear in Qi, i.e., 
	    // arr[Qi.front[]] to arr[Qi.rear()] are sorted in decreasing order
		Deque<Integer> Qi = new LinkedList<>();;
	 
	    /* Process first k (or first window) elements of array */
	    int i;
	    for (i = 0; i < k; ++i)
	    {
	        // For very element, the previous smaller elements are useless so
	        // remove them from Qi
	        while ( (!Qi.isEmpty()) && arr[i] >= arr[(Qi).getLast()])
	             Qi.removeLast();  // Remove from rear
	 
	        // Add new element at rear of queue
	         Qi.addLast(i);
	    }
	 
	    // Process rest of the elements, i.e., from arr[k] to arr[n-1]
	    for ( ; i < n; ++i)
	    {
	        // The element at the front of the queue is the largest element of
	        // previous window, so print it
	        System.out.print(arr[Qi.getFirst()] +" ");
	 
	        // Remove the elements which are out of this window
	        while ( (!Qi.isEmpty()) && Qi.getFirst() <= i - k)
	            Qi.removeFirst();  // Remove from front of queue
	 
	        // Remove all elements smaller than the currently
	        // being added element (remove useless elements)
	        while ( (!Qi.isEmpty()) && arr[i] >= arr[Qi.getLast()])
	            Qi.removeLast();
	 
	         // Add current element at the rear of Qi
	        Qi.addLast(i);
	    }
	 
	    // Print the maximum element of last window
        System.out.println(arr[Qi.getFirst()] +" ");
	}
}

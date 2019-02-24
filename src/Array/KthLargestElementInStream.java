package Array;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElementInStream {
   
	/* For a given array kth largest element
	 * public int findKthLargest(int[] nums, int k) {
	    PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
	    for(int i: nums){
	        q.offer(i);
	 
	        if(q.size()>k){
	            q.poll();
	        }
	    }
	 
	    return q.peek();
	}
*/
	// For a input stream kth largest element
	public static int findKthLargest(int num, int k , PriorityQueue<Integer> q) {
	    
           // adds a new number in Priority  queues
	        q.offer(num);
	      
	        if(q.size()>k){
	            q.poll();
	        }
	 
	    return q.peek();
	}
	
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int k = 4;
	   
      PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
      int num ;
      do {   
           num  = sc.nextInt();
          System.out.println( "The "+k +"th largest element at this point is "+ findKthLargest(num , k , q));

      }while (num !=-1);
	}

}

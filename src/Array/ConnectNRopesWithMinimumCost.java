package Array;

import java.util.PriorityQueue;

public class ConnectNRopesWithMinimumCost {
	
	public static int connectNRopesWithMinimumCost (int a[])
	{     int sum =0;
	      PriorityQueue<Integer> q = new PriorityQueue<Integer>(a.length);
		
	      for (int x : a)
	      {
	    	  q.offer(x);
	      }
	      
	      while (q.size()>1)
	      {   
	    	  int  num1 = q.poll();
	          int  num2 = q.poll();
	    	  sum+= num1+num2;
	          q.offer(num1+num2);
	    	 
	      }
	      return sum;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //int a[] = {4,4, 3,3, 2,2, 6,6};
		int a[] = {4, 3, 2, 6};
       System.out.println(connectNRopesWithMinimumCost(a));
	}

}

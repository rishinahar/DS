package Array;

import java.util.Arrays;

public class FindTransitionPoint {
  
	public static int findTransitionPoint(int a[])
	{
		int result =-1;
		
		int start = 0; int end = a.length-1;
		int mid =0;
		
		while (start <= end)
		{
			mid = (start+end)/2;
			
			if(a[mid] == 0)
				start = mid+1;
			else if (a[mid] == 1)
				end = mid-1;
			
			if (a[mid] ==1 && a[mid-1] == 0)
				result = mid;
			
		}
		
		
		return result;
	}
	
	public static void main (String args[]){
		
		
	    int max_a = 10;
	    int a[] = new int[max_a];
		for (int i=0; i<max_a;i++)
			a[i] = (int) Math.round(Math.random());
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(findTransitionPoint(a));
		
	}
	
}

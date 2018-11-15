package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TripletSumInArray {
    
	public static boolean tripletSumInArray(int a[] , int sum)
	{  
		boolean result = false;
		int count = 0 ;
		
		HashMap<Integer, Integer> hm = new HashMap();
		
		// create a hashmap for given array counting number of occurence
		for (int i =0 ; i<a.length;i++)
		{
			if (hm.containsKey(a[i]))
			   hm.put(a[i], hm.get(a[i])+1);
			else
				hm.put(a[i], 1);
		}
		
		for (int i =0 ; i<a.length;i++)
		{
			for (int j =i+1 ; j<a.length;j++)
			{ 
			  int thirdNum = sum - (a[i]+a[j]);
				
			  if (hm.containsKey(thirdNum))
			    { 		
				  System.out.println( a[i]+" " + a[j]+ " " +thirdNum);

			    	if (a[i]==a[j])
				    {
						if (thirdNum == a[i])
							{
							   if (hm.get(thirdNum) == 3)
								   return true;
							}
						else 
							return true;
					}
				
					else if (thirdNum == a[i] || thirdNum == a[j])
					{
						if (hm.get(thirdNum) == 2)
							   return true;
					}
			    	
					else 
						return true;
			    	
			    }
		    }
		
		}
		
		return result;
	}
	
	
	
	public static void tripletSum(int a[], int sum) {
		
		
		Arrays.sort(a);
		System.out.println(java.util.Arrays.toString(a));
		int start =0;
		int end = a.length-1;
		
		
		for (int i=0;i<a.length;i++)
		{
			
			start = i+1;
			end = a.length-1;
			
			int requiredSum = sum-a[i];
			
			if(requiredSum<0)
			return ;
			
			while (start<end)
			{
				if (a[start]+a[end] == requiredSum)
					{
					  System.out.println(a[i]+","+a[start]+","+a[end] +" at indexes " +i+","+start+","+end);
					  start++;
					}
				
				else if(a[start]+a[end] > requiredSum)
				end--;
				
				else
					start++;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a[] = {9,4,4,6,5,4,9,12,18};
		
		int sum = 15;
		System.out.println(tripletSumInArray(a,sum));
		tripletSum(a,sum);

		
	}

}

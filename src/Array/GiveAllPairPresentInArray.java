package Array;

import java.util.HashMap;

public class GiveAllPairPresentInArray {
	
	public static void printAllUniquePairs (int nums[])
	{
		
		HashMap<Integer, Integer> hm  = new HashMap();
		for (int x : nums)
		{
			if (hm.containsKey(x))
			  {
				int value = hm.get(x);
				hm.put(x, value+1);

			   }
			else
				hm.put(x, 1);
		}
		
	}		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int nums [] = new int[10] ; 
		
		for (int i=0;i<10;i++)
		{
			nums[i] = (int)(Math.random()*100);
		}
		for (int x : nums)
			System.out.println(x);
	}

}

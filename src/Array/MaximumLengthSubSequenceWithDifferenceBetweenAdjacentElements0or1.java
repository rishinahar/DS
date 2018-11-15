package Array;

import java.util.HashMap;

// solution not working
public class MaximumLengthSubSequenceWithDifferenceBetweenAdjacentElements0or1 {

	public static void reduceHashMapKey(HashMap<Integer, Integer> map ,int key) 
	{
		if (map.containsKey(key)) {
			
		int KeyCount = map.get(key);

		if (KeyCount==1)
			map.remove(key);
		else
			map.put(key, KeyCount-1);
		
		}
	}
	public static int maximumLengthSubSequenceWithDifferenceBetweenAdjacentElements0or1 (int arr[]) 
	{
		int maxLength = Integer.MIN_VALUE;
		HashMap<Integer, Integer> arrayValues = new HashMap ();
		HashMap<Integer, Integer> arrayValues2 = new HashMap ();
		
		for (int x : arr)
			
		{
			if (arrayValues.containsKey(x))
			{
				arrayValues.put(x, arrayValues.get(x)+1);
				arrayValues2.put(x, arrayValues2.get(x)+1);
			}
			else {
				arrayValues.put(x, 1);	
				arrayValues2.put(x, 1);	
			}

		}
				
		for (int i=0; i<arr.length;i++)
		{
			int a = arr[i];
			int count =1;
					
			arrayValues = (HashMap<Integer, Integer>) arrayValues2.clone();
			
			reduceHashMapKey(arrayValues ,a);
			while(arrayValues.containsKey(a+1) || arrayValues.containsKey(a-1))
			{  
				if (arrayValues.containsKey(a+1)) {
					
					count++;
					reduceHashMapKey(arrayValues ,a+1);					
					a = a+1;
				}
				
				if (arrayValues.containsKey(a-1)) {
					
					count++;
					reduceHashMapKey(arrayValues ,a-1);
					a = a-1;
				}								
			}
			// update max Count;			
			maxLength = Math.max(count, maxLength);
		}
		return maxLength;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2, 5, 6, 3, 7, 6, 5, 8};
		
		System.out.println(maximumLengthSubSequenceWithDifferenceBetweenAdjacentElements0or1(arr));
	}

}

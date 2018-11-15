package Array;

public class MinimumElementInRotatedSortedArray {

	
	static int findMinRecursion(int arr[], int low, int high) 
    { 
        // This condition is needed to handle the case when array 
        // is not rotated at all 
        if (high < low)  return arr[0]; 
  
        // If there is only one element left 
        if (high == low) return arr[low]; 
  
        // Find mid 
        int mid = low + (high - low)/2; /*(low + high)/2;*/
  
        // Check if element (mid+1) is minimum element. Consider 
        // the cases like {3, 4, 5, 1, 2} 
        if (mid < high && arr[mid+1] < arr[mid]) 
            return arr[mid+1]; 
  
        // Check if mid itself is minimum element 
        if (mid > low && arr[mid] < arr[mid - 1]) 
            return arr[mid]; 
  
        // Decide whether we need to go to left half or right half 
        if (arr[high] > arr[mid]) 
            return findMinRecursion(arr, low, mid-1); 
        return findMinRecursion(arr, mid+1, high); 
    } 
	
	public int minimumElementInRotatedSortedArrayUtil(int a[])
	{
		int result = Integer.MAX_VALUE;
		int start = 0 ; int end = a.length;
		 return findMinRecursion(a,start,end-1);
	}
	
	public static void main(String[] args) {

		int a [] = {7,6,5,4,3,2,1};
		//{0,1,2,4,5,6,7}
		//{4,5,6,7,0,1,2}
		//{5,4,3,2,1,7,6}
		//{7,6,5,4,3,2,1}
		//{1,7,6,5,4,3,2}
		//{5,1,2,3,4}
		
        
		System.out.println(new MinimumElementInRotatedSortedArray().minimumElementInRotatedSortedArrayUtil(a));
	}

}

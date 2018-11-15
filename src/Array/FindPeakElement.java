package Array;

public class FindPeakElement {

	public int findPeakElementRecursion(int[] nums, int start , int end) {
	
		if (start>=end)
			return -1;
		
		/*if (start >= end && start !=  0 && end !=  nums.length-1)
			return -1;
		
		if (end-start ==1 && start ==  0)
			return nums[start]> nums[end] ? start: -1;
			
		if (end-start ==1 && end ==  nums.length-1)
			return nums[end]> nums[start] ? end: -1;*/
         
					
		int mid = (start )+ (end-start)/2;
		
		if (mid>0 && mid<nums.length-1)
		{	
			if (nums[mid]> nums[mid-1]&& nums[mid]> nums[mid+1])
				return mid;
		}
		
		if (nums[mid-1]> nums[mid])
			return findPeakElementRecursion(nums, start ,mid-1);
		else
			return findPeakElementRecursion(nums, mid+1 ,end);
	}
	
	public static Integer getPeakElement(int[] array) {
		 
        if (array == null || array.length == 0) {
            return null;
        }
 
        int n = array.length;
 
        int start = 0;
        int end = n - 1;
 
        while (start <= end) {
            int mid = (start + end) / 2;
 
            if ((mid == 0 || array[mid - 1] <= array[mid]) && (mid == n - 1 || array[mid] >= array[mid + 1])) {
                return mid; // array[mid] is peak element
            } else if (mid > 0 && array[mid - 1] > array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return null;
    }

	public int findPeakElement(int[] a) {
        int low = 0, mid = 0, high = a.length - 1;
        while(low < high) {
            mid = low + (high-low)/2;
            if(a[mid] < a[mid+1]) low = mid+1;
            else high = mid;
        }
        return low;
    }

	public static void main(String[] args) {

		int[] nums = {1,0,3};
		System.out.println(new FindPeakElement().findPeakElement(nums));
		System.out.println(getPeakElement(nums));
	}

}

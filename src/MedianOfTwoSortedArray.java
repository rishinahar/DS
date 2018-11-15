
public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int ar1[] = {1, 12, 15, 26, 38};
		 int ar2[] = {2, 13, 17, 30, 45};
		 System.out.println(findMedianSortedArrays(ar1,ar2));
		 System.out.println(median(ar1, ar2));
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	    int m=nums1.length;
	    int n=nums2.length;
	    if((m+n)%2==0){
	        return (
	            findKth((m+n)/2,    nums1, 0,  nums2, 0) + 
	            findKth((m+n)/2+1,  nums1, 0, nums2, 0)
	        )/2.0;
	    }else{
	        return findKth((m+n)/2+1, nums1, 0, nums2, 0);
	    }
	}
	 
	//k starts with 1
	//(a > b) ? a : b; is an expression which returns one of two values, a or b. The condition, (a > b), is tested. If it is true the first value, a, is returned. If it is false, the second value, b, is returned.
	public  static int findKth(int k, int [] A, int aStart, int[] B, int bStart){
	    if(aStart>=A.length){
	        return B[bStart+k-1];
	    }
	    if(bStart>=B.length){
	        return A[aStart+k-1];
	    }
	    if(k==1)
	        return Math.min(A[aStart], B[bStart]);
	 
	    int aMid = aStart+k/2-1;
	    int bMid = bStart+k/2-1;
	 
	    int aValue = aMid<A.length?A[aMid]:Integer.MAX_VALUE;
	    int bValue = bMid<B.length?B[bMid]:Integer.MAX_VALUE;
	 
	    if(aValue<bValue){
	        return findKth(k-k/2, A, aMid+1, B, bStart);
	    }else{
	        return findKth(k-k/2, A, aStart, B, bMid+1);
	    }
	    
	} 
	 // simple code to find median for 2 sorted arrays  
	// Time Complexity: O(logn)
	//Algorithmic Paradigm: Divide and Conquer
	
	    public static int median(int[] arr1, int[] arr2)
	     {
	         int N = arr1.length;
	         return median(arr1, 0, N -1 , arr2, 0, N - 1);
	     }
	     public static int median(int[] arr1, int l1, int h1, int[] arr2, int l2, int h2)
	     {
	         int mid1 = (h1 + l1 ) / 2;
	         int mid2 = (h2 + l2 ) / 2;
	 
	         if (h1 - l1 == 1)
	             return (Math.max(arr1[l1] , arr2[l2]) + Math.min(arr1[h1] , arr2[h2]))/2;
	         else if (arr1[mid1] > arr2[mid2])
	             return median(arr1, l1, mid1 , arr2, mid2 , h2);    
	         else
	             return median(arr1, mid1 , h1, arr2, l2 , mid2 );    
	     }    
	 
	}



public class ArrayAmountOfWater {
	
	
	static int findWater(int arr[], int n)
    {
        // initialize output
        int result = 0;
          
        // maximum element on left and right
        int left_max = 0, right_max = 0;
          
        // indices to traverse the array
        int lo = 0, hi = n-1;
          
        while(lo <= hi) 
        {
            if(arr[lo] < arr[hi])
            {
                if(arr[lo] > left_max)
     
                // update max in left
                left_max = arr[lo];
                else
     
                // water on curr element = 
                // max - curr
                result += left_max - arr[lo];
                lo++;
            }
            else
            {
                if(arr[hi] > right_max)
                 
                // update right maximum
                right_max = arr[hi];
                 
                else
                result += right_max - arr[hi];
                hi--;
            }
        }
          
        return result;
    }
	
	public static void main(String[] args) {
		
		int a[] ={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int j=0;
		int sum =0;
		
		 int maxSeenSoFar = 0;
		 
	        int[] maxSeenRight = new int[a.length];
	        int maxSeenLeft = 0;
	 
	        int rainwater = 0;
	 
	        for (int i = a.length - 1; i >= 0; i--) {
	            if (a[i] > maxSeenSoFar) {
	                maxSeenSoFar = a[i];
	                maxSeenRight[i] = maxSeenSoFar;
	            } else {
	                maxSeenRight[i] = maxSeenSoFar;
	            }
	        }
	 
	        for (int i = 0; i < a.length; i++) {
	            rainwater = rainwater + Math.max(Math.min(maxSeenLeft, maxSeenRight[i]) - a[i], 0);
	            if (a[i] > maxSeenLeft) {
	                maxSeenLeft = a[i];
	            }
	        }
	        /*for (int i=1;i<a.length-1;i++)
			 {
				if (a[0]>a[i])
				 {
					
				 }
				else
				 {
					if (a[i]>a[i+1])
					 {
						sum += a[i]-a[i+1];
						j= i;
					 }
					else
					 {	
						if(a[j]>a[i+1])
						 {
							sum += a[i+1]-a[i];
							sum = sum -(a[j]-a[i+1]);
						 }
						else if (a[j]<a[i+1]&& a[i]>a[i+1])
						  sum +=a[j]-a[i];	
					 }
				 }
			 }*/
	 
		System.out.println("The amount of water in it is " +rainwater );
	}
}

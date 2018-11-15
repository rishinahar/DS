package Array;

public class MaximumRepeatingNumber {
    
	public static int maximumRepeatingNumber(int arr[], int n , int k)
	{ 
		// Iterate though input array, for every element
        // arr[i], increment arr[arr[i]%k] by k
        for (int i = 0; i< n; i++)
            arr[(arr[i]%k)] += k;
 
        // Find index of the maximum repeating element
        int max = arr[0], result = 0;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                result = i;
            }
        }
 
        /* Uncomment this code to get the original array back
        for (int i = 0; i< n; i++)
          arr[i] = arr[i]%k; */
 
        // Return index of the maximum element
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 2, 2, 0, 2, 0, 2, 3, 8, 0, 9, 2, 3};
		
		System.out.println(maximumRepeatingNumber (arr , arr.length-1 , 11));

	}

}

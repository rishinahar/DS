
public class MergeOneArrayOfSizeNintoAnotherOneOfSizeMPlusN {

	public static void pushToEnd(int mPlusN[] , int size)
	{   int i, j = size - 1;
		for (i = size - 1; i >= 0; i--) 
		{
			if (mPlusN[i] != -1) 
			{
				mPlusN[j] = mPlusN[i];
				j--;
			}
		}
	}
	
	/* Merges array N[] of size n into array mPlusN[]
    of size m+n*/
 static void merge(int mPlusN[], int N[], int m, int n) 
 {   
     /* Current index of i/p part of mPlusN[]*/
     int i = n;
     
     /* Current index of N[]*/
     int j = 0;
      
     /* Current index of of output mPlusN[]*/
     int k = 0;
      
    
     while (k < (m + n)) 
     {
         /* Take an element from mPlusN[] if
         a) value of the picked element is smaller and we have
             not reached end of it
         b) We have reached end of N[] */
         if ((i < (m + n) && mPlusN[i] <= N[j]) || (j == n)) 
         {
             mPlusN[k] = mPlusN[i];
             k++;
             i++;
         } 
         else // Otherwise take element from N[]
         {
             mPlusN[k] = N[j];
             k++;
             j++;
         }
     }
 }
 /* Utility that prints out an array on a line */
 static void printArray(int arr[], int size) 
 {
     int i;
     for (i = 0; i < size; i++) 
         System.out.print(arr[i] + " ");

     System.out.println("");
 }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mPlusN[] = {2, 8, -1, -1, -1, -1, -1, 15, 20};
        int N[] = {5, 7, 9, 22, 25};
        int n = N.length;
        int m = mPlusN.length - n;
        
        pushToEnd(mPlusN , m+n);
        merge(mPlusN, N, m, n);
        
        /* Print the resultant mPlusN */
        printArray(mPlusN, m + n);
    }

}



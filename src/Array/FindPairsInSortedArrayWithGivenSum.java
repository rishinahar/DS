package Array;

public class FindPairsInSortedArrayWithGivenSum {

	public static void main(String[] args) {

	  
	  int arr [] = {-1,-1,1,1,3,4,8,8,11,11,12,20};
      int sum = 19;
      int l = 0;
      int r = arr.length-1;
      
      // two pointers used to trim the array into new subsurray for the finding  pairs based on 3 coniditions
       // 1. Sum found
      //  2.  Current Sum is greater
      //  3. Current Sum is less.
    	  while ((l < r))
    	  {
    		  if (arr[l]+ arr[r] == sum)
    		  {
    			  System.out.println(arr[l]+","+arr[r] +" at index (" + l +","+ r +")");
    			  l++;
    		  }
    		  else if (arr[l]+ arr[r] < sum)
    		  {
    			  l++;		  
    		  }
    		  else
    			  r--;
    	  }
      }
      
	}


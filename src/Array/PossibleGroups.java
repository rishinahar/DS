package Array;


/*
 * Given an unsorted integer (positive values only) array of size ‘n’, we can form a group of two or three only, the group should be such that the sum of all elements in that group is a multiple of 3. Count all possible number of groups that can be generated in this way.

Input: arr[] = {3, 6, 7, 2, 9}
Output: 8
Groups are {3,6}, {3,9}, {9,6},
           {7,2}, {3, 6,9}, 
           {3, 7, 2}, {7, 2, 6}, 
           {7, 2, 9}
                     
 */

public class PossibleGroups {

	public static void possibleGroups(int a[] , int num)
	{   int factors [] = new int[a.length];
	    int nonfactors [] = new int [a.length];
		int j=-1; int k =-1;
		
		for (int i = 0;i<a.length;i++ )
			{
			 if (a[i] % num == 0)
				 factors[++j] = a[i];
			 else
				 factors[++k] = a[i];
			}
			
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int a[] = {3, 6, 7, 2, 9};
		
		
	}

}

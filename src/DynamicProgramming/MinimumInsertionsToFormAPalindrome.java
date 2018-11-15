package DynamicProgramming;

public class MinimumInsertionsToFormAPalindrome {
    
	// A Naive recursive program to find minimum number insertions
	// needed to make a string palindrome 
	// A utility function to find minimum of two numbers

	static int min(int a, int b)
	{  return a < b ? a : b; }
	 
	static // Recursive function to find minimum number of insersions
	int findMinInsertions(char str[], int l, int h)
	{
	    // Base Cases
	    if (l > h) return Integer.MAX_VALUE;
	    if (l == h) return 0;
	    if (l == h - 1) return (str[l] == str[h])? 0 : 1;
	 
	    // Check if the first and last characters are same. On the basis of the
	    // comparison result, decide which subrpoblem(s) to call
	    return (str[l] == str[h])? findMinInsertions(str, l + 1, h - 1):
	                               (min(findMinInsertions(str, l, h - 1),
	                                   findMinInsertions(str, l + 1, h)) + 1);
	}
	 
	 // A Dynamic Programming based program to find minimum number
	// insertions needed to make a string palindrome
   // A DP function to find minimum number of insersions
  static int findMinInsertionsDP(char str[], int n)
	{
	    // Create a table of size n*n. table[i][j] will store
	    // minumum number of insertions needed to convert str[i..j]
	    // to a palindrome.
	    int table[][] = new int[n][n], l, h, gap;
	 
	    // Initialize all table entries as 0
	  
	    // Fill the table
	    for (gap = 1; gap < n; ++gap)
	        for (l = 0, h = gap; h < n; ++l, ++h)
	            table[l][h] = (str[l] == str[h])? table[l+1][h-1] :
	                          (min(table[l][h-1], table[l+1][h]) + 1);
	 
	    // Return minimum number of insertions for str[0..n-1]
	    return table[0][n-1];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String s= "rishi";
		char str[] = s.toCharArray();
		System.out.println("The cost to convert given string to a palindrome string " +findMinInsertions(str,0,str.length-1));
		System.out.println("The cost to convert given string to a palindrome string " +findMinInsertionsDP(str,str.length));

	}

}

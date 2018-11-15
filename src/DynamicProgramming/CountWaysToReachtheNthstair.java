package DynamicProgramming;

/*
 * There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.
stairs Consider the example shown in diagram. The value of n is 3. There are 3 ways to reach the top. The diagram is taken from Easier Fibonacci puzzles

*/

public class CountWaysToReachtheNthstair {
    
	// A recursive function used by countWays
    static int countWaysUtil(int n, int m)
    {
        if (n <= 1)
            return n;
        int res = 0;
        for (int i = 1; i<=m && i<=n; i++)
            res += countWaysUtil(n-i, m);
        return res;
    }
    
 // A recursive function used by countWays
    int countWaysUtilDP(int n, int m)
    {
        int res[]= new int[n];
        res[0] = 1; res[1] = 1;
        for (int i=2; i<n; i++)
        {
           res[i] = 0;
           for (int j=1; j<=m && j<=i; j++)
             res[i] += res[i-j];
        }
        return res[n-1];
    }
    
    // Returns number of ways to reach s'th stair
    static int countWays(int s, int m)
    {
        return countWaysUtil(s+1, m);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		 int s = 4,m = 2;
         System.out.println("Number of ways = "+ countWays(s,m));
		
	}

}

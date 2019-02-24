package DynamicProgramming;

public class Knapsack {

	// A utility function that returns maximum of two integers
	static int max(int a, int b) { return (a > b)? a : b; }

	// Returns the maximum value that can be put in a knapsack of capacity W
	static int knapSack(int W, int wt[], int val[], int n)
	{
		int i, w;
		int K[][] = new int[n+1][W+1];

		// Build table K[][] in bottom up manner
		for (i = 0; i <= n; i++)
		{
			for (w = 0; w <= W; w++)
			{
				if (i==0 || w==0)
					K[i][w] = 0;
				else if (wt[i-1] <= w)
					K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
				else
					K[i][w] = K[i-1][w];
			}
		}

		return K[n][W];
	}

	// Driver program to test above function
	public static void main(String args[])
	{
		int val[] = new int[]{60, 100, 120};
		int wt[] = new int[]{10, 20, 30};
		int  W = 50;
		int n = val.length;
		System.out.println(knapSack(W, wt, val, n));
	}
	
	
	 w [2, 3, 4, 5]
			 V [1 ,2 ,3, 4]

			maxValue J
			  W| 0 1 2 3 4 5
			w v    
			0 0| 0 0 0 0 0 0
			2 1| 0 0 1 1 1 1
			3 2| 0 0 1 2 2 3
			4 3| 0
			5 4|
			 

			   if (i =0) 0
			 
			   maxValue[i][j] = Math.max(val[i-1]+ maxValue[i-1][j-w[i-1]], maxValue[i-1][j])  i=3, j=0
			                                           1, 2 ,   1,5
			                               2 +1 , 1 
			                               
			public int getMaxValue(int[] v, int[] w, int W) {
			    
			    if (W ==0)
			    return 0;
			    
			    int maxValue = new int [v.length+1][W];
			    for (int i=0; i<maxValue.length; i++)
			    {
			        for (int j=0; j<=W;j++)
			        
			        if (i==0)
			        {
			            maxValue[i][j] =0;
			        }
			        
			        else if (j==0)
			        {
			             maxValue[i][j] = 0;
			        }
			        
			        else if ( j > w[i-1])
			        
			        {
			            maxValue[i][j] = Math.max(val[i-1]+ maxValue[i-1][j-w[i-1]], maxValue[i-1][j]);
			        }
			        else 
			           maxValue[i][j] = maxValue[i-1][j];
			    }
			    
			    return maxValue[i][W];
			}

			V = [1, 2]
			w = [1, 2]
			W = 5
			  i=0; j=0;
			maxValue J
			  W| 0 1 2 3 
			w v    
			0 0|  
			1 1|   
			2 2|   


			
}

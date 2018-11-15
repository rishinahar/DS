
public class BooleanMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] ={
						{ 1, 0, 0, 1},
						{ 0, 0, 1, 0},
						{ 0, 0, 0, 0}
					};
		printMatrix(3,4,a);
		all_Ones(3,4,a);
        System.out.println("\nAfter changing the boolean matrix \n");
		printMatrix(3,4,a);
	}
	
	public static void printMatrix (int R, int C,int mat[][])
	{  int i ,j;
		for (i = 0; i < R; i++)
	    {
	        for (j = 0; j < C; j++)
	        {
	              System.out.print(mat[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
	public static void all_Ones(int R, int C,int mat[][])
	{   int i, j;
	  int[] row = new int[R];
	  int[] col = new int[C];

	  
		for (i = 0; i < R; i++)
	    {
	        for (j = 0; j < C; j++)
	        {
	            if (mat[i][j] == 1)
	            {
	                row[i] = 1;
	                col[j] = 1;
	            }
	        }
	    }
	 
	    /* Modify the input matrix mat[] using the above constructed row[] and
	       col[] arrays */
	    for (i = 0; i < R; i++)
	    {
	        for (j = 0; j < C; j++)
	        {
	            if ( row[i] == 1 || col[j] == 1 )
	            {
	                mat[i][j] = 1;
	            }
	        }
	    }
	}
}


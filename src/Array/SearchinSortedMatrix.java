package Array;

public class SearchinSortedMatrix {

	public static void main(String[] args) {
		int a[][] = 
			  { {1,  2,  3,  4,  5,  6},
		        {7,  8,  9,  10, 11, 12},
		        {13, 14, 15, 16, 17, 18}
		    };
		int temp = 1 + (int)(Math.random() * ((17) + 1));
		search_Matrix(3, 6, a, temp);

	}
	public static void search_Matrix(int N, int M, int a[][], int key)
	{  int r=0;
	   int c=M-1;
		while (r<N && c>=0)
		{
			if(a[r][c] == key)
				{
				System.out.println("Number "+key+" is present in "+"row = " +r + " column = "+c );
				return ;
				}
			else if (a[r][c] <key)
				r++;
			else 
				c--;
				
		}
		
	}
	
}

import java.util.HashMap;


public class PrintUniqueRowsMatrix {

	public static void main(String[] args) 
	{
		int a[][]	={
						{0, 1, 0, 0, 1},
				        {1, 0, 1, 1, 0},
				        {0, 1, 0, 0, 1},
				        {1, 1, 1, 0, 0}
					  };
		
		printUniqueRow(4,5,a);
	}
	public static void  printUniqueRow (int m, int n , int a[][])
	{  
		HashMap hmap = new HashMap();
		
		for (int i=0;i<m;i++)
		{  String dec = "";
			for (int j=0;j<n;j++)
			{
				dec+=a[i][j]+"";
			}
			// convert the binary string to its decimal counterpart
		   int key = Integer.parseInt(dec,2);
		   
		   // use hashmap to find if row is not duplicate , print it 
		   if (!hmap.containsKey(key))
		   {
			   hmap.put(key, i);
			   System.out.println(dec);
		   }
		} 
	}
}


public class MinimumOperationsTOConvertMToN {
	
	public int minimumOperationsTOConvertMToN (int m , int n)
	{ 
		/*int result = M;
		int count = 0;
		while (result != N)
		{
			result +=result;
			System.out.println(result);
			count++;
		}	
		
		return count; */
		
		   // make it more efficient 
		    if(m<n)
		     {
		      int temp =m;
		      m=n;
		      n=temp;
		     }   
		 int v=0;
		 if(n==1) 
		      return m;
		 v = minimumOperationsTOConvertMToN(m,n>>1);
		 v = v+v;
		 if(n & 1) 
		      v+= m;
		 return v;
	}
	
	public static void main(String[] args) {
	
		int M =2 ;
		int N = M* 100;
		System.out.println(new MinimumOperationsTOConvertMToN().minimumOperationsTOConvertMToN(M, N));
	}

}

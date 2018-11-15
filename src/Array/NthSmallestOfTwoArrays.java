package Array;

public class NthSmallestOfTwoArrays {

	
	public static int nthSmallestOfTwoArrays(int a[], int b[], int n)
	{
		int i = 0;
		int j = 0;
		
		int count =0;
		int result =0;
		if (n == 1)
		{
			return Math.min(a[0], b[0]);
		}
		
		if (n== a.length+ b.length)
		{
			
			return Math.max(a[a.length-1], b[b.length-1]);
		}	
		while (i < a.length || j<b.length)
		{
			if (count == n)
				return result;
	     
			 if (a[i] < b[j])
			 {
				 result = a[i];
				 i++;
				 count++;
				 
			 }
			
			 else
				 
			 {  
				 result = b[j];
				 j++;
				 count++;
			 }
		}
		return result; 
	}
	public static void main(String args[])
    {
		int a[] = {1,3,5,7,9};
		int b[] = {2,4,6,8};
		
		System.out.println(nthSmallestOfTwoArrays(a,b,9));
    }
}

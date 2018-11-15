package Array;

// Description of problem : http://www.geeksforgeeks.org/counting-inversions/
public class InversionPair {
	
	public static int inversionPairCount(int a[])
	{   
		int count =0; 
	for (int i=0; i<a.length;i++)
	{
		for (int j=i+1; j<a.length;j++)
		{
			if (a[i]>a[j])
				count++;
		}		
	}
		
	return count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {8, 4, 2, 1};
		System.out.println(inversionPairCount(a));

	}

}


public class arrayKthDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Three approaches 
		 1) hash map
		 2) modify the array as  B[A[i]]=true if was false, else bing!
		 3) Subtract the sum of all the numbers from N(N-1)/2. Call this A.
			Subtract the sum of the squares from N(N-1)(2N-1)/6. Divide this by A. Call the result B.
			The number which was removed is (B + A)/2 and the number it was replaced with is (B - A)/2.
			if array is continuous 1 to N
		
		*/
		int a[] ={1,2,3,4,5};
		int sum=0; 
		int xsum =0;
		for(int i =0;i<a.length;i++)
		 {
			sum += a[i];
			xsum = xsum ^a[i];
			System.out.println( sum +"  "+xsum);

		 }
		System.out.println( sum +"  "+xsum);

	}

}

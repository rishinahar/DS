/*
 * Given an integer x , Your task is to find the  square root of it. If x is not a perfect square, then return floor(√x)
 */

public class squareRoot {
   
	public static int squareRoot(int x)
	{  
		// Base Cases
		if (x == 0 || x == 1)
			return x;

		// Do Binary Search for floor(sqrt(x))
		int start = 1, end = x, ans=0;
		while (start <= end)
		{
			int mid = (start + end) / 2;

			// If x is a perfect square
			if (mid*mid == x)
				return mid;

			// Since we need floor, we update answer when mid*mid is
			// smaller than x, and move closer to sqrt(x)
			if (mid*mid < x)
			{
				start = mid + 1;
				ans = mid;
			}
			else // If mid*mid is greater than x
				end = mid - 1;
		}
		return ans;
	
	}
	
	public static double sqrt(int number) {
		double t;
	 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int n = (int) Math.round(Math.random()*1000000);
		
		System.out.println( " Square root of number "+n +" is = "+ squareRoot (1000));
	}

}

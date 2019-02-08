package DynamicProgramming;

public class Fibonacci {

	public int fibonacci (int x)
	{
	
		int[] result = new int[x+1];
		
			result[0] =  0;
			result[1] =  1;
		
		for (int i=2;i<x+1;i++)
			result [i] = result[i-1]+result[i-2];
		
		return result[x];
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Fibonacci().fibonacci(3));
	}

}

package tree;

public class testFactor {

	static long calculateCombinations(int n, int k) {
        // Write your code here.
        long fact =1;
        int count =k;
       while (count>0)
       {
    	   fact = fact * n--;
    	   count--;
       }
        
     long fact2 = 1;

      for(int i = 1; i <= k; i++)
        {
            fact2 = fact2 * i;
        }
        
        long result = fact /fact2;
        
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(calculateCombinations(100,0));
	}

}

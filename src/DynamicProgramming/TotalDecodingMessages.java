package DynamicProgramming;

public class TotalDecodingMessages {
    
	 /* A top secret message containing letters from A-Z is being encoded to numbers using the following mapping:
	*/	
	
	
	// A naive recursive C++ implementation to count number of decodings
	// that can be formed from a given digit sequence
	 
	// Given a digit sequence of length n, returns count of possible
	// decodings by replacing 1 with A, 2 woth B, ... 26 with Z
	static int countDecodingRecurs(char []digits, int n)
	{
	    // base cases
	    if (n == 0 || n == 1)
	        return 1;
	 
	    int count = 0;  // Initialize count
	 
	    // If the last digit is not 0, then last digit must add to
	    // the number of words
	    if (digits[n-1] > '0')
	        count =  countDecodingRecurs(digits, n-1);
	 
	    // If the last two digits form a number smaller than or equal to 26,
	    // then consider last two digits and recur
	    if (digits[n-2] < '2' || (digits[n-2] == '2' && digits[n-1] < '7') )
	        count +=  countDecodingRecurs(digits, n-2);
	 
	    return count;
	}
	
	
	// A Dynamic Programming based function to count decodings
	// Youtube link first 10 minutes => https://www.youtube.com/watch?v=DBRTq-_vbeQ
	static int countDecodingDP(char []digits, int n)
	{
	    int count[] = new int[n+1]; // A table to store results of subproblems
	    count[0] = 1;
	    count[1] = 1;
	 
	    for (int i = 2; i <= n; i++)
	    {
	        count[i] = 0;
	 
	        // If the last digit is not 0, then last digit must add to
	        // the number of words
	        // we are storing digit i-1 number ways decoding at i;
	        if (digits[i-1] > '0')
	            count[i] = count[i-1];
	 
	        // If second last digit is smaller than 2 and last digit is
	        // smaller than 7, then last two digits form a valid character
	        if (digits[i-2] < '2' || (digits[i-2] == '2' && digits[i-1] < '7') )
	            count[i] += count[i-2];
	    }
	    return count[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String digit = "12";
		char digits[] = digit.toCharArray();
		System.out.println(countDecodingRecurs(digits, digits.length));

		System.out.println(countDecodingDP(digits, digits.length));

	}

}


public class PossibleWordsFromPhoneDigit {
	// static char hashTable[][] = {"", "", "abc", "def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int number[] = {2, 3, 4};
		int n = number.length;
		printWords(number, n);
	}
	public static void printWordsUtil(int number[], int curr_digit, char output[], int n)
	{
		// Base case, if current output word is prepared
		int i;
		if (curr_digit == n)
		{
			System.out.print(output);
			return ;
		}

		// Try all 3 possible characters for current digir in number[]
		// and recur for remaining digits
		/*for (i=0; i<(hashTable[number[curr_digit]]).length; i++)
		{
			output[curr_digit] = hashTable[number[curr_digit]][i];
			printWordsUtil(number, curr_digit+1, output, n);
			if (number[curr_digit] == 0 || number[curr_digit] == 1)
				return;
		}*/
	}

	// A wrapper over printWordsUtil(). It creates an output array and
	// calls printWordsUtil()
	public static void printWords(int number[], int n)
	{
		char[] result = new char[n+1];
		result[n] ='\0';
		printWordsUtil(number, 0, result, n);
	}

}

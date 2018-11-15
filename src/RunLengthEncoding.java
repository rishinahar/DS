
public class RunLengthEncoding {

	/*Given a string, Your task is to  complete the function encode that returns the run length encoded string for the given string.
	eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
	You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.
	*/

	private static String encodedString(String rawInput)
	{ 
		String encodedString ="";
		
        char c = rawInput.charAt(0);
        int j=1;
        int count = 1;
        char temp =' ';
        
		while (j<=rawInput.length()-1)
		 {
			 temp = rawInput.charAt(j);
			
			if (c == temp)
			 {
				count++;
			 }
			else 
			{
				encodedString += c+""+count;
				count = 1;
				c = temp;
			}
			j++;
		 }

        encodedString += temp+""+count;
		return encodedString;
	}
	public static void main(String[] args) {
		
		//String rawInput = "wwwwaaadexxxxxx";
		//String rawInput = "aaaabbbccc";
		String rawInput = "abbbcdddd";
		
		System.out.println("encode representation of given string " +rawInput + " is " + encodedString(rawInput));
	}

}

import java.io.InputStreamReader;


public class reverseWordsOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Input = "Rishi Nahar is greatest man"; 
		System.out.println(Input.length());
		reverseWord(Input,0);
		
	}
	public static void reverseWord(String input,int i)
	{ int j=i;
	  String out ="";
	  
		while (j<input.length())
		{   
			char c = input.charAt(j++);
			if (c!=' ')
			  out += c;
			else
			{
				reverseWord(input,j);
				break;
			}
			
			
		}
		System.out.print(out+" ");
	}
}

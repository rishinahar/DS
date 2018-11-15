import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReverseWordsInGivenString {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String s1 = "i like this program very much";
		  //reverseWords(s);
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter string: ");
	        String s = br.readLine();
	        String reverse = "";
	        int length = s.length();

	        for (int i = length - 1; i >= 0; i--)
	            reverse = reverse + s.charAt(i);
	        System.out.println("Result:" + reverse);
	}
/*	int lengthint lengthint lengthpublic static void reverseWords(String s)
	{
		
		  char *word_begin = s.charAt(index);
		  char *temp = s;  temp is for word boundry 
		 
		  STEP 1 of the above algorithm 
		  while( *temp )
		  {
		    temp++;
		    if (*temp == '\0')
		    {
		      reverse(word_begin, temp-1);
		    }
		    else if(*temp == ' ')
		    {
		      reverse(word_begin, temp-1);
		      word_begin = temp+1;
		    }
		  }  End of while 
		 
		   STEP 2 of the above algorithm 
		  reverse(s, temp-1);
		
	}
	public static void reverse(String s)
	{
	  int begin = 0;
	  int end = s.length()-1;
	  String temp1 ="";
	  String temp2 ="";
	  while (begin < end)
	  {
	    temp1 = s.charAt(begin++)+"";
	    temp2 = s.charAt(end--)+"";
	    s.replaceAll(temp1, temp2);
	    s.replaceAll(temp2, temp1);

	  }
	}*/
}

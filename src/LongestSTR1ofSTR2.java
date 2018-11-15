
public class LongestSTR1ofSTR2 {

	public static void main(String[] args) {
	
		String STR1 = "abcdefacbcaabbcccbagfacbacer";
		String STR2 = "abc";
		int count =0;
		int max =0;
		String result ="";
		String temp="";
		for (int i=0;i<STR1.length();i++)
			{
			    char test = STR1.charAt(i);
			    if (STR2.contains(test+""))
			    {
			    	count++;
			    	temp+=test;
			    }
			    else 
			    	{
			    	  count=0;
			    	  temp="";
			    	}
			
			    if (max<count)
			    	{
			    	   max=count;
			    	   result = temp;
			    	}
			}
			
		System.out.println(" length of maximum substring " + result+ " is  = "+max);
	}
	
}

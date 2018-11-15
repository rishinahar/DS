
public class CharWithMaximumCount {
   
	public static void charWithMaximumCount(char a[])
	{
		int freq[] =  new int[256];
		
		int max = -1;  // Initialize max count
	    char result = 0;
	    
		for (int i=0; i<a.length;i++)
			  freq[a[i]]++;
			 
		
		for (int i=0; i<a.length;i++) {
	        if (max < freq[a[i]]) {
	            max = freq[a[i]];
	            result = a[i];
	        }
	    }
		
		System.out.println("The maximum occurence of character from given string is "+ result + "with frequency number = "+max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String in = "sample string ttttttttttttttttt";
		char a[] = in.toCharArray();
		
		charWithMaximumCount(a);

	}

}

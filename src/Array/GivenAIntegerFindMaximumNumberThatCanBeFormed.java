package Array;


public class GivenAIntegerFindMaximumNumberThatCanBeFormed {
	
	int largestNumberFormed(int input)
	{  
		String res="";
		int tempNum = input;
		int ar[] =  new int[10];
		boolean numNegative = false;
		
		if(input <0)
		{
			numNegative =true;
			tempNum = tempNum *-1;
		}
		
	    while (tempNum !=0)
	    {
	       int index = tempNum %10;
	       ar[index]++;
	       tempNum = tempNum / 10;
	    }	
	    
	    if(!numNegative)
	    {
	    	int j;
	    	for(j=9;j>=0;j--)
	    	{
	    		int k =ar[j];
	    		while(k!=0)
	    		{
	    			res +=j;
	    			k--;
	    		}
	    	}		    	
	    }
	    else
	      { res = "-";
	    	int j;
	    	for(j=0;j<=9;j++)
	    	{
	    		int k =ar[j];
	    		while(k!=0)
	    		{
	    			res +=j;
	    			k--;
	    		}
	    	}		
	      }
		return Integer.parseInt(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int integer = 912234487;
     System.out.println(new GivenAIntegerFindMaximumNumberThatCanBeFormed().largestNumberFormed(integer));
	}
}

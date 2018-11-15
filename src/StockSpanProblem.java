
public class StockSpanProblem {
	public static void main (String a[]) 
	 {    
		
		int j =0;
		int count = 1;
		int array [] = {100, 80, 60, 70, 60, 75, 85};
		//int array [] ={10, 4, 5, 90, 120, 80};
		int result[] = new int[array.length];
           
		 for (int i=0 ;i<array.length;i++)
            {  
			   count=1; 
        	   j=i-1;
        	   while (j>=0)
        	   {
        		   if (array[i] > array[j])
        		   {
        			   count++;
        		   }
        		   j--;
        	   }
        	   result[i]=count;
            }
		  System.out.println("The Stock Span solution array is ");
		   
		  j=0;
		  while(j<array.length)
		  {
			  System.out.print(" "+result[j]);
			  j++;
			   
		  }
	 }
}

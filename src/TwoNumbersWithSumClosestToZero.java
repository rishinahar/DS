import java.util.Arrays;


public class TwoNumbersWithSumClosestToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// n^2 approach
		//int a [] = { -21, -67, -37, -18, 4, -65};
		//int a[] ={-24,-73};
		//int a[] ={-8, -66, -60 };
		int a[] ={9, 60, -10, 79, -80, 78};
        int num1 =0;
        int num2 =0;
        int low  = -100007;
        int sum =-100007;
        
        //alternate apporach through sorting
        
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int neg_max =-100007;
        int pos_low =+100007;
        int i =0;
        int j= a.length-1;
        
          while(i<j )
            {
        	  sum = a[i]+a[j];
        	   if (Math.abs(low)>Math.abs(sum))
        	     {  
        		   low =sum;
        		   num1 = a[i];
        		   num2 = a[j];
        	     }
        	   if (sum<0)
        	     i++;
        	   if (sum>0)
        	     j--;
        	   if (low==0)
        		   break;
            }
		
     // n^2 approach
        /*for (int i=0;i<a.length;i++)
         {
        	 for (int j=i+1;j<a.length;j++)
             {
            	 sum = a[i]+a[j];
            	if (Math.abs(low) > Math.abs(sum))
            	 {  low  =sum;
            		num1 =a[i];
            		num2 =a[j];
            	 }
             }
         } */
        if (num1 !=0 && num2!=0)
         { 
        	System.out.print(Math.min(num1, num2));
        	System.out.print(" "+Math.max(num1, num2));
         }
   
	}

}

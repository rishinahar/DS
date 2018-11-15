package Array;

import java.util.Arrays;


public class SortAnArrayOf0s1sAnd2s {

	public static void main(String[] args) {
		
     /*int a [] = new int [5];
     // random array generation 
      for(int i=0;i<a.length;i++)
       {
    	  a[i]= 0 + (int)(Math.random() * ((2 - 0) + 1));
       }*/
      int a[] = {0,2,1,2,0};
      System.out.println(Arrays.toString(a));
      
      //long startTime = System.currentTimeMillis();
     
      /*for (int i=0;i<a.length-1;i++)
     {
	   int j =i;	 
	    while(i>0)
	 	   {
	    	  if (a[i]>a[i+1]) 
	 	   
	 			   {
	 		          swap (a,i,i+1);
	 			   }
	 		   i--;     	  
	 		 }
	 		i=j;	   
	    }*/
      sort012(a,a.length);
      System.out.println(Arrays.toString(a));
     
	}
    public static void swap(int a[],int b , int c)
	  {
		 int temp = a[b];
		 a[b] =a[c];
		 a[c]= temp;
	  }
    static void sort012(int a[], int arr_size)
    {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0,temp=0;
        while (mid <= hi)
        {
            switch (a[mid])
            {
            case 0:
            {
                temp   =  a[lo];
                a[lo]  = a[mid];
                a[mid] = temp;
                lo++;
                mid++;
                break;
            }
            case 1:
                mid++;
                break;
            case 2:
            {
                temp = a[mid];
                a[mid] = a[hi];
                a[hi] = temp;
                hi--;
                break;
            }
            }
        }
    }
}

import java.util.Arrays;

public class MedianOfArray {
	public static void main (String a[]) 
	{
     	int asd[] ={3 ,3 ,4 ,2 ,4 ,4 ,2 ,4 ,4};
         int mid = asd.length /2;
     	System.out.println("The  sorted give  array is " );
     	Arrays.sort(asd);
     	for (int i=0;i<asd.length;i++ )
         	System.out.print(" "+asd[i] );
  
     	System.out.println("\n Median of the array is "+asd[mid]);
	}
	
	
}

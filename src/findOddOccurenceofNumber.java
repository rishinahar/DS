
public class findOddOccurenceofNumber {

	public static void main (String a[]) 
	  { 
		int ar[] = { 1, 3, 2, 4, 2, 4, 1, 3 ,3 };
	   int sum =0;
	   for (int i=0; i<ar.length;i++)
	     {
		  sum = sum^ar[i];  
	     }	  
	   System.out.println(sum);
	  }
}

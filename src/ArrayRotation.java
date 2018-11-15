import java.util.Arrays;


public class ArrayRotation {
	public static void main (String a[])  
	 {
		int ar[] = { 5 ,1 , 2, 3, 4 };
		System.out.println("Array before rotation"+Arrays.toString(ar));
		rotate(ar ,1);
		System.out.println("Array before rotation"+Arrays.toString(ar));

	 }
	static void rotate(int ar[], int k)
	{
		reverse(ar, 0 , k-1) ;
		reverse(ar, k , ar.length-1);
		reverse(ar, 0 , ar.length-1) ;

	}
	static void reverse(int ar[] , int start , int end) 
	{
		for (int i = start; i<= (start+end)/2;i++)
		   swap(ar,i , (start+end)-i);
	}
	static void swap(int ar[] ,int a , int b)
	{
		int temp = ar[a];
		 ar[a]   = ar[b];
		 ar[b]   = temp;
	}
}

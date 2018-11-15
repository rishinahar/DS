
public class findMissingNumber {
	public static void main (String a[])  
	 {
		int ar[] = { 1, 2, 3, 5, 6, 7, 8, 9};
        int xsum1=0;
        int xsum2=0;
		
        for (int i=0;i<ar.length;i++)
         {
        	xsum1 ^=ar[i];
         }
        for (int i=1;i<=ar.length+1;i++)
        {
       	     xsum2 ^= i;
        }
        int result = xsum1 ^ xsum2;
        System.out.println("missing number is " + result );
        }
}

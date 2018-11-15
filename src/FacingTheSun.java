
public class FacingTheSun {
	public static void main (String a[])  

	{
		int arr[] = {1,2,3,4,5};
        int max =-1;
	    int count =0;
        for (int i = 0 ;i<arr.length;i++)
         {
        	if (arr[i]> max)
        	 {
        		max = arr[i];
        		count++;
        	 }
         }
        System.out.println("The number of building that can see sunset is "+ count);
	}
}

public class MissingAndRepeatingNumber {
	public static void main(String[] args) 
	{
		
		int arr[] = {2 , 2, 1, 3, 4};
		int size = arr.length;
		int i;
	    System.out.println("\n The repeating element is");
	 
	    for(i = 0; i < size; i++)
	    {
	        if(arr[Math.abs(arr[i])-1] > 0)
	            arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
	        else
	            System.out.println( Math.abs(arr[i]));
	    }
	 
	    System.out.println("\nand the missing element is ");
	    for(i=0; i<size; i++)
	    {
	        if(arr[i]>0)
	            System.out.println(i+1);
	    }
	}
}

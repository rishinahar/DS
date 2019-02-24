package DynamicProgramming;

public class MinJumps {

	public static int minJumps (int[] arr , int length)
	{
		int[] jumps = new int[length] ;
		
		if (arr[0]==0 || length==0)
			return 0;
		
		jumps[0]=0;
		
		for (int i=1;i<length;i++)
		{
			jumps[i]=Integer.MAX_VALUE;
			for (int j=0;j<i;j++)
			{
				if(i <= j+arr[j] && jumps[j] != Integer.MAX_VALUE)
				{
					jumps[i] = Math.min(jumps[i],jumps[j]+1);
					break;
				}	
			}
		}
		return jumps[length-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 3, 6, 1, 0, 9}; 
        
	    System.out.println("Minimum number of jumps to reach end is : "+ 
	                                  minJumps(arr,arr.length)); 
	    } 

}

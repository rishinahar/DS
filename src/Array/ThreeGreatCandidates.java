package Array;

public class ThreeGreatCandidates {
	
	public static int threeGreatCandidates(int a[])
	{
		
		int b[] = new int[a.length];
		
		int min1 =a[0] ; int min2 = a[1]; 
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		
		int max_index =-1; int max = Integer.MIN_VALUE;
		int min_index = a.length; int min = Integer.MAX_VALUE;
		
		if (min1 > min2)
		{
			min1 = a[1];
			min2 = a[0];
		}
		
		
		for (int i = 0;i<a.length;i++ )
		{
			if (a[i] > max1)
		    {
		        max3 = max2; max2 = max1; max1 = a[i];
		    }
		    else if (a[i] > max2)
		    {
		        max3 = max2; max2 = a[i];
		    }
		    else if (a[i] > max3)
		    {
		        max3 = a[i];
		    }
			
			if (a[i] < min1)
            {
                min2 = min1;
                min1 = a[i];
            }
            else if (a[i] < min2)
            {
                min2 = a[i];
            }
			
			
		}
				
		
		
		
		int option1 = min1 * min2 * max1;
		 
		int option2 = max1 * max2 * max3;
		
		return Math.max(option1, option2);
		
	}
	
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3, 100, 70, 50, -800, -600};
       System.out.println(threeGreatCandidates(a));
	}

}

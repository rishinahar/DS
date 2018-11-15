package Array;

public class FindTheMaximumValueOfAiAJ {
	public static int maximumValueofEXP(int a[])
	{ 
		int result =-1;
		int low = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
	  	
		for (int i =0 ; i< a.length;i++)
			{
			   a[i] = a[i]-i;
			   
			   if (low > a[i])
				   low = a[i];
			   if (max <a[i])
				   max =a[i];
			   
			}
		
		return max - low ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {9, 15, 4, 2, 13};
        
        System.out.println(maximumValueofEXP(a));
	}

}

package Array;

import java.util.Arrays;

public class EquilibriumPoint {
    
	public static int equilibriumPoint(int a[])
	{
		int result =-1;
		
		int i=0; int leftSum =a[0];
		int j = a.length-1; int rightSum =a[a.length-1];
		
		while(i<=j)
		{
			if (leftSum == rightSum && (j-i)!=0)
			
			{
				leftSum += a[++i];
			    rightSum+=a[--j];
			}   
			
			else if (leftSum == rightSum && (j-i)==0)
				{
				  result = a[i];
				  break;
				}
			else if (leftSum > rightSum)
				rightSum+=a[--j];
			else 
				leftSum += a[++i];
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int a[] = {-1,1,-1,1,3,-1,1,1,-1};
		
		System.out.println(Arrays.toString(a));
		System.out.println(equilibriumPoint(a));
		
	}

}

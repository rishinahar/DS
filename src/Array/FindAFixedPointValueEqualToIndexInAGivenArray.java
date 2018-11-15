package Array;

public class FindAFixedPointValueEqualToIndexInAGivenArray
{

public int fixedPoint(int n[],int low , int high )
{  
   int mid =(low+high) /2;
   
   if (high >= low)
   {   
	   if(mid == n[mid] )
	       return mid;
	
	   else if (mid > n[mid])
		   return fixedPoint(n, mid+1,high);
	
	   else
		   return fixedPoint(n, low,mid-1);
   } 
   return -1;
}

public static void main(String a[])
{	
	int n[] = {-1,0,1,2,4};
	int an = n.length;
    System.out.println(new FindAFixedPointValueEqualToIndexInAGivenArray().fixedPoint(n ,0,an-1));

}	
}
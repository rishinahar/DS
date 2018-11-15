import java.util.HashMap;


public class CheckIfAnArrayCanBeDividedIntoPairsWhoseSumIsDivisibleByk {
	static boolean canPairs(int arr[], int n, int k)
	{
	   if (n % 2 !=0)
		 return false;
      
	   HashMap map = new HashMap();
	   
	   for (int i=0; i<n;i++)
	   {   if (arr[i] % k !=0)
		   map.put(arr[i] % k, arr[i]) ;
	   }
	   for (int i=0; i<n;i++)
	   {   if (arr[i] % k !=0)
	     {
		   if ( !map.containsKey( k-(arr[i] % k)))
	          return false;
	     } 
	     else
	    	 map.remove(k-(arr[i] % k));
	   }
	   return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] =  {92, 75, 65, 48, 45, 30,48};
		 int k = 5;
		 int n = arr.length;
		 
		 System.out.println(canPairs(arr,n,k));
	}

}

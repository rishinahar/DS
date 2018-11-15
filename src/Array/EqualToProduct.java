package Array;

import java.util.HashMap;

public class EqualToProduct {
    
	public static void equalToProduct(int a[], int product)
	{    
		 
          HashMap<Integer, Integer> hm = new HashMap();
		
		// create a hashmap for given array counting number of occurence
		for (int i =0 ; i<a.length;i++)
		{
			if (hm.containsKey(a[i]))
			   hm.put(a[i], hm.get(a[i])+1);
			else
				hm.put(a[i], 1);
		}
		
		for (int i =0 ; i<a.length;i++)
		{
			int reqNum = product / a[i];
			if (hm.containsKey(reqNum))
			{ 
				if (product == reqNum*a[i])
				{
					if ((reqNum == a[i]) && (hm.get(reqNum) == 2))
					{
							System.out.println( reqNum +" * " + a[i] +" = " + product);
							return;
					}				
					else if (reqNum != a[i]) 
						{
						  System.out.println( reqNum +" * " + a[i] +" = " + product);
						  return;
						}
				  } 
			 }
		 }
	}
	
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4,4, 8};
		int product = 8; 
		
		equalToProduct(a , product);
	}
}

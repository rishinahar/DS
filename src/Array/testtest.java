package Array;

import java.util.*;
import java.lang.*;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class testtest
{
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	List<List<Integer>> nearestVegetarianRestaurant(int totalRestaurants, 
			List<List<Integer>> allLocations, 
			int numRestaurants)
	{
		// WRITE YOUR CODE HERE

		SortedMap<Double, List> resultant = new TreeMap<>();
		List<List<Integer>> resultFinal = new ArrayList<List<Integer>>();
		int count =0;			    	
		for (int i=0; i< allLocations.size();i++)
		{
			List <Integer> innerList = (List<Integer>) allLocations.get(i);

			int x = innerList.get(0);
			int y = innerList.get(1);

			double resultSquare =  ((Math.pow(x ,2))+(Math.pow(y,2))); 
			double result = StrictMath.sqrt(resultSquare);
			resultant.put(new Double(result),innerList);
		}

		Set set = resultant.entrySet();

		// Get an iterator
		Iterator it = set.iterator();

		// Display elements
		while(it.hasNext()&& count < numRestaurants) {
			Map.Entry me = (Map.Entry)it.next();

			//System.out.println("Value is: "+me.getValue());
			ArrayList<Integer>  temp = (ArrayList<Integer>)me.getValue();
			resultFinal.add(temp);
		} 

		return  resultFinal;
	}
	// METHOD SIGNATURE ENDS
}
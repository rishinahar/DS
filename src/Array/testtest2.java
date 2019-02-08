package Array;

import java.util.ArrayList;
import java.util.List;
//IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//DEFINE ANY CLASS AND METHOD NEEDED
//CLASS BEGINS, THIS CLASS IS REQUIRED
public class testtest2
{
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	List<List<Integer>> optimalUtilization(int maxTravelDist, 
			List<List<Integer>> forwardRouteList,
			List<List<Integer>> returnRouteList)
	{

		List<List<Integer>> resultList = new ArrayList<List<Integer>>();


		int max = 0;
		for (int i=0; i< forwardRouteList.size();i++)
		{
			List <Integer> innerList = (List<Integer>) forwardRouteList.get(i);

			int id = innerList.get(0);
			int distance = innerList.get(1);

			for (int j=0; j< returnRouteList.size();j++)
			{
				List <Integer> innerList2 = (List<Integer>) returnRouteList.get(j);

				int id2 = innerList2.get(0);
				int distance2 = innerList2.get(1);

				int tempMax = distance+distance2;

				if (tempMax >= max && tempMax <=maxTravelDist)
				{   
					max = tempMax;					
				}

			}
		}
		System.out.println(max);
		
		for (int i=0; i< forwardRouteList.size();i++)
		{
			List <Integer> innerList = (List<Integer>) forwardRouteList.get(i);

			int id = innerList.get(0);
			int distance = innerList.get(1);

			for (int j=0; j< returnRouteList.size();j++)
			{
				List <Integer> innerList2 = (List<Integer>) returnRouteList.get(j);

				int id2 = innerList2.get(0);
				int distance2 = innerList2.get(1);

				int tempMax = distance+distance2;

				if (tempMax == max)
				{   
					System.out.println(id+","+id2);
					List<Integer> resultOne = new ArrayList<>();
					resultOne.add(id);
					resultOne.add(id2);
					
				   resultList.add(resultOne);	
				}

			}
		}


		return resultList;
		// WRITE YOUR CODE HERE


	}
	// METHOD SIGNATURE ENDS
}

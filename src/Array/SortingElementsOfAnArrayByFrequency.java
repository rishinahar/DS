package Array;

import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingElementsOfAnArrayByFrequency {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2, 3,4, 5, 12, 2, 3, 3, 3, 12};
		
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int a : input)
		{
			if(map.containsKey(a))
			{  
				map.put(a, (int)map.get(a)+1);
			}
			else
			 {
				map.put(a,1);
			 }
		}
		
        List<Entry<Integer, Integer>> list = new LinkedList<Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(list, new Comparator<Entry<Integer, Integer>>()
                {
                    public int compare(Entry<Integer, Integer> o1,
                            Entry<Integer, Integer> o2)
                    {
                       
                            return o1.getValue().compareTo(o2.getValue());

                    }
                });
		
		for (Entry<Integer, Integer> entry : map.entrySet())
        {
            System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
        }
	}
}

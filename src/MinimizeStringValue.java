import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class MinimizeStringValue {

	static int minimizeStringValue (String input ,int k)
	{
		int result =0;
		int value = 0;
		int maxValue =0;
		char maxChar = ' ';
		
	    Map <Character ,Integer> map= new HashMap<Character , Integer> ();
		char c = ' ';
		for (int i=0; i<input.length();i++)
		{
			c= input.charAt(i);
			
			if (map.containsKey(c))
			  {
				  value = (int) map.get(c) +1;
				  map.put(c, value);
				 
				 if (value > maxValue)
					 {
					   maxValue = value;
					   maxChar  = c;
					 }
			  }
			else
				map.put(c, 1);
		}
		
		// sort the hashmap
		Map<Integer, String> sort_map = sortByValues(map); 
		char c1=' ';
		int v1 =0;
		while (k>0)
		{
			for (Map.Entry<Character ,Integer> entry : map.entrySet()) 
			{
				 
				 c1= entry.getKey();
				 v1= entry.getValue();
				 if((v1-1) >= k)
				 {
					 v1 = v1-k;
					 map.put(c1, v1);
					 break;
				 }
				 else 
				 {   int v2 =0;
				     v2 = v1-1;  
					 k = k-v2;
					 v1 =1;
					 map.put(c1, v1);
				 }	 
		    }
			
		}
		
		// removing the one character
		//map.put(maxChar, maxValue-1);
		
		for (Map.Entry<Character ,Integer> entry : map.entrySet()) 
		{
			 System.out.println(entry.getKey() + " : "+ entry.getValue() + " square vlaue is =>  " + (entry.getValue()*entry.getValue()));
			 
			 result += entry.getValue()*entry.getValue();
	    }
		return result;
	}
	
	private static HashMap sortByValues(Map<Character, Integer> map) { 
	       List list = new LinkedList(map.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o1)).getValue())
	                  .compareTo(((Map.Entry) (o2)).getValue());
	            }
	       });

	    // Here I am copying the sorted list in HashMap
	       // using LinkedHashMap to preserve the insertion order
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String input = "aaab";
        
        System.out.println(minimizeStringValue(input , 1));
        
	}

}

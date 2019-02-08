package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class GroupAnagrams {

	
	public HashMap stringToMap (String a)
	{
		HashMap<String, Integer> map = new HashMap<> ();
		for (int i=0; i<a.length();i++)
		{
			
			if (map.containsKey(a.charAt(i)+""))
			{
				map.put(a.charAt(i)+"", map.get(a.charAt(i)+"")+1);
			}
			else
				map.put(a.charAt(i)+"", 1);
		}
		return map;
	}
	
	public boolean stringIsInMap (String a, HashMap<String, Integer> map)
	{
		for (int i=0; i<a.length();i++)
		{
			
			if (map.containsKey(a.charAt(i)+""))
			{
				if (map.get(a.charAt(i)+"")>1)
				   map.put(a.charAt(i)+"", map.get(a.charAt(i)+"")-1);
				else
					map.remove(a.charAt(i)+"");
			}
			else
				return false;
		}
		return true;
	}
	
	public List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> lists = new ArrayList<List<String>> ();
		HashSet<String> set = new HashSet <>();
		
		for (int i=0; i<strs.length;i++)
		{
					
			List<String> list = new ArrayList<String> ();
			for (int j=i; j< strs.length;j++)
			{
				HashMap map = stringToMap(strs[i]);
				
				if (stringIsInMap(strs[j],map))
				{
					if (!set.contains(strs[j]))	
						{
						  list.add(strs[j]);
						  set.add(strs[j]);
						}
				}
			}
			if(!list.isEmpty())
			   lists.add(list);
		}	
		  
		return lists;
	}

	public static void main(String[] args) {

		String[] strs = 
				{"eat", "tea", "tan", "ate", "nat", "bat"};
		
		new GroupAnagrams().groupAnagrams(strs);
		
	}
}

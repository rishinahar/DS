package tree;

import java.util.HashMap;

public class Test {

	static int programmerStrings(String s) {
		HashMap<Character, Integer>map = new HashMap(); 
        HashMap <Character, Integer> map2 = new HashMap(); 
        
        int count =0;
        String programmer = "programmer";
        
        for (int i=0;i< programmer.length();i++)
        {
            char c = programmer.charAt(i);
           
            
            if (map.containsKey(c))
            {
                int a = map.get(c);
                map.put (c, ++a);
            }
            else 
                 map.put(c,1);
            
        }

        map2 = (HashMap<Character, Integer>) map.clone();
        for (int i=0; i<s.length();i++)
        {
            char c = s.charAt(i);
            
            if (map.containsKey(c))
            {
               int a = map.get(c);
                
                if (a==1)
                    map.remove(c);
                else
                    map.put (c, --a);
                      
                if  (map.isEmpty())
                    
                {
                    count++;
                    map =  map2;
                }   
            }
            
        }
        
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(programmerStrings("xprogxrmaxemrppprmmograeiruu"));
		System.out.println(Integer.parseInt("AA"));
		

	}

}

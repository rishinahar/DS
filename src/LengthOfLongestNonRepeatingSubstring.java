 import java.util.HashMap;


public class LengthOfLongestNonRepeatingSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String STR1 = "RISHI NAHAR";
		if(STR1==null)
           	    System.out.println("NULL");
		
		// Soultion 2
	char[] arr = STR1.toCharArray();
	int max = 0;
 
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 
	for (int i = 0; i < arr.length; i++) {
		if (!map.containsKey(arr[i])) {
			map.put(arr[i], i);
		} else {
			max = Math.max(max, map.size());
			i = map.get(arr[i]);
			map.clear();
		}
	}
	System.out.println(" "+ Math.max(max, map.size()));
 
/*
  * 
		int max = 0;
		 
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    int start=0;
	 
	    for(int i=0; i<s.length(); i++){
	        char c = s.charAt(i);
	        if(map.containsKey(c)){
	            max = Math.max(max, map.size());    
	            while(map.containsKey(c)){
	                map.remove(s.charAt(start));
	                start++;
	            }
	 
	            map.put(c, i);
	        }else{
	            map.put(c, i);
	        }
	    }
	 
	    max = Math.max(max, map.size());  
	 
    System.out.println(max);*/
	}

}

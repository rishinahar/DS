import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
class CountIndex
{
    int count,index;
     
    // constructor for first occurrence
    public CountIndex(int index) {
        this.count = 1;
        this.index = index;
    }
     
    // method for updating count
    public void incCount() {
        this.count++;
    }
}
    
public class FirstNonRepeatingCharacter {
    
	static final int NO_OF_CHARS = 256;
    
    HashMap<Character, CountIndex> hm = new HashMap<Character, CountIndex>(NO_OF_CHARS);
     
    /* calculate count of characters 
       in the passed string */
      void getCharCountArray(String str) 
     {
         for (int i = 0; i < str.length();  i++)
         {
            // If character already occurred, 
             if(hm.containsKey(str.charAt(i)))
             {
                 // updating count
                 hm.get(str.charAt(i)).incCount();
             }
              
            // If it's first occurrence, then store the index and count = 1
             else
             {
                 hm.put(str.charAt(i), new CountIndex(i));
             }
                  
         }    
     }
      
    /* The method returns index of first non-repeating
       character in a string. If all characters are repeating 
       then returns -1 */
     int firstNonRepeatingCharacter(String str)
    {
        getCharCountArray(str);
        int result = Integer.MAX_VALUE, i=0;
      
        Iterator it = hm.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry<Character, CountIndex> pair = (Map.Entry)it.next();
	        if (pair.getValue().count==1 && result > pair.getValue().index)	        	
	        { 
	        	result = pair.getValue().index;
	        	
	         }
	        //it.remove(); // avoids a ConcurrentModificationException
	        i++;
	    }
       System.out.println("The value of i =  "+i+" and length of string is = "+str.length());
      return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String str = "Yrishii#Ynaharsnx";
	  int index = new FirstNonRepeatingCharacter().firstNonRepeatingCharacter(str);
	  
	  System.out.println(index == -1 ? "Either all characters are repeating or string " +
              "is empty" : "First non-repeating character is " +  str.charAt(index));
	 
	 }		
	}



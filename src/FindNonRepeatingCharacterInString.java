import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class FindNonRepeatingCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String STR1 = "qlrishiiYnaharsnx";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		int resultIndex =0;
			for(int i=0;i<STR1.length();i++)
			{   
				char temp = STR1.charAt(i);
				if (map.containsKey(temp))
					{ 
					  int value = (int) map.get(temp);
					  map.put(temp, ++value);
					}
				else
					{
					  map.put(temp, 1); 	
					}
			 }
			/*for(int i=0;i<STR1.length();i++)
				{
				if (map.containsKey(STR1.charAt(i)))
				  { 
					int value = (int) map.get(STR1.charAt(i));
					if (value==1)
					 {
						System.out.println("The non repeating character is  = "+ STR1.charAt(i));
					    break;
					 } 
				  }
				}*/
			
			//iterating over Hashmap as hashmap may be small in size than the large repetative string.
			Iterator it = map.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        if ((int) pair.getValue() == 1)
		        { System.out.println("The non repeating character is = "+ pair.getKey());
		          break;
		         }
		        it.remove(); // avoids a ConcurrentModificationException
		    }
				
			}
		}
		




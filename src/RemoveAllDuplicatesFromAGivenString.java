
public class RemoveAllDuplicatesFromAGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String input ="RISHINAHAR";
      //USE hashMap
      // Create a hashmap for atoz and A toZ
      // for each element in string , if character found remove the character from hashmap 
      // add up the character to a string variable
      // else do nothing
      
      
      // alternate solution
		String result ="";
		String temp ="" ;
	for (int i=0 ; i< input.length(); i++)
	{
		
		temp = input.charAt(i)+"";
		
		if(!result.contains(temp))
		{
			result+= temp;
		}
		
	}
      System.out.println(" The non repeating string is " +result);
      
	}

	
	
}

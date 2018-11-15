
public class ConvertSetOfStringsInNumberToPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 String input = "ffff"; 
		 System.out.println(ConvertSetOfStringsInNumberToPhone(input));
	}
	
	public static String ConvertSetOfStringsInNumberToPhone (String input)
	{   int i=0;
		String output ="";
	    while (i<input.length())
	    {   
	    	char num = input.charAt(i);
	    	System.out.print(num +" ");
	        i++;
			switch(num)
		      {
		         case 'a'|'b'|'c' :
		        	  output+=2;
		              break;
		         case 'd'|'e'|'f' :
		        	  output+=3;
		              break;		         
		         /*case 'g'|'h'|'i' :
		        	  output+=4;
		              break;
		         case 'j'|'k'|'l' :
		        	  output+=5;
		              break;
		         case 'm'|'n'|'0' :
		        	  output+=6;
		              break;
		         case 'p'|'q'|'r'|'s' :
		        	  output+=7;
		              break;
		         case 't'|'u'|'v' :
		        	  output+=8;
		              break;
		         case 'w'|'x'|'y'|'z':
		        	  output+=9;
		              break;*/
		         default :
		            System.out.println("Invalid grade");
		      }
	    }	
		return output;
		
	}
}

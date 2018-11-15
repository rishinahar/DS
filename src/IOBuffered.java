import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class IOBuffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  thisLine = null;
			      try{
			         // open input stream test.txt for reading purpose.
			         BufferedReader br = new BufferedReader(new FileReader("/Users/rnahar/Desktop/DataStructures.txt"));
			         BufferedWriter wr = new BufferedWriter(new FileWriter("/Users/rnahar/Desktop/DataStructures2.txt"));
			         
			         while ((thisLine = br.readLine()) != null) {
			            System.out.println(thisLine);
			            wr.write(thisLine);
			            wr.write("\n");
			         }       
			         
			         wr.close();
			         /*PrintWriter out
			         = new PrintWriter(new BufferedWriter(new FileWriter("foo.out")));*/
			         
			      }catch(Exception e){
			         e.printStackTrace();
			      }
	}

}

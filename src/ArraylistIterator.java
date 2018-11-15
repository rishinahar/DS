import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ArraylistIterator {

	public static void main(String args[]){  
		  
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Amit");  
		al.add("Vijay");  
		al.add("Kumar");  
		al.add(1,"Sachin");  
		  
		System.out.println("element at 2nd position: "+al.get(2));  
		  
		ListIterator<String> itr=al.listIterator();  
		HashMap mp = new HashMap();
		mp.put("1", "Rishi");
		
		mp.containsKey("1");
		Iterator it1 = mp.entrySet().iterator();
		

		System.out.println(mp.get("1"));
		
		System.out.println("traversing elements in forward direction...");  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		 }  

		
		// create list
				List<String> crunchifyList = new ArrayList<String>();
		 
				// add 4 different values to list
				crunchifyList.add("eBay");
				crunchifyList.add("Paypal");
				crunchifyList.add("Google");
				crunchifyList.add("Yahoo");
		 
				// iterate via "for loop"
				System.out.println("==> For Loop Example.");
				for (int i = 0; i < crunchifyList.size(); i++) {
					System.out.println(crunchifyList.get(i));
				}
		 
				// iterate via "New way to loop"
				System.out.println("\n==> Advance For Loop Example..");
				for (String temp : crunchifyList) {
					System.out.println(temp);
				}
		 
				// iterate via "iterator loop"
				System.out.println("\n==> Iterator Example...");
				Iterator<String> crunchifyIterator = crunchifyList.iterator();
				while (crunchifyIterator.hasNext()) {
					System.out.println(crunchifyIterator.next());
				}
		 
				// iterate via "while loop"
				System.out.println("\n==> While Loop Example....");
				int i = 0;
				while (i < crunchifyList.size()) {
					System.out.println(crunchifyList.get(i));
					i++;
				}
		 
				
}
}
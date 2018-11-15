import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


public class wavepattern {
 
	/*public static ArrayList<Integer> wave(ArrayList<Integer> a) {
	    
		    int i =0;
			Iterator<Integer> ls  = a.iterator();
			int size = a.size();
			int ax[] = new int[size] ;
			while (ls.hasNext())
			{  
				ax[i] = ls.next();
				i++;
			}
			 Arrays.sort(ax);
			 i=0;
			 int j=0;
			 int temp=0;
		 while (j < ax.length-1)
		 {		 
			 if (i % 2==0)
				{
				   if ( ax[j] < ax[j+1])
				   {
					   temp = ax[j];
				       ax[j] = ax[j+1];
				       ax[j+1] = temp;
				   }
				}
			   else 
			   {
				   if ( ax[j] > ax[j+1])
				   {
					  temp = ax[j];
			          ax[j] = ax[j+1];
			          ax[j+1] = temp;
				   }
			   }
			j++; 
		 } 
		 ArrayList<Integer> a2 = new ArrayList<Integer>();
		   for(int k=0; k<ax.length;k++)
			   a2.add(ax[k]);
		    
			return a2;
	} */
	public static void main (String a[])
	{  		ArrayList<Integer> a1 = new ArrayList<>();
	        a1.add(5);
	        a1.add(1);
	        a1.add(3);
	        a1.add(2);
	        a1.add(4);
	        a1 = wave(a1);
			Iterator<Integer> ls  = a1.iterator();
			while (ls.hasNext())
			{
				System.out.print(ls.next());
			}
			
			
	}
	

public static ArrayList<Integer> wave(ArrayList<Integer> A) {
	    
	    Collections.sort(A);
	    int n = A.size();
	    
	    for (int i = 2; i <= n; i += 2) {
	        exch(A, i - 2, i - 1);
	    }
	    
	    return A;
	    
	}
	
	private static void exch(ArrayList<Integer> A, int i, int j) {
	    int temp = A.get(i);
	    A.set(i, A.get(j));
	    A.set(j, temp);
	}

/*public class Solution {
	public static ArrayList<Integer> wave(ArrayList<Integer> A) {
	    
	    Collections.sort(A);
	    int n = A.size();
	    
	    for (int i = 2; i <= n; i += 2) {
	        exch(A, i - 2, i - 1);
	    }
	    
	    return A;
	    
	}
	
	private void exch(ArrayList<Integer> A, int i, int j) {
	    int temp = A.get(i);
	    A.set(i, A.get(j));
	    A.set(j, temp);
	}
	
}

*/

}
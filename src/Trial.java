
import java.util.*;
import java.lang.*;
import java.io.*;
/*
class ABC {
	private ArrayList<Integer> arr;
	
	ABC(ArrayList<Integer> arr) {
		this.arr = arr;
	}
	
	public int getItem(int index) {
		return arr.get(index);
	}
}*/

class test
{
	public static void main (String[] args) 
	{	    
	    System.out.println ();
	    int i=0;
	    while (i!= 10)
	    	if(i%2 != 0)
	    		System.out.println("Odd number "+ i++);
	    	else
	    		System.out.println("Even number "+i++);
	    
	    for (i=0;i<5;++i)
	    	System.out.print(i+" ");
	    
		//write some code here to know the size of array list used in ABC.
		// we can assume that somehow array list is initalized but we dont know the size. 
	}
}
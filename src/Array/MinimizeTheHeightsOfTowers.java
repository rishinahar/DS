package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimizeTheHeightsOfTowers {

	public static int minDiffOfHeights(ArrayList<Integer> alist, int diffFactor,int numMinm , int numMaxm)
	{
		
		int numMin = numMinm; 
		numMin +=diffFactor;
		
		int numMax = numMaxm;
		numMax = numMax-diffFactor;
		
		return numMax - numMin ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int numOfTestcases = sc.nextInt();
      int i=0;
      while (i != numOfTestcases)
      {
    	  int diffFactor =  sc.nextInt();
    	  int arrayLength = sc.nextInt();
    	  ArrayList<Integer> alist = new ArrayList<>();
    	  int minNum = Integer.MAX_VALUE;
	      int maxNum = Integer.MIN_VALUE;
	      
	     for (int j=0; j<arrayLength;j++)
    	  {   
    	      
    	      int num = sc.nextInt();
    	      
    	      if (num > maxNum)
    	    	  maxNum = num;
    	      if (num < minNum)
    	    	  minNum = num;
    		  alist.add(num);
    	  }
    	  System.out.println(" The difference is "+minDiffOfHeights(alist,diffFactor,minNum,maxNum));
    	  i++;
      }
	}

}

package Array;

import java.util.HashMap;


public class arrayMajorityElement {
	public static void main (String a[]) 
	  {
	     	int asd[] ={3 ,3 ,4 ,2 ,4 ,4 ,2 ,4 ,4};
	     	 
	     	int majelement =asd[0];
	     	int count =1;
            ///Voting  Method
	     	for (int i=1 ;i<asd.length;i++)
	     	  {
	     		if (majelement==asd[i])
	     	     {
	     			count++;
	     	     }
	     		else
	     			 count--;
            
	     		if (count ==0)
	     		  { 
	     			count=1;
	     			majelement= asd[i];
	     		   }

	     		  
	     	  }
	     	  count= 0;
	     	/// finding if candidate has majority
	     	  Boolean flag = false;
	     	for (int i=0 ;i<asd.length;i++)
	     	{
	     		if (majelement == asd[i])
	     		  {
	     			count++;
	     			if (count >asd.length/2)
	     			{
	     				  System.out.println("The Major element is "+majelement);
	     				  flag= true;
	     				  break;
	     			}
	     		  }
	     	}

	     	if (!flag)
				  System.out.println("There is no element with majority ");

	     	///Hashing Method

	     	/*HashMap<Integer, Integer> msd = new HashMap<>();
	     	for (int i=0 ;i<asd.length;i++)
	     	 
	     	  {   
	     		 int count=1;
	     	        
	     	     if (msd.containsKey(asd[i]))
	     	       {
	     	    	  count = msd.get(asd[i]);
	     	    	 if(count >= asd.length/2)
		     		    {
		     			  System.out.println("The Major element is "+asd[i]);
		     			   return;
		     		    } 
	     	    	   count++;
	     	           msd.put(asd[i], count);
	     	       }
	     	     else
	     	           msd.put(asd[i], count);
	     	 
	     	   }
			  System.out.println("There is NONE Major element  "); */
	     	
              ///Naive Method
	     	
	     	/*for (int i=0 ;i<asd.length;i++)
	     	 {  int count=0;
	     		for (int j=i ;j<asd.length;j++)
	     		  {
	     			   if (asd[i]==asd[j])
	     			   {
	     				   count++;
	     			   }
	     		  }
	     		  if(count > asd.length/2)
	     		    {
	     			  System.out.println("The Major element is "+asd[i]);
	     			   return;
	     		    } 
	     	 }*/ 
	  }
}

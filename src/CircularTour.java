
public class CircularTour {

	
	static int tour(int p[],int n)
	{
	   //Your code here
		
		int index = -1;
		
		int petrol =-1;
		int distance = -1;
		int remain = 0;
		
		int j=0;
		while (true)
		{
			if (remain >=0 && j ==index)
				break;

			if (p[j]>p[j+1])
			{  
				if (index ==-1 || remain <=0)
				   index = j;
			    else if (index !=-1 && remain <=0)
				   {
			    	 j = index+2;
			    	 index = j;
				   }

				petrol = p[j];
				distance = p[j+1];
				remain += petrol - distance;
		  }
		else 
			{
			petrol = p[j];
			distance = p[j+1];
			remain += petrol - distance;
			
			}
			
		  if (j== n-1)
			  j=0;
		  
		  j= j+2;
		}
		
		return index;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[] ={4, 6, 6, 5, 7, 9 , 6, 4}; 
	
      System.out.println(tour (a, 7));
    
	}

}

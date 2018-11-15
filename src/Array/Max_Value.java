package Array;

public class Max_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a1[] = {9, 15, 4, 12, 13};
     int max =Integer.MIN_VALUE;
 	 int min = Integer.MAX_VALUE;
 	 
     for (int i=0;i<a1.length;i++)
     {
    	 a1[i]= a1[i]-i;
     }
     for (int i=0;i<a1.length;i++)
     {
       if (a1[i]> max)
    	   { 
    	     max = a1[i];
    	   }
       else if (a1[i]<min)
	       {
	    	   min = a1[i];
	       }
    	   
     }
	System.out.println(max+" "+min + "and resulted max value is "+ (max -min));
	}

}

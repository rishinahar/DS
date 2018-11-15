package Array;

import java.util.Arrays;

public class Tic_Tac_Toe {
   // Not working missing some corner cases e.x 
	// 1 0 0 
	// 1 0 1 
	// 1 0 1
	public static boolean validateInput(int a[])
	{  
				
				int count1 = 0;
		        int count0 = 0;
		        int count =0;
			
				for (int i=0; i<a.length;i++)
				{
					if (a[i]==0)
						++count1;
					else
						++count0;
					
					if (i< a.length-2)
					{
						if (a[i]== a[i+1] && a[i+1]== a[i+2])
							++count;
							
					}
					
				}
				
				if (count1 - count0 != 1)
					return false;
				if (count > 1)
					return false;
				
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String intput = "X X O O X O O O O";
		
		int max_a = 9;
	    int a[] = new int[max_a];
		for (int i=0; i<max_a;i++)
			a[i] = (int) Math.round(Math.random());

		System.out.println(Arrays.toString(a));
		System.out.println(validateInput(a));
		
	}

}

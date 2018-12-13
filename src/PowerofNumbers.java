
public class PowerofNumbers {
	
	static boolean powerofNumbers(int input)
	{ 
	 boolean result = false;
	double n = input;
	 while (n!=0)
	 {  
		 if ( n==1)
			 return true;
		  
		 n = n/2;
		 
	 }
	 return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int powerOf = 2;
     System.out.println(powerofNumbers(1024));
	}

}

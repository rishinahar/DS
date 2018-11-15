
public class PowerFunctionofNumbers {
	public  class Result 
	{
	    double result;
	}
	
	 double powerofNumbers2Way(int input , double power , Result res)
	{
		double newresult = input;
		 int currentPower =1;
		 
		 while(currentPower<power)
		 {  
			 if (currentPower+currentPower < power)
			 {
				 newresult = newresult*newresult;
				 currentPower =currentPower+currentPower;
			 }
			 
			 else
				 break;
		 }
		 res.result = res.result * newresult;
		 return  power-currentPower;
	}
	
	 double powerofNumbers(int input , int power)
	{ 
	 Result res= new Result();
	 res.result=1;
	 double diffPower =1;
	 
	 diffPower = powerofNumbers2Way(input ,  power , res);
	 
	 while (diffPower != 1)
	 {
		 diffPower =  powerofNumbers2Way(input ,  diffPower , res);
	 } 
	 
	 
	 res.result = res.result*input;	
	 return res.result;
	}

	 int power(int x,  int y)
	 {
	 	int temp;
	 	if( y == 0)
	 		return 1;
	 	temp = power(x, y/2);
	 	if (y%2 == 0)
	 		return temp*temp;
	 	else
	 		return x*temp*temp;
	 }

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int powerOf = 2;
     System.out.println(new PowerFunctionofNumbers().powerofNumbers(2 , 11));
     System.out.println(new PowerFunctionofNumbers().power(2 , 11));

	}

}

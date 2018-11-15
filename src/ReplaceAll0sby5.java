
public class ReplaceAll0sby5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 10001;
		 
		System.out.println("The number to be converted is = " + num +" and it is converted to =>" +convert0sby5(num));
	
	}
	
	public static int  convert0sby5(int num)
	{
		if (num == 0)
		{
			return 5;
		}
		
		return replaceAll0sby5(num);
	}
	
	public static int  replaceAll0sby5(int num )
	{
		if (num == 0)
		{
			return 0;
		}

		int digit = num % 10 ;
		
		if (digit == 0)
			digit = 5;
		
		return replaceAll0sby5(num/10)*10+digit;
	}
}

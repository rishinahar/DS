package selfRecurssion;

public class SelfRecurssion {

	public static void test()
	{
		Error errors = new Error("Custom errror");
		errors.getStackTrace();
	}
	public static void recurssion()
	{  
		recurssion();
	}
	
	public static void main (String a[])
	{
		test();
		recurssion();
	}
}

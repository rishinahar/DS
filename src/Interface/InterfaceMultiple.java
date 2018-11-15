package Interface;
//A simple Java program to demonstrate multiple
//inheritance through default methods.
interface PI1
{
	// default method
	 void show();
	 void show2();

}

interface PI2 extends PI1
{
	// Default method
	 void show();
	
}

//Implementation class code
class InterfaceMultiple implements PI2
{
	// Overriding default show method
	public void show()
	{

	}

	public static void main(String args[])
	{
	    
		InterfaceMultiple d = new InterfaceMultiple();
		d.show();
		System.out.println("hey");
	}


}



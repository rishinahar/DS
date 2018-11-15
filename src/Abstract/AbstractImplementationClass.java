package Abstract;

import java.util.HashMap;


public class AbstractImplementationClass extends AbstractA{
    
	AbstractImplementationClass ()
	{
		System.out.println( "Implementor class constructor ");
		
	}
	
	   void show()
	  {
			System.out.println(" hi show");
	  }

	   public static void main (String a [])
	{
		
		AbstractImplementationClass aI = new AbstractImplementationClass();
		//aI.show();
		
		HashMap map = new HashMap();
		map.put(aI,aI);
		
		 ((AbstractImplementationClass)map.get(aI)).show();
		//aI1.show();
	}
}

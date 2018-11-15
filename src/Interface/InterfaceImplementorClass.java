package Interface;

public class InterfaceImplementorClass implements InterfaceA , InterfaceB{
	
	public static void main (String a [])
	{
		InterfaceA va = new InterfaceImplementorClass();
		InterfaceB vb = new InterfaceImplementorClass();

		//InterfaceB ia = va;
		System.out.println(" hi "+InterfaceB.i);
		System.out.println(" hi InterfaceA "+va.i);
		System.out.println(" hi InterfaceB "+vb.i);

	}

}

package Inheritance;

import Interface.InterfaceB;

public class InheritanceExtendeingClass extends InheritanceB{

	public  static void ride()
	{
		System.out.println("Hello Team");
	}
	
	
	
	public static void main (String a [])
	{
		//InterfaceImplementorClass va = new InterfaceImplementorClass();
		//InterfaceB ia = va;
		InheritanceExtendeingClass c = new InheritanceExtendeingClass();
		System.out.println(c.hashCode());
		InheritanceExtendeingClass d = c;
		System.out.println(d.hashCode());
		if (d.equals(c))		
		System.out.println(" hi ");
		c.disp();
		
	}
}

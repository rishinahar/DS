package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
  
	public static void main (String a[])
	{
		Example1 ex = new Example1();
		System.out.println(ex.getClass().getName());		
		
		Method method;
		try 
		{
			method = ex.getClass().getMethod("print");
			method.invoke(ex);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}			
	
		Class<?> c;
		try {
			c = Class.forName("Reflection.Example1");
			Class[] cArg = new Class[1];
	        cArg[0] = String.class	;
	        method = c.getDeclaredMethod ("print",cArg);
			method.invoke (ex, "String100");
			Field[] f = c.getDeclaredFields();
			for(Field s:f)
			{
				System.out.println(s);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	
	}
	
		
}


class Example1 {
	int i;
	String j;
	public void print()
	{
		System.out.println("Print without args" );
	}
	public void print(String a )
	{
		System.out.println(a);
	}
}
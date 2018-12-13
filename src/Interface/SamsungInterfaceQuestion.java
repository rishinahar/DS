package Interface;

public class SamsungInterfaceQuestion {


	public static void main(String []args) {
	  I i = (I) new A();
	  B b =  (B) new B(); // 
	  A a = b; // 
	  
	  i.m1(); //A.m1
	  a.m1(); //B.m1
	  
	  I i2 = (I) new B();
	  A a2 =  (A)i2;
	  a2.m1();//B.m1
	}
}

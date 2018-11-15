
public class SingletonDemo {

   private static SingletonDemo singleton = new SingletonDemo( );

   /* A private Constructor prevents any other
    * class from instantiating.
    */
   private SingletonDemo() { }

   /* Static 'instance' method */
   public static SingletonDemo getInstance( ) {
      return singleton;
   }

   /* Other methods protected by singleton-ness */
   protected static void demoMethod( ) {
      System.out.println("demoMethod for singleton");
   }
}

 class Singleton {

	   public static void main(String[] args) {
	      SingletonDemo tmp = SingletonDemo.getInstance( );
	      tmp.demoMethod( );
	   }
	}
 
 /*The inner class is referenced no earlier (and therefore loaded no earlier by the class loader) than the moment that getInstance() is called. Thus, this solution is thread-safe without requiring special language constructs (i.e. volatile or synchronized).

 public class Singleton {
   // Private constructor prevents instantiation from other classes
   private Singleton() {}
  
   *//**
    * SingletonHolder is loaded on the first execution of Singleton.getInstance() 
    * or the first access to SingletonHolder.INSTANCE, not before.
    *//*
   private static class SingletonHolder { 
     private static final Singleton INSTANCE = new Singleton();
   }

   public static Singleton getInstance() {
     return SingletonHolder.INSTANCE;
   }
 }*/
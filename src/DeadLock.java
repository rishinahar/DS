
public class DeadLock {
   
	String str1 = "Java";
    String str2 = "UNIX";
     
    Thread trd1 = new Thread("My Thread 1"){
    	 public void run() {
             synchronized (str1) {
                System.out.println("Thread 1: Holding lock 1...");
                
                try { Thread.sleep(10); }
                catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for lock 2...");
                
                synchronized (str2) {
                   System.out.println("Thread 1: Holding lock 1 & 2...");
                }
             }
          }
    };
     
    Thread trd2 = new Thread("My Thread 2"){
    	public void run() {
            synchronized (str2) {
               System.out.println("Thread 2: Holding lock 2...");
               
               try { Thread.sleep(10); }
               catch (InterruptedException e) {}
               System.out.println("Thread 2: Waiting for lock 1...");
               
               synchronized (str1) {
                  System.out.println("Thread 2: Holding lock 1 & 2...");
               }
            }
         }
    };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLock mdl = new DeadLock();
        mdl.trd1.start();
        mdl.trd2.start();
		
	}

}

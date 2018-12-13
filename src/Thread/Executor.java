package Thread;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ExecutorService executorService = Executors.newFixedThreadPool(1);

		for (int i = 0; i < 10; i++) {
			executorService.execute(new Runnable() {
			    public void run() {
			        System.out.println(System.currentTimeMillis());
			    }
			});	
		}
		executorService.shutdown();
		
	
	ExecutorService executorService1 = Executors.newFixedThreadPool(10);

	
	Set<Callable<String>> callables = new HashSet<Callable<String>>();

	callables.add(new Callable<String>() {
	    public String call() throws Exception {
	        System.out.println(System.currentTimeMillis());
	        return "Task 1";
	    }
	});
	
	executorService1.invokeAll(callables);
	}	
}

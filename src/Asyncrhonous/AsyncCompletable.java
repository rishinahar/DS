package Asyncrhonous;


public class AsyncCompletable {
	
	public static void main (String a[])
	{
		CompletableFuture.supplyAsync(this::findReceiver)
        .thenApply(this::sendMsg)
        .thenAccept(this::notify);
		
	}

}

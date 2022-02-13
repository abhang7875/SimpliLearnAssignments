package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SyncStackTest {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		SyncStack s = new SyncStack();
		es.execute(new Producer(s));
		es.execute(new Consumer(s));
		es.shutdown();
		
		try {
			es.awaitTermination(5, TimeUnit.SECONDS);
		}catch(InterruptedException ex) {
			System.out.println("Terminated earlier than expected");
		}
	}
}

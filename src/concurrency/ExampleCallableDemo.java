package concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExampleCallableDemo {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		Future<String> f1 = es.submit(new ExampleCallable("one", 10));
		Future<String> f2 = es.submit(new ExampleCallable("two", 20));
		try {
			es.shutdown();
			es.awaitTermination(5, TimeUnit.SECONDS);
			String result1 = f1.get();
			System.out.println("Result of "+result1);
			String result2 = f2.get();
			System.out.println("Result of "+result2);
		}catch (ExecutionException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

package concurrency;

import java.util.concurrent.Callable;

public class ExampleCallable implements Callable<String>{
	private final String name;
	private final int len;
	
	public ExampleCallable(String name,int len) {
		this.name = name;
		this.len = len;
	}

	@Override
	public String call() throws Exception {
		int sum = 0;
		for(int i=1;i<=len;i++)
			sum+= i;
		return name+": Sum = "+sum;
	}
	
	
}

package concurrency;

public class ExampleRunnable implements Runnable{
	private final String name;
	
	public ExampleRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.println(name+"-i = "+i);
	}
	
}

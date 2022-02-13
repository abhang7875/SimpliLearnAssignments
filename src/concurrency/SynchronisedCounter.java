package concurrency;

public class SynchronisedCounter {
	private static int i = 0;
	
	public synchronized void increase() {
		i++;
	}
	
	public synchronized void decrease() {
		i--;
	}
	
	public synchronized int getValue() {
		return i;
	}
}

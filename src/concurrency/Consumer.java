package concurrency;

public class Consumer implements Runnable {
	
	private SyncStack theStack;
	
	public Consumer(SyncStack s) {
		theStack = s;
	}
	
	@Override
	public void run() {
		char c;
		for(int i=0;i<10;i++) {
			try {
				c = theStack.pop();
				Thread.sleep((int)Math.random() * 300);
				System.out.println("Char popped: "+c);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}

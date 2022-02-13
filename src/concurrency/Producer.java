package concurrency;

public class Producer implements Runnable {
	
	private SyncStack theStack;
	
	public Producer(SyncStack s) {
		theStack = s;
	}
	
	@Override
	public void run() {
		char c;
		for(int i=0;i<10;i++) {
			try {
				c = (char)((int)Math.random()*26+'A');
				theStack.push(c);
				Thread.sleep((int)Math.random() * 300);
				System.out.println("Pushed char: "+c);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}

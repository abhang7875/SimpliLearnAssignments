package concurrency;

public class SharedValue {
	//potentially shared variable
	private int i;
	
	//local variables, method parameters, Exception objects are not shared
	
	public int getNext() {
		return i++;
	}
}

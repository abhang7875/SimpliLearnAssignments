
public class TypeCasingAssignment {
	public static void main(String[] args) {
		//implicit conversion
		System.out.println("Implicit Type Casting");
		char a = 'A';
		System.out.println("Value of a: "+a);
		//converting char to int
		int b = a;
		System.out.println("Value of b: "+b);
		//converting char to float
		float c = a;
		System.out.println("Value of c: "+c);
		//converting char to long
		long d = a;
		System.out.println("Value of d: "+d);
		//converting char to double
		double e = a;
		System.out.println("Value of e: "+e);
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting: ");
		double x = 45.5;
		int y = (int) x;
		System.out.println("Value of x: "+x);
		System.out.println("Value pf y: "+y);
	}
}

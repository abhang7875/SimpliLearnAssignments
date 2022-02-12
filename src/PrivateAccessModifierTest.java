
class PrivateAccessModifier {
	private void display() {
		System.out.println("Testing Private access modifier");
	}
}

public class PrivateAccessModifierTest {
	public static void main(String[] args) {
		System.out.println("Private Access Modifier Test: ");
		PrivateAccessModifier pvt = new PrivateAccessModifier();
		//below line will give an error
		//pvt.display();
	}
}

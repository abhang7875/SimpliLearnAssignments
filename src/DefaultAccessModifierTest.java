
class DefaultAccessModifier {
	void display() {
		System.out.println("Testing Default access modifier");
	}
}

public class DefaultAccessModifierTest {
	public static void main(String[] args) {
		System.out.println("Deafult Access Modifier Test: ");
		DefaultAccessModifier def = new DefaultAccessModifier();
		def.display();
	}
}

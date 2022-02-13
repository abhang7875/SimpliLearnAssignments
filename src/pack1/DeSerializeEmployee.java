package pack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeEmployee {
	public DeSerializeEmployee() {
		try (ObjectInputStream fout = new ObjectInputStream(new FileInputStream("employee.ser"))){
			Employee e = (Employee) fout.readObject();
			System.out.println(e);
		}catch(IOException iox) {
			System.out.println(iox.getMessage());
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		new DeSerializeEmployee();
	}
}

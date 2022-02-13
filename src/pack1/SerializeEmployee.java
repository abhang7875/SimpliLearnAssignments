package pack1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
	public SerializeEmployee() {
		Employee e = new Employee(1,"Nilesh");
		try (ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream("employee.ser"))){
			fout.writeObject(e);
		}catch(IOException iox) {
			System.out.println(iox.getMessage());
		}
	}
	public static void main(String[] args) {
		new SerializeEmployee();
	}
}

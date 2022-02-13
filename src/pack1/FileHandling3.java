package pack1;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling3 {
	public static void main(String[] args) {
		try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("byte-data")))) {
			int data = 2000;
			out.write(data);
			out.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

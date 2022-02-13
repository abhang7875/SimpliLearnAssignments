package pack1;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileHandling4 {
	public static void main(String[] args) {
		try(DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("byte-data")))) {
			int data = in.read();
			System.out.println("Data: "+data);
			in.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

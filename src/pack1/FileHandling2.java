package pack1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 {
	public static void main(String[] args) {
		char c[] = new char[128];
		try(FileReader fis = new FileReader("file1");
				FileWriter fout = new FileWriter("file2")) {
			int count=0;
			int read =0;
			while((read = fis.read(c))!=-1) {
				fout.write(c);
				count += read;
			}
			System.out.println("characters written: "+count);
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

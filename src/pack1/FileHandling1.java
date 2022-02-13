package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling1 {
	public static void main(String[] args) {
		byte b[] = new byte[128];
		try(FileInputStream fis=new FileInputStream("file1");
				FileOutputStream fout=new FileOutputStream("file2")) {
			System.out.println("Bytes available: "+fis.available());
			int count=0;
			int read =0;
			while((read = fis.read(b))!=-1) {
				fout.write(b);
				count += read;
			}
			System.out.println("Bytes written: "+count);
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
